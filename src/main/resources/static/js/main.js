let newGroups = [];
map = null;
groups = null;
geoObjects = [];
geoObjectsCollections = [];
typeOfWastePresetList = [
    {typeOfWaste: "Пластик", preset: "islands#orangeIcon"},
    {typeOfWaste: "Стекло", preset: "islands#greenIcon"},
    {typeOfWaste: "Бумага", preset: "islands#blueIcon"},
    {typeOfWaste: "Одежда", preset: "islands#yellowIcon"},
    {typeOfWaste: "Батарейки", preset: "islands#pinkIcon"},
    {typeOfWaste: "Бытовая", preset: "islands#nightIcon"},
    {typeOfWaste: "Металл", preset: "islands#brownIcon"},
    {typeOfWaste: "Опасные", preset: "islands#redIcon"},
    {typeOfWaste: "Иное", preset: "islands#violetIcon"}
]
ymaps.ready(init);

let nav = null;

let heightOfHeader = 35;
let partOfScreen = 304;/*window.innerHeight - window.innerHeight / 3; heightOfNav*/

/*menu.addEventListener("touchstart", (e) => {
    let touch = e.touches[0];
    let y  = touch.clientY;
    console.log("touchStart", y);
});*/

document.addEventListener('DOMContentLoaded', function(e){
    let typesOfWaste = document.getElementsByClassName("type-of-waste");
    nav = document.getElementsByTagName("nav")[0];
    nav.addEventListener("touchmove", (e)=>{
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
        //console.log("touchMove", x);
    });
    Array.from(typesOfWaste).forEach(element => {
        switch (element.id) {
            case "plastic":
            {
                element.addEventListener("click", function(e){
                    let collection = geoObjectsCollections.find(o=>o.typeOfWaste=="Пластик").collection;
                    if(collection.options.get("visible")){
                        collection.options.set("visible", false);
                    }
                    else{
                        collection.options.set("visible", true);
                    }
                });
                break;
            }
            case "glass":
            {
                element.addEventListener("click", function(e){
                    let collection = geoObjectsCollections.find(o=>o.typeOfWaste=="Стекло").collection;
                    if(collection.options.get("visible")){
                        collection.options.set("visible", false);
                    }
                    else{
                        collection.options.set("visible", true);
                    }
                });
                break;
            }
            case "paper":
            {
                element.addEventListener("click", function(e){
                    let collection = geoObjectsCollections.find(o=>o.typeOfWaste=="Бумага").collection;
                    if(collection.options.get("visible")){
                        collection.options.set("visible", false);
                    }
                    else{
                        collection.options.set("visible", true);
                    }
                });
                break;
            }
            case "clothes":
            {
                element.addEventListener("click", function(e){
                    let collection = geoObjectsCollections.find(o=>o.typeOfWaste=="Одежда").collection;
                    if(collection.options.get("visible")){
                        collection.options.set("visible", false);
                    }
                    else{
                        collection.options.set("visible", true);
                    }
                });
                break;
            }
            case "accums":
            {
                element.addEventListener("click", function(e){
                    let collection = geoObjectsCollections.find(o=>o.typeOfWaste=="Батарейки").collection;
                    if(collection.options.get("visible")){
                        collection.options.set("visible", false);
                    }
                    else{
                        collection.options.set("visible", true);
                    }
                });
                break;
            }
            case "techn":
            {
                element.addEventListener("click", function(e){
                    let collection = geoObjectsCollections.find(o=>o.typeOfWaste=="Бытовая").collection;
                    if(collection.options.get("visible")){
                        collection.options.set("visible", false);
                    }
                    else{
                        collection.options.set("visible", true);
                    }
                });
                break;
            }
            case "metal":
            {
                element.addEventListener("click", function(e){
                    let collection = geoObjectsCollections.find(o=>o.typeOfWaste=="Металл").collection;
                    if(collection.options.get("visible")){
                        collection.options.set("visible", false);
                    }
                    else{
                        collection.options.set("visible", true);
                    }
                });
                break;
            }
            case "dangerous":
            {
                element.addEventListener("click", function(e){
                    let collection = geoObjectsCollections.find(o=>o.typeOfWaste=="Опасные").collection;
                    if(collection.options.get("visible")){
                        collection.options.set("visible", false);
                    }
                    else{
                        collection.options.set("visible", true);
                    }
                });
                break;
            }
            case "other":
            {
                element.addEventListener("click", function(e){
                    let collection = geoObjectsCollections.find(o=>o.typeOfWaste=="Иное").collection;
                    if(collection.options.get("visible")){
                        collection.options.set("visible", false);
                    }
                    else{
                        collection.options.set("visible", true);
                    }
                });
                break;
            }
            default:
                break;
        }
    });
});

