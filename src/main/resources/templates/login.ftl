<#import "shared/navbar.ftl" as navbar/>
<#import "shared/banners.ftl" as profile/>
<#--<#assign security =JspTaglibs["/META-INF/security.tld"] />-->
<!DOCTYPE html>
<html lang="eng">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Личный кабинет</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/profile.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/header.css'>
</head>
<body>
<#--<@security.authorize access="isAuthenticated()">-->
<#--    ${Request.response.sendRedirect("/")}-->
<#--</@security.authorize>-->
<@navbar.navbar/>
<script>document.getElementById('profile_page').className = "current"</script>
<main>
    <@profile.banners/>
    <div class="form-container">
        <form action="/login" method="post" class="form signin">
            <input name="username" id="username" type="text" class="form__input" placeholder="Логин">
            <input name="password" id="password" type="password" class="form__input" placeholder="Пароль">
            <div class="form__container-button">
                <button type="submit" class="form__button signin">Войти</button>
            </div>
            <div class="form__container-button">
                <a href="/registration" class="form__button register">Зарегистрироваться</a>
            </div>
        </form>
    </div>
</main>
</body>
</html>