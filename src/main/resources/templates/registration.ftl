<#import "shared/navbars/nabar-lk.ftl" as navbar/>
<!DOCTYPE html>
<html lang="eng">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Регистрация</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/register.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/header.css'>
</head>
<body>
    <@navbar.navbarTemplate/>
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
                    <select name="day" id="" class="birthday-container__select">
                        <option value="">1</option>
                        <option value="">2</option>
                        <option value="">3</option>
                        <option value="">4</option>
                        <option value="">5</option>
                        <option value="">6</option>
                        <option value="">7</option>
                        <option value="">8</option>
                        <option value="">9</option>
                        <option value="">10</option>
                        <option value="">11</option>
                        <option value="">12</option>
                        <option value="">13</option>
                        <option value="">14</option>
                        <option value="">15</option>
                        <option value="">16</option>
                        <option value="">17</option>
                        <option value="">18</option>
                        <option value="">19</option>
                        <option value="">20</option>
                        <option value="">21</option>
                        <option value="">22</option>
                        <option value="">23</option>
                        <option value="">24</option>
                        <option value="">25</option>
                        <option value="">26</option>
                        <option value="">27</option>
                        <option value="">28</option>
                        <option value="">29</option>
                        <option value="">30</option>
                        <option value="">31</option>
                    </select>
                    <select name="month" id="" class="birthday-container__select">
                        <option value="">Январь</option>
                        <option value="">Февраль</option>
                        <option value="">Март</option>
                        <option value="">Апрель</option>
                        <option value="">Май</option>
                        <option value="">Июнь</option>
                        <option value="">Июль</option>
                        <option value="">Август</option>
                        <option value="">Сентябрь</option>
                        <option value="">Октябрь</option>
                        <option value="">Ноябрь</option>
                        <option value="">Декабрь</option>
                    </select>
                    <select name="year" id="" class="birthday-container__select">
                        <option value="">1940</option>
                        <option value="">1941</option>
                        <option value="">1942</option>
                        <option value="">1943</option>
                        <option value="">1944</option>
                        <option value="">1945</option>
                        <option value="">1946</option>
                        <option value="">1947</option>
                        <option value="">1948</option>
                        <option value="">1949</option>
                        <option value="">1950</option>
                        <option value="">1951</option>
                        <option value="">1952</option>
                        <option value="">1953</option>
                        <option value="">1954</option>
                        <option value="">1955</option>
                        <option value="">1956</option>
                        <option value="">1957</option>
                        <option value="">1958</option>
                        <option value="">1959</option>
                        <option value="">1960</option>
                        <option value="">1961</option>
                        <option value="">1962</option>
                        <option value="">1963</option>
                        <option value="">1964</option>
                        <option value="">1965</option>
                        <option value="">1966</option>
                        <option value="">1967</option>
                        <option value="">1968</option>
                        <option value="">1969</option>
                        <option value="">1970</option>
                        <option value="">1971</option>
                        <option value="">1972</option>
                        <option value="">1973</option>
                        <option value="">1974</option>
                        <option value="">1975</option>
                        <option value="">1976</option>
                        <option value="">1977</option>
                        <option value="">1978</option>
                        <option value="">1979</option>
                        <option value="">1980</option>
                        <option value="">1981</option>
                        <option value="">1982</option>
                        <option value="">1983</option>
                        <option value="">1984</option>
                        <option value="">1985</option>
                        <option value="">1986</option>
                        <option value="">1987</option>
                        <option value="">1988</option>
                        <option value="">1989</option>
                        <option value="">1990</option>
                        <option value="">1991</option>
                        <option value="">1992</option>
                        <option value="">1993</option>
                        <option value="">1994</option>
                        <option value="">1995</option>
                        <option value="">1996</option>
                        <option value="">1997</option>
                        <option value="">1998</option>
                        <option value="">1999</option>
                        <option value="">2000</option>
                        <option value="">2001</option>
                        <option value="">2002</option>
                        <option value="">2003</option>
                        <option value="">2004</option>
                        <option value="">2005</option>
                        <option value="">2006</option>
                        <option value="">2007</option>
                        <option value="">2008</option>
                        <option value="">2009</option>
                        <option value="">2010</option>
                        <option value="">2011</option>
                        <option value="">2012</option>
                        <option value="">2013</option>
                        <option value="">2014</option>
                        <option value="">2015</option>
                    </select>
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