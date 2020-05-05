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
</header>
<main>
    <div class="tracker-info">Фиксируйте* сколько отходов и в какой категории вы сдали</div>
    <div class="tracker-hint">* - в условных единицах</div>
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
</main>
</body>
</html>