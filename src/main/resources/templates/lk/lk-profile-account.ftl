<!DOCTYPE html>
<html>

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel=stylesheet href="/css/bootstrap.min.css">
    <link rel='stylesheet' type='text/css' media='screen' href='/css/bootstrap-header.css'>
    <link rel='stylesheet' type="text/css" media="screen" href="/css/lk-accounts.css">
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
    <div class="back-to-profile">
        <a href="/lk/" class="back-to-profile__ref">
            <svg class="bi bi-arrow-left" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                <path fill-rule="evenodd" d="M5.854 4.646a.5.5 0 010 .708L3.207 8l2.647 2.646a.5.5 0 01-.708.708l-3-3a.5.5 0 010-.708l3-3a.5.5 0 01.708 0z" clip-rule="evenodd"/>
                <path fill-rule="evenodd" d="M2.5 8a.5.5 0 01.5-.5h10.5a.5.5 0 010 1H3a.5.5 0 01-.5-.5z" clip-rule="evenodd"/>
            </svg>
            Назад
        </a>
    </div>
    <div class="fio-container">
        <div id="surname">Волков</div>
        <div class="wrapper">
            <div id="name">Алексей</div>
            <div id="fathername">Юрьевич</div>
        </div>
    </div>
    <div class="account-container">
        <div class="account-container__left">
            <div class="date-of-birth-container">
                <div class="date-of-birth__label">Дата рождения</div>
                <div class="date-of-birth__value">06.04.1997</div>
            </div>
            <div class="email-container">
                <div class="email__label">E-mail</div>
                <div class="email__value">shishu.ad@mail.ru</div>
                <div class="email__change">
                    <a href="#">Изменить</a>
                </div>
                <div class="email__get-email">
                    <input type="checkbox" name="email" id="get-email">
                    <label for="get-email">Получать новости на e-mail</label>
                </div>
            </div>
        </div>
        <div class="password-container">
            <div class="password-container__heading">Пароль</div>
            <form action="" id="password">
                <input class="password-container__current" type="password" placeholder="Текущий пароль">
                <input class="password-container__new" type="password" placeholder="Новый пароль">
                <input class="password-container__repeat" type="password" placeholder="Повторите пароль">
                <div class="password-container__submit-container">
                    <button class="password-container__submit" type="submit">Сменить</button>
                </div>
            </form>
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