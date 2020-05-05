<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Eco Tracker</title>
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
        <li><a href="/lk/tracker" id="header-current">Трекер</a></li>
        <li><a href="/lk/checklist">Чек-лист</a></li>
        <li><a href="/lk/news">Новости</a></li>
        <li><a href="/lk/faq">FAQ</a></li>
        <li>
            <a href="/logout">
                <img src="/images/signout.png" alt="">
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
    <div class="tracker-info">Фиксируйте* сколько отходов и в какой категории вы сдали</div>
    <div class="tracker-hint">* - в условных единицах (пакетах, килограммах, бутылках и т.д.)</div>
    <div class="tracker-container">
        <form action="" class="tracker-container__categories">
            <div class="tracker-container__categories__inputs">
                <div class="form-group">
                    <img src="/images/plasticLogo.png" alt="" class="tracker-container__categories__image">
                    <div class="form-group__part">
                        <div class="tracker-container__categories__name">Пластик</div>
                        <input type="text" class="tracker-container__categories__input">
                    </div>
                </div>
                <div class="form-group">
                    <img src="/images/glass.png" alt="" class="tracker-container__categories__image">
                    <div class="form-group__part">
                        <div class="tracker-container__categories__name">Стекло</div>
                        <input type="text" class="tracker-container__categories__input">
                    </div>
                </div>
                <div class="form-group">
                    <img src="/images/paper.png" alt="" class="tracker-container__categories__image">
                    <div class="form-group__part">
                        <div class="tracker-container__categories__name">Бумага</div>
                        <input type="text" class="tracker-container__categories__input">
                    </div>
                </div>
                <div class="form-group">
                    <img src="/images/clothes.png" alt="" class="tracker-container__categories__image">
                    <div class="form-group__part">
                        <div class="tracker-container__categories__name">Одежда</div>
                        <input type="text" class="tracker-container__categories__input">
                    </div>
                </div>
                <div class="form-group">
                    <img src="/images/accums.png" alt="" class="tracker-container__categories__image">
                    <div class="form-group__part">
                        <div class="tracker-container__categories__name">Батарейки</div>
                        <input type="text" class="tracker-container__categories__input">
                    </div>
                </div>
                <div class="form-group">
                    <img src="/images/techn.png" alt="" class="tracker-container__categories__image">
                    <div class="form-group__part">
                        <div class="tracker-container__categories__name">Быт. техника</div>
                        <input type="text" class="tracker-container__categories__input">
                    </div>
                </div>
                <div class="form-group">
                    <img src="/images/metal.png" alt="" class="tracker-container__categories__image">
                    <div class="form-group__part">
                        <div class="tracker-container__categories__name">Металл</div>
                        <input type="text" class="tracker-container__categories__input">
                    </div>
                </div>
                <div class="form-group">
                    <img src="/images/dangerous.png" alt="" class="tracker-container__categories__image">
                    <div class="form-group__part">
                        <div class="tracker-container__categories__name">Опасное</div>
                        <input type="text" class="tracker-container__categories__input">
                    </div>
                </div>
                <div class="form-group">
                    <img src="/images/other.png" alt="" class="tracker-container__categories__image">
                    <div class="form-group__part">
                        <div class="tracker-container__categories__name">Другое</div>
                        <input type="text" class="tracker-container__categories__input">
                    </div>
                </div>
            </div>
            <div class="tracker-container__categories__submit">
                <input type="image" src="/images/calculateButton.png" alt="Submit"/>
            </div>
        </form>
        <div class="tracker-container__results">
            <h2 class="tracker-container__results__heading">Вы сдали:</h2>
            <div class="tracker-container__results__container">
                <div class="results__summary__container">
                    <div id="summary">
                        <div class="results__summary__label">Общее число</div>
                        <div class="results__summary__value">500</div>
                    </div>
                    <div class="results__summary__progressbar">
                        <div id="plastic"></div>
                        <div id="glass"></div>
                        <div id="paper"></div>
                        <div id="clothes"></div>
                        <div id="accums"></div>
                        <div id="techn"></div>
                        <div id="metal"></div>
                        <div id="dangerous"></div>
                        <div id="other"></div>
                    </div>
                </div>
                <div class="results__items">
                    <div class="results__item">
                        <div class="results__item__label">Пластик:</div>
                        <div class="results__item__value">4</div>
                    </div>
                    <div class="results__item">
                        <div class="results__item__label">Стекло:</div>
                        <div class="results__item__value">16</div>
                    </div>
                    <div class="results__item">
                        <div class="results__item__label">Бумага:</div>
                        <div class="results__item__value">3</div>
                    </div>
                    <div class="results__item">
                        <div class="results__item__label">Одежда:</div>
                        <div class="results__item__value">2</div>
                    </div>
                    <div class="results__item">
                        <div class="results__item__label">Батарейки:</div>
                        <div class="results__item__value">14</div>
                    </div>
                    <div class="results__item">
                        <div class="results__item__label">Быт. техника:</div>
                        <div class="results__item__value">0</div>
                    </div>
                    <div class="results__item">
                        <div class="results__item__label">Металл:</div>
                        <div class="results__item__value">7</div>
                    </div>
                    <div class="results__item">
                        <div class="results__item__label">Опасное:</div>
                        <div class="results__item__value">1</div>
                    </div>
                    <div class="results__item">
                        <div class="results__item__label">Другое:</div>
                        <div class="results__item__value">8</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
<script src="nav.js" type="text/javascript"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="bootstrap.min.js" type="text/javascript"></script>
</body>
</html>