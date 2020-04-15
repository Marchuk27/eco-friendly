<#import "shared/navbars/nabar-lk.ftl" as navbar/>
<!DOCTYPE html>
<html lang="eng">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Личный кабинет</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/profile.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/header.css'>
</head>
<body>
<@navbar.navbar/>
<main>
    <div class="banner-container">
        <div class="banner">
            <img src="https://ne-kurim.ru/forum/attachments/cute-panda-bear-sleep-rest-tree-zoo_2560x1440-jpg.481392/"
                 alt="BANNER_1" class="banner__image">
        </div>
        <div class="banner">
            <img src="https://images.wallpaperscraft.com/image/panda_bear_branch_tree_99785_2048x1152.jpg"
                 alt="BANNER_2" class="banner__image">
        </div>
    </div>
    <div class="form-container">
        <form action="/html/profile-map.html" class="form signin">
            <input type="text" class="form__input">
            <input type="password" class="form__input">
            <div class="form__container-button">
                <button type="submit" class="form__button signin">Войти</button>
            </div>
            <div class="form__container-button">
                <a href="/profile/registration" class="form__button register">Зарегистрироваться</a>
            </div>
        </form>
    </div>
</main>
</body>
</html>