<#import "shared/navbars/navbar-main.ftl" as navbar/>
<!DOCTYPE html>
<html lang="eng">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Eco</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/main.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/header.css'>
    <script src="https://api-maps.yandex.ru/2.1/?lang=ru_RU&amp;apikey=cce8c8c9-a3d9-45a9-a1ec-ce763a37a4b8" type="text/javascript"></script>
    <script src="js/placemark.js" type="text/javascript"></script>
</head>
<body>
<@navbar.navbar/>
    <main>
        <nav>
            <h2>Виды отходов</h2>
            <div id="types-of-waste">
                <div class="type-of-waste">
                    <img class="type-of-waste__logo" src="images/plasticLogo.png" alt="logo">
                    <div class="type-of-waste__label">Пластик</div>
                </div>
                <div class="type-of-waste">
                    <img class="type-of-waste__logo" src="images/glass.png" alt="logo">
                    <div class="type-of-waste__label">Стекло</div>
                </div>
                <div class="type-of-waste">
                    <img class="type-of-waste__logo" src="images/paper.png" alt="logo">
                    <div class="type-of-waste__label">Бумага</div>
                </div>
                <div class="type-of-waste">
                    <img class="type-of-waste__logo" src="images/clothes.png" alt="logo">
                    <div class="type-of-waste__label">Одежда</div>
                </div>
                <div class="type-of-waste">
                    <img class="type-of-waste__logo" src="images/accums.png" alt="logo">
                    <div class="type-of-waste__label">Батарейки</div>
                </div>
                <div class="type-of-waste">
                    <img class="type-of-waste__logo" src="images/techn.png" alt="logo">
                    <div class="type-of-waste__label">Быт.техника</div>
                </div>
                <div class="type-of-waste">
                    <img class="type-of-waste__logo" src="images/metal.png" alt="logo">
                    <div class="type-of-waste__label">Металл</div>
                </div>
                <div class="type-of-waste">
                    <img class="type-of-waste__logo" src="images/dangerous.png" alt="logo">
                    <div class="type-of-waste__label">Опасное</div>
                </div>
                <div class="type-of-waste">
                    <img class="type-of-waste__logo" src="images/other.png" alt="logo">
                    <div class="type-of-waste__label">Другое</div>
                </div>
            </div>
            <div class="nav-button">
                <button class="btn btn-search">Найти</button>
            </div>
        </nav>
        <div class="container">
            <div id="map"></div>
        </div>
        <aside class="company">
            <h2 class="company__name">ООО Barin-Off</h2>
            <div class="company__address">
                <div class="company__address__label">Адрес:</div>
                <div class="company__address__value">ул. Разбитых сердец, д.10, кв.13</div>
            </div>
            <div class="company__contacts">
                <div class="company__contacts__label">Контакты:</div>
                <div class="company__contacts__list">
                    <div class=company__contacts__list__item>
                        <img class="company__contacts__list__item__logo" src="images/ig-logo.png" alt="logo"/>
                        <div class="company__contacts__list__item__value">rojiblancos1627</div>
                    </div>
                    <div class=company__contacts__list__item>
                        <img class="company__contacts__list__item__logo" src="images/vk-logo.png" alt="logo"/>
                        <div class="company__contacts__list__item__value">vk.com/id1</div>
                    </div>
                    <div class=company__contacts__list__item>
                        <img class="company__contacts__list__item__logo" src="images/wapp-logo.png" alt="logo"/>
                        <div class="company__contacts__list__item__value">Valetka</div>
                    </div>
                    <div class=company__contacts__list__item>
                        <img class="company__contacts__list__item__logo" src="images/phone-logo.png" alt="logo"/>
                        <div class="company__contacts__list__item__value">89221960390</div>
                    </div>
                    <div class=company__contacts__list__item>
                        <img class="company__contacts__list__item__logo" src="images/web-logo-2.png" alt="logo"/>
                        <div class="company__contacts__list__item__value">domena.net</div>
                    </div>
                </div>
            </div>
            <div class="company__categories">
                <div class="company__categories__label">Категории:</div>
                <div class="company__categories__list">
                    <div class="type-of-waste">
                        <img class="type-of-waste__logo" src="images/other.png" alt="logo">
                        <div class="type-of-waste__label">Другое</div>
                    </div>
                    <div class="type-of-waste">
                        <img class="type-of-waste__logo" src="images/paper.png" alt="logo">
                        <div class="type-of-waste__label">Бумага</div>
                    </div>
                    <div class="type-of-waste">
                        <img class="type-of-waste__logo" src="images/clothes.png" alt="logo">
                        <div class="type-of-waste__label">Одежда</div>
                    </div>
                    <div class="type-of-waste">
                        <img class="type-of-waste__logo" src="images/accums.png" alt="logo">
                        <div class="type-of-waste__label">Батарейки</div>
                    </div>
                </div>
            </div>
            <div class="company__additional-info">
                <div class="company__additional-info__label">Дополнительная информация:</div>
                <div class="company__additional-info__value">Всем привет! Меня зовут Олег, я из Барселоны. Не советую
                    вам приезжать сюда, равно как и лезть в рэп.
                </div>
            </div>
        </aside>
    </main>
</body>
</html>