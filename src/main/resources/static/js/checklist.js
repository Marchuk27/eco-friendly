let username = null;
let checklistInfo = null;

typesOfWaste = ["plastic", "glass", "paper", "clothes", "accums", "techn", "metal", "dangerous", "other"];

window.addEventListener("load", e => {
    fetch("/session+user+name/")
        .then(response => response.text())
        .then(response => {
            username=response;
            console.log(username);
            fetch("/checklist/?username="+username)
                .then(response => response.json())
                .then(json => {
                    checklistInfo=json;
                    console.log(checklistInfo);
                    let checklist = document.querySelector(".checklist-image-container");
                    checklistInfo.forEach(el=>{
                        let item = document.createElement("div");
                        item.className="checklist-image-container__item";
                        item.innerHTML=el;
                        checklist.append(item);
                    });
                });
        });
});