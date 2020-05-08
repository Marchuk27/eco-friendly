let categoryCompaniesDict = [];

map = null;
jsonResponse = null;
geoObjects = [];
geoObjectsCollections = [];

clusterer = null;
clustererObjectsStorage = [];

firstChoose = true;

typeOfWasteList = [
    {typeOfWaste: "Пластик", preset: "islands#orangeIcon", id: "plastic", color: "#ECA842", image:"/images/cat-plastic.png"},
    {typeOfWaste: "Стекло", preset: "islands#greenIcon", id: "glass", color: "#4E9F5B", image:"/images/cat-glass.png"},
    {typeOfWaste: "Бумага", preset: "islands#blueIcon", id: "paper", color: "#72B1D4", image:"/images/cat-paper.png"},
    {typeOfWaste: "Одежда", preset: "islands#yellowIcon", id: "clothes", color: "#D3C652", image:"/images/cat-clothes.png"},
    {typeOfWaste: "Батарейки", preset: "islands#pinkIcon", id: "accums", color: "#B7739C", image:"/images/cat-accums.png"},
    {typeOfWaste: "Бытовая", preset: "islands#nightIcon", id: "techn", color: "#598487", image:"/images/cat-techn.png"},
    {typeOfWaste: "Металл", preset: "islands#brownIcon", id: "metal", color: "#C2997A", image:"/images/cat-metal.png"},
    {typeOfWaste: "Опасные", preset: "islands#redIcon", id: "dangerous", color: "#BA576F", image:"/images/cat-danger.png"},
    {typeOfWaste: "Иное", preset: "islands#violetIcon", id: "other", color: "#6255B6", image:"/images/cat-other.png"}
];

ymaps.ready(init);

let heightOfHeader = 35;
let partOfScreen = 304; /*window.innerHeight - window.innerHeight / 3; heightOfNav*/

document.addEventListener('DOMContentLoaded', function(e){
    let typesOfWaste = document.getElementsByClassName("type-of-waste");

    let nav = document.getElementsByTagName("nav")[0];
    nav.addEventListener("touchmove", e => {
        let touch = e.touches[0];
        let y = touch.clientY;
        if(y < window.innerHeight-partOfScreen){
            y = window.innerHeight-partOfScreen;
        }
        if(y > window.innerHeight - heightOfHeader)
        {
            y = window.innerHeight - heightOfHeader;
        }
        nav.style.top = y + "px";
    });

    setTypeOfWasteOnClickEvents(Array.from(typesOfWaste));
});

function init() {
    map = new ymaps.Map("map", {
        center: [56.84, 60.601571]/*[56.788751, 60.601571]*/,
        zoom: 12
    }, {
        restrictMapArea: [[56.999959, 60.125085],[56.609430, 61.063112]],
        searchControlProvider: 'yandex#search'
    });
    /*clusterer = new ymaps.Clusterer({
        clusterIconLayout: 'default#pieChart',
        // Радиус диаграммы в пикселях.
        clusterIconPieChartRadius: 25,
        // Радиус центральной части макета.
        clusterIconPieChartCoreRadius: 10,
        // Ширина линий-разделителей секторов и внешней обводки диаграммы.
        clusterIconPieChartStrokeWidth: 3,
        groupByCoordinates: true,
        clusterDisableClickZoom: true,
        visible: false
    })*/

    fetch("/category/?category=1&category=2&category=3&category=4&category=5&category=6&" +
        "category=7&category=8&category=9")
        .then(response => response.json())
        .then((json)=>{
            jsonResponse = json;
            let keys = Object.keys(jsonResponse);
            keys.forEach(el => categoryCompaniesDict.push({typeOfWaste: el, companyInfo: jsonResponse[el]}));
            setMapGeoObjects(categoryCompaniesDict);
            /*let array = [];
            geoObjects.forEach(el => array.push(el.geoObject));
            clusterer.add(array);
            map.geoObjects.add(clusterer);
            clusterer.getGeoObjects().forEach(geoObject => clustererObjectsStorage.push(geoObject));*/
        });
}

function setTypeOfWasteOnClickEvents(typesOfWaste){
    typesOfWaste.forEach(el=>{
        el.addEventListener("click", (e)=>{
            if(firstChoose){
                geoObjectsCollections.map(el=>el.collection).forEach(el=>el.options.set("visible", false));
                firstChoose=false;
            }
            if(document.querySelector(".offering")!==null)
            {
                let offering = document.querySelector(".offering");
                offering.remove();
            }
            el.firstElementChild.classList.toggle("selected");
            let category = typeOfWasteList.find(o=>o.id == el.id);
            let typeOfWaste = category.typeOfWaste;
            let color = category.color;
            //clustererObjectsStorage.forEach(geoObject => {
            geoObjectsCollections.map(el=>el.collection).forEach(geoObject=>{
                if(geoObject.options.get("iconColor")==color){
                    if(geoObject.options.get("visible")){
                        geoObject.options.set("visible", false);
                        //clusterer.remove(geoObject);
                    }
                    else{
                        geoObject.options.set("visible", true);
                        //clusterer.add(geoObject);
                    }
                }
            });
        });
    });
}

