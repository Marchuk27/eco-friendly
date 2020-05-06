<#ftl />
<#import "shared/navbar.ftl" as navbar/>
<#import "shared/banners.ftl" as profile/>
<!DOCTYPE html>
<html lang="eng">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Регистрация</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel=stylesheet href="/css/bootstrap.min.css">
    <link rel='stylesheet' type='text/css' media='screen' href='/css/register.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/bootstrap-header.css'>
    <script rel="script" type="text/javascript" src="/js/password_validation.js"></script>
</head>
<body>
<header class="navbar fixed-top">
    <div class="navbar-logo">
        <img src="images/logo.png" alt="Лого" class="navbar-logo__image">
        <div class="navbar-logo__name">Eco-Friendly Project</div>
    </div>
    <ul class="navbar-links">
        <li><a href="/">Главная</a></li>
        <li><a href="/login" id="header-current">Личный кабинет</a></li>
        <li><a href="/for-companies">Компаниям</a></li>
        <li><a href="/faq">FAQ</a></li>
    </ul>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
        <svg class="bi bi-list" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
            <path fill-rule="evenodd" d="M2.5 11.5A.5.5 0 013 11h10a.5.5 0 010 1H3a.5.5 0 01-.5-.5zm0-4A.5.5 0 013 7h10a.5.5 0 010 1H3a.5.5 0 01-.5-.5zm0-4A.5.5 0 013 3h10a.5.5 0 010 1H3a.5.5 0 01-.5-.5z" clip-rule="evenodd"></path>
        </svg>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
            <li class="nav-item active">
                <a class="nav-link" href="/">Главная</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/login">Личный кабинет</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/for-companies">Компаниям</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/faq">FAQ</a>
            </li>
        </ul>
    </div>
</header>
<main>
    <div class="banner-container">
        <div class="banner">
            <div class="banner__text">Читайте последние новости, связанные с экологией в Екатеринбурге, а также узнавайте о предстоящих мероприятиях, акциях, эко-барахолках в вашем личном кабинете.</div>
            <img src="/images/ban1.png" alt="BANNER_2" class="banner__image">
        </div>
        <div class="banner">
            <div class="banner__text">Начните вести экологичный образ жизни - фиксируйте количество отданных отходов, получайте приятные бонусы!</div>
            <img src="/images/fixed-banner2.png" alt="BANNER_2" class="banner__image">
        </div>
    </div>
    <div class="form-container">
        <form action="/registration" method="post" class="form signin">
            <h2 class="form__heading">Регистрация</h2>
            <input type="text" class="form__input" placeholder="Фамилия" name="lastName">
            <input type="text" class="form__input" placeholder="Имя" name="firstName">
            <input type="text" class="form__input" placeholder="Отчество" name="middleName">
            <div class="form__label">Дата рождения</div>
            <div class="birthday-container">
                <input type="date" class="form__input" name="dateOfBirth" required>
            </div>
            <div class="form__label">Пол</div>
            <div class="sex-container">
                <div class="sex-container__item">
                    <label for="man">Мужчина</label>
                    <input type="radio" id="man" name="sex" value="M">
                </div>
                <div class="sex-container__item">
                    <label for="woman">Женщина</label>
                    <input type="radio" id="woman" name="sex" value="F">
                </div>
            </div>
            <input type="email" class="form__input" placeholder="E-mail" name="email" required>
            <input type="text" class="form__input" placeholder="Логин" name="username" required pattern="[\w\d]{6,}">
            <input id="password" type="password" class="form__input password" placeholder="Пароль" name="password"
                   required pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,}$">
            <input id="confirm_password" type="password" class="form__input password" placeholder="Повторите пароль"
                   name="repeatPassword" required>
            <div class="form__container-button">
                <button type="submit" class="form__button register">Зарегистрироваться</button>
            </div>
            <div class="form__warning">Нажимая “Зарегистрироваться”, Вы подтверждаете свое согласие на обработку ваших
                <u>персональных данных</u></div>
        </form>
    </div>
</main>
<script src="/js/nav.js" type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>