function init() {
    map = new ymaps.Map("map", {
        center: [56.84, 60.601571]/*[56.788751, 60.601571]*/,
        zoom: 12
    }, {
        restrictMapArea: [[56.999959, 60.125085],[56.609430, 61.063112]],
        searchControlProvider: 'yandex#search'
    });
    // clusterer = new ymaps.Clusterer({
    //     clusterIconLayout: 'default#pieChart',
    //     // Радиус диаграммы в пикселях.
    //     clusterIconPieChartRadius: 25,
    //     // Радиус центральной части макета.
    //     clusterIconPieChartCoreRadius: 10,
    //     // Ширина линий-разделителей секторов и внешней обводки диаграммы.
    //     clusterIconPieChartStrokeWidth: 3,
    //     groupByCoordinates: false,
    //     clusterDisableClickZoom: true,
    //     clusterHideIconOnBalloonOpen: false,
    //     geoObjectHideIconOnBalloonOpen: false
    // });

    fetch("/category/?category=1&category=2&category=3&category=4&category=5&category=6&" +
        "category=7&category=8&category=9")
        .then(response => response.json())
        .then((json)=>{
            groups = json;
            let keys = Object.keys(groups);
            keys.forEach(el => newGroups.push({typeOfWaste: el, companyInfo: groups[el]}))
            setMapGeoObjects(newGroups);
        });

    let array = [];
    geoObjects.forEach(el => array.push(el.geoObject));
    // clusterer.add(array);
}

function setMapGeoObjects(groups){
    if(groups != undefined)
    {
        for (let i = 0; i < groups.length; i++)
        {
            let collection = new ymaps.GeoObjectCollection(groups[i].companyInfo, {
                preset: typeOfWastePresetList.find(o=>o.typeOfWaste == groups[i].typeOfWaste).preset,
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

                console.log(i, j,
                    groups[i].companyInfo[j].address[0].latitude, groups[i].companyInfo[j].address[0].longitude);
                let item = new ymaps.Placemark([groups[i].companyInfo[j].address[0].latitude, groups[i].companyInfo[j].address[0].longitude],
                    {
                        balloonContentHeader: groups[i].companyInfo[j].name,
                        balloonContentBody: "<b>Адрес: </b>" + groups[i].companyInfo[j].address[0].address + "<br>" +
                            "<b>Номер телефона: </b>" + phoneInfo + "<br>" +
                            "<b>Электронная почта: </b>" + emailInfo,
                        hintContent: groups[i].companyInfo[j].name
                    });
                collection.add(item);
                geoObjects.push({
                    name: groups[i].companyInfo[j].name,
                    itemInfo: groups[i].companyInfo[j],
                    geoObject: item,
                });
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
        return;
    }
}

function setGeoObjectsEvents(){
    for (let i = 0; i < geoObjects.length; i++) {
        geoObjects[i].geoObject.events.add("click", function(e){
            setCompanyContainerInfo(geoObjects[i]);
        });
    }
}

/*function getCompany(){
    let cmp = {
        name: document.getElementsByClassName("company__name")[0].innerHTML,
        address: document.getElementsByClassName("company__address__value")[0].innerHTML,
        contacts: document.getElementsByClassName("company__contacts__list__item__value"),
        categories: document.getElementsByClassName("company__categories__list__item__label"),
        additionalInfo: document.getElementsByClassName("company__additional-info__value")[0].innerHTML
    }
    return cmp;
}*/

function setCompanyContainerInfo(company){
    let cmp = {
        name : company.itemInfo.name,
        address : company.itemInfo.address[0].address,
        contacts : company.itemInfo.contacts,
        categories : company.itemInfo.categories,
        additionalInfo : company.itemInfo.additionalInfo
    };
    document.getElementsByClassName("company__name")[0].innerHTML = cmp.name;
    document.getElementsByClassName("company__address__value")[0].innerHTML = cmp.address;
    addСategories(cmp.categories);
    addContacts(cmp.contacts);
    document.getElementsByClassName("company__additional-info__value")[0].innerHTML = cmp.additionalInfo;
    //showCompanyContainer();
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