function setMapGeoObjects(groups){
    if(groups != undefined)
    {
        for (let i = 0; i < groups.length; i++)
        {
            let color = typeOfWasteList.find(o=>o.typeOfWaste == groups[i].typeOfWaste).color;
            let collection = new ymaps.GeoObjectCollection(groups[i].companyInfo, {
                preset: 'islands#icon',
                iconColor: color,
                visible: true
            });

            for (let j = 0; j < groups[i].companyInfo.length; j++) {

                if (groups[i].companyInfo[j].address.length == 0) {
                    continue;
                }

                let phoneInfo = "";
                if(groups[i].companyInfo[j].phone === undefined || groups[i].companyInfo[j].phone.length == 0)
                {
                    phoneInfo = "Компания не предоставила данные";
                }
                else{
                    phoneInfo = groups[i].companyInfo[j].phone[0].phone;
                }

                let emailInfo = "";
                if(groups[i].companyInfo[j].email === undefined || groups[i].companyInfo[j].email.length == 0)
                {
                    emailInfo = "Компания не предоставила данные";
                }
                else{
                    emailInfo = groups[i].companyInfo[j].email[0].email;
                }

                // console.log(i, j,
                //     groups[i].companyInfo[j].address[0].latitude, groups[i].companyInfo[j].address[0].longitude);
                for(let k = 0; k < groups[i].companyInfo[j].address.length; k++){
                    let item = new ymaps.Placemark([groups[i].companyInfo[j].address[k].latitude, groups[i].companyInfo[j].address[k].longitude],
                        {
                            balloonContentHeader: groups[i].companyInfo[j].name,
                            // balloonContentBody: "<b>Адрес: </b>" + groups[i].companyInfo[j].address[k].address + "<br>" +
                            //     "<b>Номер телефона: </b>" + phoneInfo + "<br>" +
                            //     "<b>Электронная почта: </b>" + emailInfo,
                            hintContent: groups[i].companyInfo[j].name
                        },
                        { iconColor: color/*, visible: true*/});
                    collection.add(item);
                    geoObjects.push({
                        name: groups[i].companyInfo[j].name,
                        itemInfo: groups[i].companyInfo[j],
                        geoObject: item,
                    });
                }
            }
            map.geoObjects.add(collection);
            geoObjectsCollections.push({
                typeOfWaste: groups[i].typeOfWaste,
                collection: collection
            })
        }
        setGeoObjectsEvents();
    }
}

function showCompanyContainer(){
    let company = document.getElementsByClassName("company")[0];
    let companyStyle = window.getComputedStyle(company, null);
    if(companyStyle.visibility=="hidden"){
        company.style.visibility="visible";
    }
    if(companyStyle.display=="none"){
        company.style.display="block";
    }
}

function setGeoObjectsEvents(){
    for (let i = 0; i < geoObjects.length; i++) {
        geoObjects[i].geoObject.events.add("click", function(e){
            if(document.querySelector(".offering")!==null)
            {
                let offering = document.querySelector(".offering");
                offering.remove();
            }
            setCompanyContainerInfo(geoObjects[i].itemInfo);
            //Показать балун метки или кластера
            /*var geoObjectState = clusterer.getObjectState(geoObjects[i].geoObject);
            if (geoObjectState.isShown) {
                if (geoObjectState.isClustered) {
                    geoObjectState.cluster.state.set('activeObject', geoObjects[i].geoObject);
                    geoObjectState.cluster.balloon.open();
                } else {
                    geoObjects[i].geoObject.balloon.open();
                }
            }*/
        });
    }
}

