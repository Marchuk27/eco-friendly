<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Eco</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="header-panel">
    <h2 class="text-center text-info">Eco-friendly project</h2><hr/>
    <a href="/main">Главная</a>
    <label>Личный кабинет</label>
    <a href="/for-companies">Компаниям</a>
    <a href="/faq">FAQ</a>
</div>

<div class="sign-in-block">
    <form name="person" action="" method="POST">
        <label>Эл.почта:
            <input type="text" size="15"></label><br/>
        <label>Пароль:
        <input type="password" size="15"></label><br/>

        <input type="submit" value="Войти" />
    </form>
    <button onclick="location.href='personal-cabinet/registration' ">Зарегистрироваться</button>
</div>
</body>
</html>