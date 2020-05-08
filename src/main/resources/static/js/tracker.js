let username = null;
let trackerInfo = null;

typesOfWaste = ["plastic", "glass", "paper", "clothes", "accums", "techn", "metal", "dangerous", "other"];

window.addEventListener("load", e => {
    fetch("/session+user+name/")
        .then(response => response.text())
        .then(response => {
            username=response;
            console.log(username);
            fetch("/tracker/?username="+username)
                .then(response => response.json())
                .then(json => {
                    trackerInfo=json;
                    console.log(trackerInfo);
                    document.getElementsByName("plasticTotal")[0].innerHTML = trackerInfo.plasticTotal;
                    document.getElementById("plastic").style.flex = trackerInfo.plasticTotal;
                    document.getElementsByName("glassTotal")[0].innerHTML = trackerInfo.glassTotal;
                    document.getElementById("glass").style.flex = trackerInfo.glassTotal;
                    document.getElementsByName("paperTotal")[0].innerHTML = trackerInfo.paperTotal;
                    document.getElementById("paper").style.flex = trackerInfo.paperTotal;
                    document.getElementsByName("clothesTotal")[0].innerHTML = trackerInfo.clothesTotal;
                    document.getElementById("clothes").style.flex = trackerInfo.clothesTotal;
                    document.getElementsByName("accumsTotal")[0].innerHTML = trackerInfo.accumsTotal;
                    document.getElementById("accums").style.flex = trackerInfo.accumsTotal;
                    document.getElementsByName("technTotal")[0].innerHTML = trackerInfo.technTotal;
                    document.getElementById("techn").style.flex = trackerInfo.technTotal;
                    document.getElementsByName("metalTotal")[0].innerHTML = trackerInfo.metalTotal;
                    document.getElementById("metal").style.flex = trackerInfo.metalTotal;
                    document.getElementsByName("dangerTotal")[0].innerHTML = trackerInfo.dangerTotal;
                    document.getElementById("dangerous").style.flex = trackerInfo.dangerTotal;
                    document.getElementsByName("otherTotal")[0].innerHTML = trackerInfo.otherTotal;
                    document.getElementById("other").style.flex = trackerInfo.otherTotal;
                    document.getElementsByName("total")[0].innerHTML = trackerInfo.total;
                });
        });

    /*let form = document.getElementsByTagName("form")[0];
    form.addEventListener("submit", function (e) {
        e.preventDefault();
        const formData = new FormData(this);
        for (var p of formData) {
            console.log(p);
        };
        sendForm(formData);
        this.reset();
    });*/
});

function sendForm(formData) {
    fetch("/lk/tracker", {
        method: "POST",
        headers: {
            "Content-Type": 'multipart/form-data'
        },
        body: formData
    })
        .then(response => console.log('Сообщение отправлено методом fetch'))
        .catch(error => console.error(error))
}