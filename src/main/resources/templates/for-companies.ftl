<#import "shared/navbars/nabar-comp.ftl" as navbar/>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/companies.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/header.css'>
</head>
<body>
<@navbar.navbarTemplate/>
    <main>
        <div class="information">
            Если ваша компания занимается сбором отходов, заполните форму ниже, и после проверки данных мы добавим вас на карту.
        </div>
        <form class="register-form" action="/for-companies" method="post">
            <div class="register-form__group">
                <div class="register-form__group__label">1. Название компании</div>
                <input type="text" class="company-name__value" name="name" />
            </div>
            <div class="register-form__group">
                <div class="register-form__group__label">2. Фактический адрес</div>
                <div class="address__container">
                    <div class="street">
                        <div class="street__label">Улица</div>
                        <input type="text"  class="street__value" name="street"/>
                    </div>
                    <div class="other">
                        <div class="house">
                            <div class="house__label">Дом</div>
                            <input type="text" class="house__value" name="house"/>
                        </div>
                        <div class="building">
                            <div class="building__label">Корпус</div>
                            <input type="text" class="building__value" name="building"/>
                        </div>
                        <div class="floor">
                            <div class="floor__label">Этаж</div>
                            <input type="text" class="floor__value" name="floor"/>
                        </div>
                        <div class="flat">
                            <div class="flat__label">Кв./офис</div>
                            <input type="text" class="flat__value" name="flat"/>
                        </div>
                    </div>
                </div>
            </div>
            <div class="register-form__group">
                <div class="register-form__group__label">3. Виды принимаемых отходов</div>
                <div class="grid-checkboxes">
                    <div>
                        <input type="checkbox" name="isPlastic">
                        <label for="isPlastic">Пластик</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isPlastic">
                        <label for="isGlass">Стекло</label>
                      </div>
                      <div>
                        <input type="checkbox" id="scales" name="isPaper">
                        <label for="isPaper">Бумага</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isClothes">
                        <label for="isClothes">Одежда</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isAccums">
                        <label for="isAccums">Батарейки</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isTechn">
                        <label for="isTechn">Быт. техника</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isMetal">
                        <label for="isMetal">Металл</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isDangerous">
                        <label for="isDangerous">Опасное</label>
                      </div>
                      <div>
                        <input type="checkbox" name="isOther">
                        <label for="isOther">Другое</label>
                      </div>
                </div>
            </div>
            <div class="register-form__group">
                <div class="register-form__group__label">4. Контакты</div>
                <div class="contacts__container">
                    <div class="phone">
                        <div class="phone__label">Телефон</div>
                        <input type="text" class="phone__value" name="phone">
                    </div>
                    <div class="mail">
                        <div class="mail__label">Эл. почта</div>
                        <input type="text" class="mail__value" name="email">
                    </div>
                </div>
            </div>
            <div class="register-form__group">
                <div class="register-form__group__label">5. Занимаетесь вывозом отходов или работаете только как пункт приема</div>
                <div class="is-export__value">
                    <label>
                        <input type="radio" name="isTaxi" value="true" >
                        Да, занимаемся
                    </label>
                    <label>
                        <input type="radio" name="isTaxi" value="false">
                        Нет, мы только пункт приёма
                    </label>
                </div>
            </div>
            <div class="register-form__group">
                <button href="/for-companies" type="submit" class="register-form__submit">Отправить</button>
            </div>
        </form>
    </main>
</body>
</html>