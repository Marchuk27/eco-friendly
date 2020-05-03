<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Eco-Admin</title>
</head>
<body>
<header>
    <img src="/images/logo.png" style="width:100px; height:100px;" alt="picture">
    <div>Eco-Friendly Admin</div>
</header>
<div>
    <nav>
        <ul>
            <li><a href="/admin/requests">Заявки</a></li>
            <li><a href=#>---> *** Редактор новостей</a></li>
            <li><a href="/admin/db">Управление БД</a></li>
        </ul>
        <li><a href="/admin/log-out">Выйти</a></li>
    </nav>

    <form class="register-form" action="/admin/news" method="post">
        <div>
            <p>Новая новость<Br>
                <label>
                    <textarea name="textContent" style="font-size:17px;" MAXLENGTH="500" cols="75" rows="5"></textarea><Br>
                    <Br>Ссылка на изображение<Br>
                    <textarea name="referenceToImage" style="font-size:17px;" MAXLENGTH="140" cols="75" rows="2"></textarea><Br>
                </label>
            <p><input type="submit" value="Добавить на сайт">
            </p>
        </div>
    </form>
</div>
</body>
</html>