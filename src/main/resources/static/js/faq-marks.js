var categoriesHTML = document.getElementsByClassName("card__header__title");
var categories = [];

function fillArray(){
    for(var i = 0; i<categoriesHTML.length; i++){
        categories.push(categoriesHTML[i].innerHTML);
    }
}