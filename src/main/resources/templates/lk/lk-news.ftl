<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Eco News</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel=stylesheet href="/css/bootstrap.min.css">
    <link rel='stylesheet' type='text/css' media='screen' href='/css/bootstrap-header.css'>
    <link rel='stylesheet' type="text/css" media="screen" href="/css/lk-tracker.css">
</head>
<body>
<header class="navbar fixed-top">
    <div class="navbar-logo-profile-container">
        <div class="navbar-logo-profile">
            <img src="/images/logo.png" alt="Лого" class="navbar-logo-profile__image">
            <div class="navbar-logo-profile__name">Eco-Friendly Project</div>
        </div>
        <div class="navbar-logo-profile__title">Личный кабинет</div>
    </div>
    <ul class="navbar-links-profile">
        <li><a href="/lk/map">Карта</a></li>
        <li><a href="/lk/">Профиль</a></li>
        <li><a href="/lk/tracker">Трекер</a></li>
        <li><a href="/lk/checklist">Чек-лист</a></li>
        <li><a href="/lk/news" id="header-current" >Новости</a></li>
        <li><a href="/lk/faq">FAQ</a></li>
        <li>
            <a href="/logout">
                <img src="/images/signout.png" alt="">
            </a>
        </li>
    </ul>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02"
            aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
        <svg class="bi bi-list" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor"
             xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd"
                  d="M2.5 11.5A.5.5 0 013 11h10a.5.5 0 010 1H3a.5.5 0 01-.5-.5zm0-4A.5.5 0 013 7h10a.5.5 0 010 1H3a.5.5 0 01-.5-.5zm0-4A.5.5 0 013 3h10a.5.5 0 010 1H3a.5.5 0 01-.5-.5z"
                  clip-rule="evenodd"></path>
        </svg>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
            <li class="nav-item active">
                <a class="nav-link" href="/lk/map">Карта</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/lk/">Профиль</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/lk/tracker">Трекер</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/lk/checklist">Чек-лист</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/lk/news">Новости</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/lk/faq">FAQ</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/logout">Выйти</a>
            </li>
        </ul>
    </div>
</header>
<main>
    <div class="news-container">
        <div class="news-container__item">
            <div class="news-container__item__text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Vitae
                deleniti, iure nemo nam facilis delectus eveniet numquam aperiam eius hic vero neque tempore
                mollitia! Quis vero fugit hic provident eligendi?
            </div>
            <div class="image-container">
                <img src="https://i.ucrazy.ru/files/pics/2014.11/1414941937_23.jpg" alt=""
                     class="news-container__item__image">
            </div>
            <div class="news-container__item__footer">
                <div class="like-container">
                    <img class="like-container__image" src="/images/leaf.png" alt="likes">
                    <div class="like-container__count">1337</div>
                </div>
                <div class="date">13.06.2019</div>
            </div>
        </div>
        <div class="news-container__item">
            <div class="news-container__item__text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Vitae
                deleniti, iure nemo nam facilis delectus eveniet numquam aperiam eius hic vero neque tempore
                mollitia! Quis vero fugit hic provident eligendi?
            </div>
            <div class="image-container">
                <img src="https://wallbox.ru/wallpapers/main/201142/zhivotnye-04a38e3e20de.jpg" alt=""
                     class="news-container__item__image">
            </div>
        </div>
        <div class="news-container__item">
            <div class="news-container__item__text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Vitae
                deleniti, iure nemo nam facilis delectus eveniet numquam aperiam eius hic vero neque tempore
                mollitia! Quis vero fugit hic provident eligendi?</div>
            <div class="image-container">
                <img src="https://avatars.mds.yandex.net/get-pdb/477388/e17aa930-e1d4-4a4c-a241-85c63e5b256d/s1200?webp=false"
                     alt="" class="news-container__item__image">
            </div>
        </div>
        <div class="news-container__item">
            <div class="news-container__item__text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Vitae
                deleniti, iure nemo nam facilis delectus eveniet numquam aperiam eius hic vero neque tempore
                mollitia! Quis vero fugit hic provident eligendi?</div>
            <div class="image-container">
                <img src="https://wallbox.ru/resize/2560x1440/wallpapers/main/201138/pandy-mishki-zhivotnye-455e8d9.jpg"
                     alt="" class="news-container__item__image">
            </div>
        </div>
    </div>
</main>
<script src="/js/nav.js" type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="/js/bootstrap.min.js" type="text/javascript"></script>
</body>

</html>