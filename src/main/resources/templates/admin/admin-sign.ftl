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
    <form action="/admin" method="post">
        <label for="login">Логин <input type="text" name="login" required></label> <br>
        <label for="password">Пароль <input type="password" name="password" required></label>
        <div>
            <button type="submit">Войти</button>
        </div>
    </form>
</div>
</body>
</html>