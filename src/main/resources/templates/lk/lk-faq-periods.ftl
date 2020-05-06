<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Eco FAQ</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel=stylesheet href="/css/bootstrap.min.css">
    <link rel='stylesheet' type='text/css' media='screen' href='/css/faq-periods.css'>
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
            <li><a href="/lk/faq">О проекте</a></li>
            <li><a href="#">Виды отходов</a></li>
            <li><a href="/lk/faq-periods" id="current">Сроки разложения</a></li>
            <li><a href="/lk/faq-marks">Маркировки на упаковках</a></li>
        </ul>
    </nav>
    <div class="faq-container">
        <div class="card">
            <h2 class="card__label">Пластик</h2>
            <div class="card__container">
                <img class="card__container__image" src="/images/plasticLogo.png" alt="">
                <div class="card__container__description">
                    <p>Различные виды пластика разлагаются от 100 до 1000 лет.</p>
                    <p>Например, обычный полиэтиленовый <b><i>пакет</i></b> будет разлагаться в почве чуть больше <u>ста лет</u>.</p>
                </div>
            </div>
        </div>
        <div class="card">
            <h2 class="card__label">Стекло</h2>
            <div class="card__container">
                <img class="card__container__image" src="/images/glass.png" alt="">
                <div class="card__container__description">
                    Стекло можно легко перерабатывать, потому что оно сделано из песка. Однако, если выбрасывать стеклянные изделия на свалку, разложение может занять <u>миллионы лет</u>.
                </div>
            </div>
        </div>
        <div class="card">
            <h2 class="card__label">Бумага</h2>
            <div class="card__container">
                <img class="card__container__image" src="/images/paper.png" alt="">
                <div class="card__container__description">
                    Бумажным отходам требуется разный срок для разложения: проездной автобусный <b><i>билет</i></b> - <u>1 месяц</u>, книги и газеты - <u>2 года</u>, офисная <b><i>бумага для принтера</i></b> - <u>2 года</u>, пергаментная бумага - <u>5 лет</u>.
                </div>
            </div>
        </div>
        <div class="card">
            <h2 class="card__label">Одежда и текстиль</h2>
            <div class="card__container">
                <img class="card__container__image" src="/images/clothes.png" alt="">
                <div class="card__container__description">
                    <p><u>Неразлагаемая</u> одежда – это синтетический текстиль, в том числе полиэстер, нейлон. и т.д.</p>
                </div>
            </div>
            <p>Биоразлагаемый текстиль: хлопок, лён, конопля, шерсть, кожа, шёлк, бамбук, вискоза.</p>
            <p><b><i>Хлопок, лён и конопля</i></b> – одни из самых биоразлагаемых тканей, особенно, если они 100% натуральные. В компосте материалы могут разлагаться в течение всего лишь недели, но обычно это занимает около <u>5 месяцев</u>.</p>
            <p>Шерсть, бамбук, вискоза — разлагаются <u>1-5 лет</u>. Натуральная <b><i>кожа</i></b> разлагается около <u>50 лет</u>.</p>
            <div class="card__container">
                <div class="card__container__image-container">
                    <img class="card__container__image" id="thin-image" src="/images/exclamation.png" alt="">
                </div>
                <div class="card__container__description">
                    <p>Если вы вдруг решили выбросить одежду, то рекомендуется разрезать ткань на мелкие кусочки для более быстрого разложения.</p>
                </div>
            </div>
        </div>
        <div class="card">
            <h2 class="card__label">Бытовая техника и электроника</h2>
            <div class="card__container">
                <img class="card__container__image" src="/images/techn.png" alt="">
                <div class="card__container__description">
                    Данный вид отходов справедливо занесён в черный список самых страшных отходов. <b><i>Стекло, металл и пластик</i></b>, скомбинированные вместе в одном электронном приборе, могут распадаться на мелкие частицы <u>миллионы лет</u>.
                </div>
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