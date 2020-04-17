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
        <form class="register-form">
            <div class="register-form__group">
                <div class="register-form__group__label">1. Название компании</div>
                <input type="text" class="company-name__value" />
            </div>
            <div class="register-form__group">
                <div class="register-form__group__label">2. Юридическое наименование (при наличии)</div>
                <input type="text" class="legal-name__value" />
            </div>
            <div class="register-form__group">
                <div class="register-form__group__label">3. Фактический адрес</div>
                <div class="address__container">
                    <div class="street">
                        <div class="street__label">Улица</div>
                        <input type="text"  class="street__value"/>
                    </div>
                    <div class="other">
                        <div class="house">
                            <div class="house__label">Дом</div>
                            <input type="text" class="house__value"/>
                        </div>
                        <div class="building">
                            <div class="building__label">Корпус</div>
                            <input type="text" class="building__value"/>
                        </div>
                        <div class="floor">
                            <div class="floor__label">Этаж</div>
                            <input type="text" class="floor__value"/>
                        </div>
                        <div class="flat">
                            <div class="flat__label">Кв./офис</div>
                            <input type="text" class="flat__value"/>
                        </div>
                    </div>
                </div>
            </div>
            <div class="register-form__group">
                <div class="register-form__group__label">4. Виды принимаемых отходов</div>
                <div class="grid-checkboxes">
                    <div>
                        <input type="checkbox" name="plactic">
                        <label for="plactic">Пластик</label>
                      </div>
                      <div>
                        <input type="checkbox" name="glass">
                        <label for="glass">Стекло</label>
                      </div>
                      <div>
                        <input type="checkbox" id="scales" name="paper">
                        <label for="paper">Бумага</label>
                      </div>
                      <div>
                        <input type="checkbox" name="clothes">
                        <label for="clothes">Одежда</label>
                      </div>
                      <div>
                        <input type="checkbox" name="batteries">
                        <label for="batteries">Батарейки</label>
                      </div>
                      <div>
                        <input type="checkbox" name="techn">
                        <label for="techn">Быт. техника</label>
                      </div>
                      <div>
                        <input type="checkbox" name="metal">
                        <label for="metal">Металл</label>
                      </div>
                      <div>
                        <input type="checkbox" name="dangerous">
                        <label for="dangerous">Опасное</label>
                      </div>
                      <div>
                        <input type="checkbox" name="other">
                        <label for="other">Другое</label>
                      </div>
                </div>
            </div>
            <div class="register-form__group">
                <div class="register-form__group__label">5. Контакты</div>
                <div class="contacts__container">
                    <div class="phone">
                        <div class="phone__label">Телефон</div>
                        <input type="text" class="phone__value">
                    </div>
                    <div class="mail">
                        <div class="mail__label">Эл. почта</div>
                        <input type="text" class="mail__value">
                    </div>
                </div>
            </div>
            <div class="register-form__group">
                <div class="register-form__group__label">6. Занимаетесь вывозом отходов или работаете только как пункт приема</div>
                <div class="is-export__value">
                    <label>
                        <input type="radio" name="answer" value="yes">
                        Да, занимаемся
                    </label>
                    <label>
                        <input type="radio" name="answer" value="no">
                        Нет, мы только пункт приёма
                    </label>
                </div>
            </div>
            <div class="register-form__group">
                <button type="submit" class="register-form__submit">Отправить</button>
            </div>
        </form>
    </main>
</body>
</html>