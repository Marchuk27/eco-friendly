map = null;
geoObjects = [];
geoObjectsCollections = [];
ymaps.ready(init);

document.addEventListener('DOMContentLoaded', function(e){
    let typesOfWaste = document.getElementsByClassName("type-of-waste");
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
                    let collection = geoObjectsCollections.find(o=>o.typeOfWaste=="Быт.техника").collection;
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
                    let collection = geoObjectsCollections.find(o=>o.typeOfWaste=="Опасное").collection;
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
                    let collection = geoObjectsCollections.find(o=>o.typeOfWaste=="Другое").collection;
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
    setMapGeoObjects();
}

function setMapGeoObjects(){
    if(groups != undefined)
    {
        for(let i = 0; i < groups.length; i++)
        {
            let collection = new ymaps.GeoObjectCollection(groups[i], {
                preset: groups[i].style, 
                visible: true
            });

            for(let j = 0; j < groups[i].items.length; j++){
                let item = new ymaps.Placemark(groups[i].items[j].center, {
                    balloonContentHeader: groups[i].items[j].name,
                    balloonContentBody: groups[i].items[j].additionalInfo,
                    hintContent: groups[i].items[j].name
                });
                collection.add(item);
                geoObjects.push({
                    name: groups[i].items[j].name, 
                    itemInfo: groups[i].items[j],
                    geoObject: item,
                });
            }
            map.geoObjects.add(collection);
            geoObjectsCollections.push({
                typeOfWaste: groups[i].name,
                collection: collection 
            })
        }
        setGeoObjectsEvents();
    }
}

function showCompanyContainer(){
    let company = document.getElementsByClassName("company")[0];
    if(company.style.visibility="hidden"){
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
        address : company.itemInfo.address,
        contacts : company.itemInfo.contacts,
        categories : company.itemInfo.categories,
        additionalInfo : company.itemInfo.additionalInfo
    };
    document.getElementsByClassName("company__name")[0].innerHTML = cmp.name;
    document.getElementsByClassName("company__address__value")[0].innerHTML = cmp.address;
    addСategories(cmp.categories);
    addContacts(cmp.contacts);
    document.getElementsByClassName("company__additional-info__value")[0].innerHTML = cmp.additionalInfo;
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
    if(contacts == undefined)
    {
        return;
    }
    else{
        for (let i = 0, len=contacts.length; i < len; i++)
        {   
            let item = document.createElement("div");
            item.className="company__contacts__list__item";
            container.append(item);
    
            let logo = document.createElement("img");
            logo.className = "company__contacts__list__item__logo";
            logo.alt = "logo";
    
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
