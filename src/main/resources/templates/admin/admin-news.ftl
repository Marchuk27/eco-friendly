<#assign op_uuid1 = "3eqW78_13=a413fg310">
<#assign op_uuid2 = "4aQd2=249oiwq0uz_6x">
<#assign op_uuid4 = "19s+aIO1&170s2_Gy2E">
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Eco-Admin</title>
</head>
<body>
<header>
    <img src="/images/logo.png" style="width:100px; height:100px;" alt="picture">
    <div>Eco-Friendly Admin</div>
</header>
<div>
    <nav>
        <ul>
            <li><a href="/admin/main=${op_uuid1}" id="current">_Главная</a></li>
            <li><a href="/admin/requests=${op_uuid2}">Заявки</a></li>
            <li><a href=#>---> *** Редактор новостей</a></li>
            <li><a href="/admin/db=${op_uuid4}">Управление БД</a></li>
        </ul>
    </nav>

    <li><a href="/admin/log-out">Выйти</a></li>
</div>
</body>
</html>