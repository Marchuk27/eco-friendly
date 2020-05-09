let map = null;
let AllCompanies = [];
let clusterer = null;
map = null;
typeOfWasteList = [
    {typeOfWaste: "Пластик", preset: "islands#orangeIcon", id: "plastic", color: "#ECA842"},
    {typeOfWaste: "Стекло", preset: "islands#greenIcon", id: "glass", color: "#4E9F5B"},
    {typeOfWaste: "Бумага", preset: "islands#blueIcon", id: "paper", color: "#72B1D4"},
    {typeOfWaste: "Одежда", preset: "islands#yellowIcon", id: "clothes", color: "#D3C652"},
    {typeOfWaste: "Батарейки", preset: "islands#pinkIcon", id: "accums", color: "#B7739C"},
    {typeOfWaste: "Бытовая", preset: "islands#nightIcon", id: "techn", color: "#598487"},
    {typeOfWaste: "Металл", preset: "islands#brownIcon", id: "metal", color: "#C2997A"},
    {typeOfWaste: "Опасные", preset: "islands#redIcon", id: "dangerous", color: "#BA576F"},
    {typeOfWaste: "Иное", preset: "islands#violetIcon", id: "other", color: "#6255B6"}
];

class Company {
    id
    name
    address
    email
    phone
    category

    constructor(id, name, address, email, phone, category) {
        this.id = id;
        this.name = name;
        this.address = address || [];
        this.email = email || [];
        this.phone = phone || [];
        this.category = category || [];
    };

    getCompanyAddressInfo(lat, long) {
        let localAddress = this.address.find(address => address.latitude === lat &&
            address.longitude === long).address;
        let emailList = [];
        for (let e in this.email) {
            const email = this.email[e].email.toString();
            emailList.push(email);
        }
        let phoneList = [];
        for (let p in this.phone) {
            const phone = this.phone[p].phone;
            phoneList.push(phone);
        }
        return {
            name: this.name,
            localAddress: localAddress,
            email: emailList,
            phone: phoneList,
            category: this.category
        }
    }

    addCompanyPlacemarksToMap() {
        for (let i in this.address) {
            const address = this.address[i];
            for (let j in this.category) {
                const category = this.category[j];
                const color = typeOfWasteList.find(o => o.typeOfWaste == category.name).color;
                const companyPlacemark = new ymaps.Placemark(
                    [address.latitude, address.longitude],
                    {
                        balloonContentHeader: this.name,
                        balloonContentBody: "Принимают: " + category.name,
                        hintContent: this.name
                    },
                    {iconColor: color, visible: true}
                );
                const info = this.getCompanyAddressInfo(address.latitude, address.longitude);
                companyPlacemark.events.add('click', function () {
                    setCompanyContainerInfo(info)
                })
                map.geoObjects.add(companyPlacemark);
            }
        }
    }

    addCompanyClusterToMap() {
        let GeoObjects = [];
        for (let i in this.address) {
            const address = this.address[i];
            for (let j in this.category) {
                const category = this.category[j];
                const color = typeOfWasteList.find(o => o.typeOfWaste == category.name).color;
                const companyPlacemark = new ymaps.Placemark(
                    [address.latitude, address.longitude],
                    {
                        balloonContentHeader: this.name,
                        balloonContentBody: "Принимают: " + category.name,
                        hintContent: this.name
                    },
                    {iconColor: color, visible: true}
                );
                const info = this.getCompanyAddressInfo(address.latitude, address.longitude);
                companyPlacemark.events.add('click', function () {
                    setCompanyContainerInfo(info)
                })
                GeoObjects.push(companyPlacemark);
                const clusterer = new ymaps.Clusterer({
                    clusterIconLayout: 'default#pieChart',
                    // Радиус диаграммы в пикселях.
                    clusterIconPieChartRadius: 25,
                    // Радиус центральной части макета.
                    clusterIconPieChartCoreRadius: 10,
                    // Ширина линий-разделителей секторов и внешней обводки диаграммы.
                    clusterIconPieChartStrokeWidth: 3
                });
                clusterer.events.add('click', function () {
                    setCompanyContainerInfo(info)
                })
                clusterer.add(GeoObjects);
                map.geoObjects.add(clusterer);
            }
        }
    }
}

