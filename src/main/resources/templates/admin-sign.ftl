<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Eco-Admin</title>
</head>
<body>
<header>
    <div class="logo">
        <img src="/images/logo.png" alt="Лого" class="logo__image">
        <div class="logo__name">Eco-Friendly Project</div>
    </div>
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