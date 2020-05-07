let username = null;
let trackerInfo = null;

typesOfWaste = ["plastic", "glass", "paper", "clothes", "accums", "techn", "metal", "dangerous", "other"];

document.addEventListener("DOMContentLoaded", e => {
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
                    document.getElementsByName("glassTotal")[0].innerHTML = trackerInfo.glassTotal;
                    document.getElementsByName("paperTotal")[0].innerHTML = trackerInfo.paperTotal;
                    document.getElementsByName("clothesTotal")[0].innerHTML = trackerInfo.clothesTotal;
                    document.getElementsByName("accumsTotal")[0].innerHTML = trackerInfo.accumsTotal;
                    document.getElementsByName("technTotal")[0].innerHTML = trackerInfo.technTotal;
                    document.getElementsByName("metalTotal")[0].innerHTML = trackerInfo.metalTotal;
                    document.getElementsByName("dangerTotal")[0].innerHTML = trackerInfo.dangerTotal;
                    document.getElementsByName("otherTotal")[0].innerHTML = trackerInfo.otherTotal;
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