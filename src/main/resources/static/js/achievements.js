let username = null;
let achievements = null;

document.addEventListener("DOMContentLoaded", e => {
    fetch("/session+user+name/")
        .then(response => response.text())
        .then(response => {
            username=response;
            console.log(username);
            fetch("/achievements/?username="+username)
                .then(response => response.json())
                .then(json => {
                    achievements=json;
                    console.log(achievements);
                    /*let checklist = document.querySelector(".checklist-image-container");
                    checklistInfo.forEach(el=>{
                        let item = document.createElement("div");
                        item.className="checklist-image-container__item";
                        item.innerHTML=el;
                        checklist.append(item);
                    });*/
                });
        });
});