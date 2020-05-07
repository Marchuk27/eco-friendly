let news = null;
let newsContainer = null;

document.addEventListener("DOMContentLoaded", e => {
        newsContainer = document.querySelector(".news-container");
        fetch("/news/")
            .then(response => response.json())
            .then(json => {
                news=json;
                console.log(news);
                news.forEach(el => {
                    buildNews(el);
                });
            });
        });

function buildNews(el){
    let item = document.createElement("div");
    item.className="news-container__item";
        let itemText = document.createElement("div");
        itemText.className="news-container__item__text";
        itemText.innerHTML=el.textContent;
        let imageContainer = document.createElement("div");
        imageContainer.className="image-container";
            let image = document.createElement("img");
            image.className="news-container__item__image";
            image.src=el.urlToImage;
            image.alt="image";
        let itemFooter = document.createElement("div");
        itemFooter.className="news-container__item__footer";
            let likeContainer = document.createElement("div");
            likeContainer.className="like-container";
                let imageLike = document.createElement("img");
                imageLike.className="like-container__image";
                imageLike.src="/images/leaf.png";
                imageLike.alt="like";
                let likeCount = document.createElement("div");
                likeCount.className="like-container__count";
                likeCount.innerHTML=el.likeAmount;
            let date = document.createElement("div");
            date.className="date";
            date.innerHTML=el.dateOfPublish;
    newsContainer.append(item);
        item.append(itemText);
        item.append(imageContainer);
            imageContainer.append(image);
        item.append(itemFooter);
            itemFooter.append(likeContainer);
                likeContainer.append(imageLike);
                likeContainer.append(likeCount);
            itemFooter.append(date);
}