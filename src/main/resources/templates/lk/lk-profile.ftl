<!DOCTYPE html>
<html lang="eng">

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Eco Profile</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel=stylesheet type='text/css' href="/css/bootstrap.min.css">
    <link rel='stylesheet' type='text/css' media='screen' href='/css/bootstrap-header.css'>
    <link rel='stylesheet' type="text/css" media="screen" href="/css/lk-profile.css">
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
        <li><a href="/lk/" id="header-current">Профиль</a></li>
        <li><a href="/lk/tracker">Трекер</a></li>
        <li><a href="/lk/checklist">Чек-лист</a></li>
        <li><a href="/lk/news">Новости</a></li>
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
    <h1 class="message">Для вас</h1>
    <div class="profile-container">
        <div class="options-container">
            <div class="option" onclick="location.href='/lk/map'">
                <div class="option__image-container">
                    <img src="/images/map_card.png" alt="" class="option__image">
                    <!-- <div class="option__title">Карта</div> -->
                </div>
                <div class="option__text">Есть отходы? Найдём, куда их сдать</div>
            </div>
            <div class="option" onclick="location.href='/lk/tracker'">
                <div class="option__image-container">
                    <img src="/images/tracker_card.png" alt="" class="option__image">
                </div>
                <div class="option__text">Фиксируйте, сколько отходов сдали</div>
            </div>
            <div class="option" onclick="location.href='/lk/checklist'">
                <div class="option__image-container">
                    <img src="/images/checklist_card.png" alt="" class="option__image">
                </div>
                <div class="option__text">Закрепите идеи, связанные с образом жизни</div>
            </div>
            <div class="option" onclick="location.href='/lk/news'">
                <div class="option__image-container">
                    <img src="/images/news_card.png" alt="" class="option__image">
                </div>
                <div class="option__text">Последние эко-новости в Екатеринбурге</div>
            </div>
            <div class="option" onclick="location.href='/lk/faq'">
                <div class="option__image-container">
                    <img src="/images/faq_card.png" alt="" class="option__image">
                </div>
                <div class="option__text">Узнайте больше об отходах и их переработке</div>
            </div>
            <div class="option" onclick="location.href='/lk/account'"	>
                <div class="option__image-container">
                    <img src="/images/account_card.png" alt="" class="option__image">
                </div>
                <div class="option__text">Управляйте профилем</div>
            </div>
        </div>
        <div class="achievements-container">
            <div class="achievements__heading">Достижения</div>
            <div class="achievements__progress">
                <div class="achievements__progress__current">5</div>
                <div class="achievements__progress__total">/52</div>
            </div>
            <div id="achievements">
                <div class="achievement">
                    <div class="achievement__title">Идейный</div>
                    <div class="achievement__text">Закрепить 2 идеи в чек-листе</div>
                </div>
                <div class="achievement">
                    <div class="achievement__title">Начинающий стекольщик</div>
                    <div class="achievement__text">Сдать более 30 единиц стекла</div>
                </div>
                <div class="achievement">
                    <div class="achievement__title">Турист</div>
                    <div class="achievement__text">Просмотреть на карте 10 компаний</div>
                </div>
                <div class="achievement">
                    <div class="achievement__title">Трекмен</div>
                    <div class="achievement__text">Заполнить трекер для всех видов</div>
                </div>
                <div class="achievement">
                    <div class="achievement__title">Матёрый географ</div>
                    <div class="achievement__text">Просмотреть на карте 50 компаний</div>
                </div>
            </div>
            <div class="achievements__navigation">
                <button class="achievements__navigation__button">
                    <svg class="bi bi-caret-left-fill" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                        <path d="M3.86 8.753l5.482 4.796c.646.566 1.658.106 1.658-.753V3.204a1 1 0 00-1.659-.753l-5.48 4.796a1 1 0 000 1.506z"/>
                    </svg>
                </button>
                <button class="achievements__navigation__button">
                    <svg class="bi bi-caret-right-fill" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                        <path d="M12.14 8.753l-5.482 4.796c-.646.566-1.658.106-1.658-.753V3.204a1 1 0 011.659-.753l5.48 4.796a1 1 0 010 1.506z"></path>
                    </svg>
                </button>
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