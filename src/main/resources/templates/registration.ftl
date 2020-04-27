<#ftl />
<#import "shared/navbars/nabar-lk.ftl" as navbar/>
<!DOCTYPE html>
<html lang="eng">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Регистрация</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/register.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/header.css'>
    <script rel="script" type="text/javascript" src="/js/password_validation.js"></script>
</head>
<body>
<@navbar.navbarTemplate/>
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
        <form action="/profile/registration" method="post" class="form signin">
            <h2 class="form__heading">Регистрация</h2>
            <input type="text" class="form__input" placeholder="Фамилия" name="surname">
            <input type="text" class="form__input" placeholder="Имя" name="firstName">
            <input type="text" class="form__input" placeholder="Отчество" name="fatherName">
            <div class="form__label">Дата рождения</div>
            <div class="birthday-container">
                <input type="date" class="form__input" id="birthday" name="dateOfBirth" required>
            </div>
            <div class="form__label">Пол</div>
            <div class="sex-container">
                <div class="sex-container__item">
                    <label for="man">Мужчина</label>
                    <input type="radio" id="sex" name="isMan" value="true">
                </div>
                <div class="sex-container__item">
                    <label for="man">Женщина</label>
                    <input type="radio" id="sex" name="isMan" value="false">
                </div>
            </div>
            <input type="email" class="form__input" placeholder="E-mail" name="email" required>
            <input id="password" type="password" class="form__input password" placeholder="Пароль" name="password"
                   required pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,}$">
            <input id="confirm_password" type="password" class="form__input password" placeholder="Повторите пароль"
                   name="repeatPassword" required>
            <div class="form__container-button">
                <button type="submit" class="form__button register">Зарегистрироваться</button>
            </div>
            <div class="form__warning">Нажимая “Зарегистрироваться”, Вы подтверждаете свое согласие на обработку ваших
                <u>персональных данных</u></div>
        </form>
    </div>
</main>
</body>
</html>