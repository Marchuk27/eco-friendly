<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Eco-tracker</title>
</head>
<body>
<header>
    <img src="/images/logo.png" style="width:100px; height:100px;" alt="picture">
    <div>Eco-Friendly Tracker</div>
</header>
<div>
    <nav>
    </nav>

    <form action="/lk/tracker" method="post">
        <div>
            <p>Фиксируйте ваши отходы<Br>
                Пластик <input type="number" min="0" max="100" name="plasticInput">
                Стекло <input type="number" min="0" max="100" name="glassInput">
                Бумага <input type="number" min="0" max="100" name="paperInput">
                Одежда<input type="number" min="0" max="100" name="clothesInput">
                Батарейки <input type="number" min="0" max="100" name="accumsInput">
                Техника <input type="number" min="0" max="100" name="technInput">
                Метал <input type="number" min="0" max="100" name="metalInput">
                Опасное <input type="number" min="0" max="100" name="dangerInput">
                Другое <input type="number" min="0" max="100" name="otherInput">
            <p><input type="submit" value="Отправить">
            </p>
        </div>
    </form>
    <div>
        <p>Cуммарные значения<Br></p>
        <label type="number" name="plasticTotal"></label>
        <label type="number" name="glassTotal"></label>
        <label type="number" name="paperTotal"></label>
        <label type="number" name="clothesTotal"></label>
        <label type="number" name="accumsTotal"></label>
        <label type="number" name="technTotal"></label>
        <label type="number" name="metalTotal"></label>
        <label type="number" name="dangerTotal"></label>
        <label type="number" name="otherTotal"></label>
    </div>
</div>
</body>
</html>