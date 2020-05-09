<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel=stylesheet href="/css/bootstrap.min.css">
    <link rel='stylesheet' type='text/css' media='screen' href='/css/companies-sended.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/bootstrap-header.css'>
</head>
<body>
    <header class="navbar fixed-top">
        <div class="navbar-logo">
            <img src="/images/logo.png" alt="Лого" class="navbar-logo__image">
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
        <div class="alert-container">
            <div class="alert-container__message">
                Ваши данные направлены на обработку.<br>Спасибо!
            </div>
            <div class="button-container">
                <button class="alert-container__button" onclick="location.href='/'">ОК</button>
            </div>
        </div>
    </main>
    <script src="/js/nav.js" type="text/javascript"></script>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>