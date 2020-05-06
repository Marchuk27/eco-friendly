<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Eco FAQ</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel=stylesheet href="/css/bootstrap.min.css">
    <link rel='stylesheet' type='text/css' media='screen' href='/css/faq-about.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/bootstrap-header.css'>
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
        <li><a href="/lk/news">Новости</a></li>
        <li><a href="/lk/faq" id="header-current">FAQ</a></li>
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
    <nav>
        <ul>
            <li><a href="/lk/faq" id="current">О проекте</a></li>
            <li><a href="#">Виды отходов</a></li>
            <li><a href="/lk/faq-periods">Сроки разложения</a></li>
            <li><a href="/lk/faq-marks">Маркировки на упаковках</a></li>
        </ul>
    </nav>
    <div class="faq-container">
        <p>«Eco-freindly» - это проект, который способен помочь людям начать вести или поддерживать экологичный образ жизни. Здесь вы сможете найти все необходимое : информацию о видах отходов и сроках их разложения, карту пунктов сбора отходов и ненужных вещей, чек-лист повседневных дел, которые можно заменить на более «экологичные». Вы так же можете видеть новости об эко-проектах, которые проводятся в рамках вашего города, чтобы узнать о новых лайфхаках или поделиться опытом с единомышленниками.</p>
        <p> Мы надеемся, что наш ресурс поможет вам изменить свою жизнь. Помните: миру нужен не один человек, ведущий идеальную экологичную жизнь, миру нужны миллионы, которые делают это не идеально. </p>
    </div>
</main>
<script src="/js/nav.js" type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>