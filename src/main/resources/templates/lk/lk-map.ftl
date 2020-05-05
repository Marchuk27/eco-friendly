<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel=stylesheet href="/css/bootstrap.min.css">
    <link rel='stylesheet' type='text/css' media='screen' href='/css/main.css'>
    <link rel=stylesheet type="text/css" href="/css/bootstrap-header.css">
    <script src="https://api-maps.yandex.ru/2.1/?lang=ru_RU&amp;apikey=cce8c8c9-a3d9-45a9-a1ec-ce763a37a4b8" type="text/javascript"></script>
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
        <li><a href="/lk/map" id="header-current">Карта</a></li>
        <li><a href="/lk/">Профиль</a></li>
        <li><a href="/lk/tracker">Трекер</a></li>
        <li><a href="/lk/checklist">Чек-лист</a></li>
        <li><a href="/lk/news">Новости</a></li>
        <li><a href="/lk/faq">FAQ</a></li>
        <li>
            <a href="/logout">
                <img src="../../static/images/signout.png" alt="">
            </a>
        </li>
    </ul>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
        <svg class="bi bi-list" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M2.5 11.5A.5.5 0 013 11h10a.5.5 0 010 1H3a.5.5 0 01-.5-.5zm0-4A.5.5 0 013 7h10a.5.5 0 010 1H3a.5.5 0 01-.5-.5zm0-4A.5.5 0 013 3h10a.5.5 0 010 1H3a.5.5 0 01-.5-.5z" clip-rule="evenodd"></path>
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
    <div class="left-container">
        <nav>
            <h2>Выберите виды отходов</h2>
            <div id="types-of-waste">
                <div class="type-of-waste" id="plastic">
                    <img class="type-of-waste__logo" src="/images/plasticLogo.png" alt="logo">
                    <div class="type-of-waste__label">Пластик</div>
                </div>
                <div class="type-of-waste" id="glass">
                    <img class="type-of-waste__logo" src="/images/glass.png" alt="logo">
                    <div class="type-of-waste__label">Стекло</div>
                </div>
                <div class="type-of-waste" id="paper">
                    <img class="type-of-waste__logo" src="/images/paper.png" alt="logo">
                    <div class="type-of-waste__label">Бумага</div>
                </div>
                <div class="type-of-waste" id="clothes">
                    <img class="type-of-waste__logo" src="/images/clothes.png" alt="logo">
                    <div class="type-of-waste__label">Одежда</div>
                </div>
                <div class="type-of-waste" id="accums">
                    <img class="type-of-waste__logo" src="/images/accums.png" alt="logo">
                    <div class="type-of-waste__label">Батарейки</div>
                </div>
                <div class="type-of-waste" id="techn">
                    <img class="type-of-waste__logo" src="/images/techn.png" alt="logo">
                    <div class="type-of-waste__label">Быт.техника</div>
                </div>
                <div class="type-of-waste" id="metal">
                    <img class="type-of-waste__logo" src="/images/metal.png" alt="logo">
                    <div class="type-of-waste__label">Металл</div>
                </div>
                <div class="type-of-waste" id="dangerous">
                    <img class="type-of-waste__logo" src="/images/dangerous.png" alt="logo">
                    <div class="type-of-waste__label">Опасное</div>
                </div>
                <div class="type-of-waste" id="other">
                    <img class="type-of-waste__logo" src="/images/other.png" alt="logo">
                    <div class="type-of-waste__label">Другое</div>
                </div>
            </div>
        </nav>
        <div class="offering">
            <div class="offering__heading">Не знаете что выбрать?</div>
            <div class="button-container">
                <a href="/lk/faq" class="offering__ref btn btn-to-faq">Узнай больше о видах отходов</a>
            </div>
        </div>
        <aside class="company">
            <h2 class="company__name">ООО Barin-Off</h2>
            <div class="company__address">
                <div class="company__address__label">Адрес:</div>
                <div class="company__address__value">ул. Разбитых сердец, д.10, кв.13</div>
            </div>
            <div class="company__phone">
                <div class="company__phone__label">Телефон:</div>
                <div class="company__phone__value">+79221960930</div>
            </div>
            <div class="company__email">
                <div class="company__email__label">Эл.почта:</div>
                <div class="company__email__value">barinanavas@cisco.net</div>
            </div>
            <div class="company__categories">
                <div class="company__categories__label">Категории:</div>
                <div class="company__categories__list">
                    <div class="company__categories__list__item">
                        <!-- <img class="company__categories__list__item__logo" src="images/other.png" alt="logo"> -->
                        <div class="company__categories__list__item__label">Другое</div>
                    </div>
                    <div class="company__categories__list__item">
                        <!-- <img class="company__categories__list__item__logo" src="images/paper.png" alt="logo"> -->
                        <div class="company__categories__list__item__label">Бумага</div>
                    </div>
                    <div class="company__categories__list__item">
                        <!-- <img class="company__categories__list__item__logo" src="images/clothes.png" alt="logo"> -->
                        <div class="company__categories__list__item__label">Одежда</div>
                    </div>
                    <div class="company__categories__list__item">
                        <!-- <img class="company__categories__list__item__logo" src="images/accums.png" alt="logo"> -->
                        <div class="company__categories__list__item__label">Батарейки</div>
                    </div>
                </div>
            </div>
            <!-- <div class="company__additional-info">
                <div class="company__additional-info__label">Дополнительная информация:</div>
                <div class="company__additional-info__value">Всем привет! Меня зовут Олег, я из Барселоны. Не советую
                    вам приезжать сюда, равно как и лезть в рэп.
                </div>
            </div> -->
        </aside>
    </div>
    <div class="main-container">
        <div id="map"></div>
    </div>
    <div class="right-container">
    </div>
</main>
<script src="/js/nav.js" type="text/javascript"></script>
<script src="/js/groups.js" type="text/javascript"></script>
<script src="/js/main.js" type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>