function setCompanyContainerInfo(company){
    /*let name=company.name;
    let address=company.address.filter(el => el.address !== " ").map(el=>el.address).filter((el, index, array) => array.indexOf(el)==index);
    let email=company.email.filter(el => el.email !== " ").map(el=>el.email).filter((el, index, array) => array.indexOf(el)==index);
    let phone=company.phone.filter(el => el.phone !== " ").map(el=>el.phone).filter((el, index, array) => array.indexOf(el)==index);
    let categories=company.category.filter(el => el.category !== " ").map(el=>el.name).filter((el, index, array) => array.indexOf(el)==index);*/
    let cmp = {
        name : company.name,
        address : company.address.filter(el => el.address !== " ").map(el=>el.address).filter((el, index, array) => array.indexOf(el)==index),
        email : company.email.filter(el => el.email !== " ").map(el=>el.email).filter((el, index, array) => array.indexOf(el)==index),
        phone : company.phone.filter(el => el.phone !== " ").map(el=>el.phone).filter((el, index, array) => array.indexOf(el)==index),
        categories : company.category.filter(el => el.category !== " ").map(el=>el.name).filter((el, index, array) => array.indexOf(el)==index)
    };
    console.log(cmp);
    document.getElementsByClassName("company__name")[0].innerHTML = cmp.name;
    document.getElementsByClassName("company__address__value")[0].innerHTML = cmp.address.join("\n");
    document.getElementsByClassName("company__phone__value")[0].innerHTML = cmp.phone.join("\n");
    document.getElementsByClassName("company__email__value")[0].innerHTML = cmp.email.join("\n");
    addNewCategories(cmp.categories);
    showCompanyContainer();
}

function addСategories(categories){
    let container = document.getElementsByClassName("company__categories__list")[0];
    while (container.firstChild) {
        container.removeChild(container.firstChild);
    }
    if(categories == undefined)
    {
        return;
    }
    else {
        for (let i = 0, len = categories.length;  i < len; i++)
        {
            let item = document.createElement("div");
            item.className="company__categories__list__item";
            container.append(item);

            let logo = document.createElement("img");
            logo.className = "company__categories__list__item__logo";
            logo.alt = "logo";

            let label = document.createElement("div");
            label.className = "company__categories__list__item__label";
            label.innerHTML=categories[i];
            switch (categories[i]) {
                case "Пластик":
                {
                    logo.src="images/plasticLogo.png";
                    break;
                }
                case "Стекло":
                {
                    logo.src="images/glass.png";
                    break;
                }
                case "Бумага":
                {
                    logo.src="images/paper.png";
                    break;
                }
                case "Одежда":
                {
                    logo.src="images/clothes.png";
                    break;
                }
                case "Батарейки":
                {
                    logo.src="images/accums.png";
                    break;
                }
                case "Быт.техника":
                {
                    logo.src="images/techn.png";
                    break;
                }
                case "Металл":
                {
                    logo.src="images/metal.png";
                    break;
                }
                case "Опасное":
                {
                    logo.src="images/dangerous.png";
                    break;
                }
                case "Другое":
                {
                    logo.src="images/other.png";
                    break;
                }
                default:
                    break;
            }
            item.append(logo);
            item.append(label);
        }
    }
}

function addContacts(contacts){
    let container = document.getElementsByClassName("company__contacts__list")[0];
    while (container.firstChild) {
        container.removeChild(container.firstChild);
    }
    if(contacts === undefined)
    {
        return;
    }
    else{
        /*let categoriesDictionary = [
            {
                type: "ig",
                value:"images/ig-logo.png"
            },
            {
                type: "vk",
                value:"images/vk-logo.png"
            },
            {
                type: "wapp",
                value:"images/wapp-logo.png"
            },
            {
                type: "phone",
                value: "images/phone-logo.png"
            },
            {
                type: "web",
                value:"images/web-logo-2.png"
            }
        ];*/
        for (let i = 0, len=contacts.length; i < len; i++)
        {
            let item = document.createElement("div");
            item.className="company__contacts__list__item";
            container.append(item);

            let logo = document.createElement("img");
            logo.className = "company__contacts__list__item__logo";
            logo.alt = "logo";
            //logo.src = categoriesDictionary.find(o=>o.type===contacts[i].type).value;

            let value = document.createElement("div");
            value.className = "company__contacts__list__item__value";
            value.innerHTML=contacts[i].value;
            switch (contacts[i].type) {
                case "ig": {
                    logo.src="images/ig-logo.png"
                    break;
                }
                case "vk": {
                    logo.src="images/vk-logo.png"
                    break;
                }
                case "wapp": {
                    logo.src="images/wapp-logo.png"
                    break;
                }
                case "phone": {
                    logo.src="images/phone-logo.png"
                    break;
                }
                case "web": {
                    logo.src="images/web-logo-2.png"
                    break;
                }
                default:
                    break;
            }
            item.append(logo);
            item.append(value);
        }
    }
}

function addNewCategories(categories){
    let container = document.getElementsByClassName("company__categories__list")[0];
    while (container.firstChild) {
        container.removeChild(container.firstChild);
    }
    categories.forEach(el => {
        let item = document.createElement("div");
        item.className="company__categories__list__item";
            let image = document.createElement("img");
            image.src=typeOfWasteList.find(o=>o.typeOfWaste==el).image;
        item.append(image);
        container.append(item);
    });
}