ymaps.ready(init);

let heightOfHeader = 35;
let partOfScreen = 304;

function init() {
    map = new ymaps.Map("map", {
        center: [56.84, 60.601571],
        zoom: 12
    }, {
        restrictMapArea: [[56.999959, 60.125085], [56.609430, 61.063112]],
        searchControlProvider: 'yandex#search'
    });
    /*clusterer = new ymaps.Clusterer({
        clusterIconLayout: 'default#pieChart',
        // Радиус диаграммы в пикселях.
        clusterIconPieChartRadius: 25,
        // Радиус центральной части макета.
        clusterIconPieChartCoreRadius: 10,
        // Ширина линий-разделителей секторов и внешней обводки диаграммы.
        clusterIconPieChartStrokeWidth: 3
    });*/

    fetch("/companies").then(response => response.json())
        .then((json) => {
            for (let key in json) {
                let value = json[key];
                let company = new Company(value.id, value.name, value.address, value.email, value.phone, value.category)
                company.addCompanyPlacemarksToMap();
                //company.addCompanyClusterToMap();
            }
        });
}

document.addEventListener('DOMContentLoaded', function (e) {
    let typesOfWaste = document.getElementsByClassName("type-of-waste");

    let nav = document.getElementsByTagName("nav")[0];
    nav.addEventListener("touchmove", e => {
        let touch = e.touches[0];
        let y = touch.clientY;
        if (y < window.innerHeight - partOfScreen) {
            y = window.innerHeight - partOfScreen;
        }
        if (y > window.innerHeight - heightOfHeader) {
            y = window.innerHeight - heightOfHeader;
        }
        nav.style.top = y + "px";
    });

    setTypeOfWasteOnClickEvents(Array.from(typesOfWaste));
});

function setCompanyContainerInfo(info) {
    document.getElementsByClassName("company__name")[0].innerHTML = info.name;
    document.getElementsByClassName("company__address__value")[0].innerHTML = info.localAddress;
    document.getElementsByClassName("company__phone__value")[0].innerHTML = info.phone.join("\n")
    document.getElementsByClassName("company__email__value")[0].innerHTML = info.email.join("\n");
    document.getElementsByClassName("company__email__value")[0].innerHTML = info.category.join("\n");
    //addNewCategories(info.category);
    showCompanyContainer();
}

function addNewCategories(categories) {
    let container = document.getElementsByClassName("company__categories__list")[0];
    while (container.firstChild) {
        container.removeChild(container.firstChild);
    }
    categories.forEach(el => {
        let item = document.createElement("div");
        item.className = "company__categories__list__item";
        let image = document.createElement("img");
        image.src = typeOfWasteList.find(o => o.typeOfWaste == el).image;
        item.append(image);
        container.append(item);
    });
}

function showCompanyContainer() {
    let company = document.getElementsByClassName("company")[0];
    let companyStyle = window.getComputedStyle(company, null);
    if (companyStyle.visibility == "hidden") {
        company.style.visibility = "visible";
    }
    if (companyStyle.display == "none") {
        company.style.display = "block";
    }
}

function setTypeOfWasteOnClickEvents(typesOfWaste) {
    typesOfWaste.forEach(el => {
        el.addEventListener("click", (e) => {
            el.firstElementChild.classList.toggle("selected");
            let category = typeOfWasteList.find(o => o.id == el.id);
            let typeOfWaste = category.typeOfWaste;
            let color = category.color;
            clustererObjectsStorage.forEach(geoObject => {
                if (geoObject.options.get("iconColor") == color) {
                    if (geoObject.options.get("visible")) {
                        geoObject.options.set("visible", false);
                        clusterer.remove(geoObject);
                    } else {
                        geoObject.options.set("visible", true);
                        clusterer.add(geoObject);
                    }
                }
            });
            /*let collection = geoObjectsCollections.find(o=>o.typeOfWaste==typeOfWaste).collection;
            if(collection.options.get("visible")){
                collection.options.set("visible", false);
            }
            else{
                collection.options.set("visible", true);
            }*/
        });
    });
}
