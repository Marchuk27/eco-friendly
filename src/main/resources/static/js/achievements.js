let username = null;
let achievements = null;

let achievementsStorage = [];

let currentAchievementsCount = 0;
let totalAchievementsCount = 0;

let start = 0;
let end = 5;

let achievementsContainer = null;
let currentAchievementsCountElement = null;
let totalAchievementsCountElement = null;

window.addEventListener("load", e => {
    fetch("/session+user+name/")
        .then(response => response.text())
        .then(response => {
            username=response;
            console.log(username);
            fetch("/achievements/?username="+username)
                .then(response => response.json())
                .then(json => {
                    achievements=json;
                    if(achievements.length>0 && achievements !== null)
                    {
                        setInitialAchievements();
                    }
                });
        });
    let backButton = document.getElementById("back");
    backButton.addEventListener("click", e => {
        let count = achievements.length;
        if((start-5)>=0){
            start-=5;
            end-=Math.min(5, count-5);
            while (achievementsContainer.firstChild) {
                achievementsContainer.removeChild(achievementsContainer.lastChild);
            }
            for(let i = start; i<end; i++){
                achievementsContainer.append(achievementsStorage[i]);
            }
            setPaginationValues();
        }
    });
    let forwardButton = document.getElementById("forward");
    forwardButton.addEventListener("click", e => {
       let count = achievements.length;
       if(count>5 && ((start+5)<count)){
           start+=5;
           end+=Math.min(5, count-5);
           while (achievementsContainer.firstChild) {
               achievementsContainer.removeChild(achievementsContainer.lastChild);
           }
           for(let i = start; i<end; i++){
               achievementsContainer.append(achievementsStorage[i]);
           }
           setPaginationValues();
       }
    });
});

function buildAchievements(el){
    let achievement = document.createElement("div");
    achievement.className="achievement";
    let achievementTitle=document.createElement("div");
    achievementTitle.className="achievement__title";
    achievementTitle.innerHTML=el.name;
    let achievementText=document.createElement("div");
    achievementText.className="achievement__title";
    achievementText.innerHTML=el.description;
    //achievementsContainer.append(achievement);
    achievement.append(achievementTitle);
    achievement.append(achievementText);
    achievementsStorage.push(achievement);
}

function setPaginationValues(){
    totalAchievementsCount = achievements.length;
    totalAchievementsCountElement.innerHTML = "/"+totalAchievementsCount;
    currentAchievementsCount = Math.min(end, achievements.length);
    currentAchievementsCountElement.innerHTML = currentAchievementsCount;
}

function setInitialAchievements(){
    currentAchievementsCountElement = document.querySelector(".achievements__progress__current");
    currentAchievementsCount = Math.min(end, achievements.length);
    currentAchievementsCountElement.innerHTML = currentAchievementsCount;

    totalAchievementsCountElement = document.querySelector(".achievements__progress__total");
    totalAchievementsCount = achievements.length;
    totalAchievementsCountElement.innerHTML = "/"+totalAchievementsCount;

    achievementsContainer = document.getElementById("achievements");
    achievements.forEach(el => {
        buildAchievements(el);
    });
    for(let i = 0; i<Math.min(5, achievements.length); i++){
        achievementsContainer.append(achievementsStorage[i]);
    }
}