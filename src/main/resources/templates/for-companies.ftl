<#import "shared/navbar.ftl" as navbar/>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel=stylesheet href="/css/bootstrap.min.css">
    <link rel='stylesheet' type='text/css' media='screen' href='/css/companies.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/bootstrap-header.css'>
</head>
<body>
<header class="navbar fixed-top">
    <div class="navbar-logo">
        <img src="images/logo.png" alt="Лого" class="navbar-logo__image">
        <div class="navbar-logo__name">Eco-Friendly Project</div>
    </div>
    <ul class="navbar-links">
        <li><a href="/">Главная</a></li>
        <li><a href="/login">Личный кабинет</a></li>
        <li><a href="/for-companies" id="header-current">Компаниям</a></li>
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
    <div class="information">
        Если ваша компания занимается сбором отходов, заполните форму ниже, и после проверки данных мы добавим вас на
        карту.
    </div>
    <form class="register-form" action="/for-companies" method="post">
        <div class="register-form__group">
            <label for="name" class="register-form__group__label">1. Название компании</label>
            <input type="text" class="company-name__value" name="name" required/>
        </div>
        <div class="register-form__group">
            <div class="register-form__group__label">2. Фактический адрес</div>
            <div class="address__container">
                <div class="street">
                    <div class="street__label">Улица</div>
                    <input type="text" class="street__value" name="street"/>
                </div>
                <div class="other">
                    <div class="house">
                        <div class="house__label">Дом</div>
                        <input type="text" class="house__value" name="house"/>
                    </div>
                    <div class="building">
                        <div class="building__label">Корпус</div>
                        <input type="text" class="building__value" name="building"/>
                    </div>
                    <div class="floor">
                        <div class="floor__label">Этаж</div>
                        <input type="text" class="floor__value" name="floor"/>
                        </div>
                        <div class="flat">
                            <div class="flat__label">Кв./офис</div>
                            <input type="text" class="flat__value" name="flat"/>
                        </div>
                    </div>
                </div>
            </div>
            <div class="register-form__group">
                <div class="register-form__group__label">3. Виды принимаемых отходов</div>
                <div class="grid-checkboxes">
                    <div>
                        <input type="checkbox" name="isPlastic">
                        <label for="isPlastic">Пластик</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isPlastic">
                        <label for="isGlass">Стекло</label>
                      </div>
                      <div>
                        <input type="checkbox" id="scales" name="isPaper">
                        <label for="isPaper">Бумага</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isClothes">
                        <label for="isClothes">Одежда</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isAccums">
                        <label for="isAccums">Батарейки</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isTechn">
                        <label for="isTechn">Быт. техника</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isMetal">
                        <label for="isMetal">Металл</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isDangerous">
                        <label for="isDangerous">Опасное</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isOther">
                        <label for="isOther">Другое</label>
                      </div>
                </div>
            </div>
            <div class="register-form__group">
                <div class="register-form__group__label">4. Контакты</div>
                <div class="contacts__container">
                    <div class="phone">
                        <div class="phone__label">Телефон</div>
                        <input type="text" class="phone__value" name="phone">
                    </div>
                    <div class="mail">
                        <div class="mail__label">Эл. почта</div>
                        <input type="text" class="mail__value" name="email">
                    </div>
                </div>
            </div>
        <div class="register-form__group">
            <div class="register-form__group__label">5. Занимаетесь вывозом отходов или работаете только как пункт
                приема
            </div>
            <div class="is-export__value">
                <label>
                    <input type="radio" name="isTaxi" value="true">
                    Да, занимаемся
                </label>
                <label>
                    <input type="radio" name="isTaxi" value="false">
                    Нет, мы только пункт приёма
                </label>
            </div>
        </div>
        <div class="register-form__group">
            <button type="submit" class="register-form__submit">Отправить</button>
        </div>
    </form>
</main>
<script src="/js/nav.js" type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>