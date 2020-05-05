document.addEventListener("DOMContentLoaded", e => {
    
    let navbar = document.querySelector(".navbar-logo");
    if(navbar !== null){
        navbar.addEventListener("click", e => {
            location.href="mainpage.html"; //надо другую ссылку
        });
    }
    
    // let navbarMain = document.querySelector(".navbar-logo-profile");
    // if(navbarMain !== null){
    // navbarMain.addEventListener("click", e => {
    //     location.href="profile-map.html"; //надо другую ссылку
    // });
    // }

    let navbarProfile = document.querySelector(".navbar-logo-profile-container");  
    if(navbarProfile !== null){
        navbarProfile.addEventListener("click", e => {
            location.href="profile-profile.html"; //надо другую ссылку
        });
    }
});