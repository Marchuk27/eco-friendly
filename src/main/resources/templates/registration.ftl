<#import "shared/navbar.ftl" as navbar/>
<!DOCTYPE html>
<html lang="eng">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Регистрация</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/register.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/header.css'>
</head>
<body>
<@navbar.navbar/>
    <main>
        <div class="banner-container">
            <div class="banner">
                <img src="https://ne-kurim.ru/forum/attachments/cute-panda-bear-sleep-rest-tree-zoo_2560x1440-jpg.481392/" alt="BANNER_1" class="banner__image">
            </div>
            <div class="banner">
                <img src="https://images.wallpaperscraft.com/image/panda_bear_branch_tree_99785_2048x1152.jpg" alt="BANNER_2" class="banner__image">
            </div>
        </div>
        <div class="form-container">
            <form action="html/profile-map.html" class="form signin">
                <h2 class="form__heading">Регистрация</h2>
                <input type="text" class="form__input" placeholder="Фамилия">
                <input type="text" class="form__input" placeholder="Имя">
                <input type="text" class="form__input" placeholder="Отчество">
                <div class="form__label">Дата рождения</div>
                <div class="birthday-container">
                    <input type="date" class="form__input" id="birthday">
                </div>
                <div class="form__label">Пол</div>
                <div class="sex-container">
                    <div class="sex-container__item">
                        <label for="man">Мужчина</label>
                        <input type="radio" name="sex" id="sex" value="man">
                    </div>
                    <div class="sex-container__item">
                        <label for="man">Женщина</label>
                        <input type="radio" name="sex" id="sex" value="woman">
                    </div>
                </div>
                <input type="text" class="form__input" placeholder="E-mail">
                <input type="password" class="form__input password" placeholder="Пароль">
                <input type="password" class="form__input password" placeholder="Повторите пароль">
                <div class="form__container-button">
                    <button type="submit" class="form__button register">Зарегистрироваться</button>
                </div>
                <div class="form__warning">Нажимая “Зарегистрироваться”, Вы подтверждаете свое согласие на обработку ваших <u>персональных данных</u></div>
            </form>
        </div>
    </main>
</body>
</html>