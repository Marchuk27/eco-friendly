<#import "shared/navbar.ftl" as navbar/>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>FAQ</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/faq.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='css/header.css'>
</head>
<body>
<@navbar.navbar/>
<script>document.getElementById('faq_page').className = "current"</script>
<main>
    <nav>
        <ul>
            <li><a href="/faq" id="current">О проекте</a></li>
            <li hidden="hidden"><a href="#">Виды отходов</a></li>
            <li><a href="/faq/periods/">Сроки разложения</a></li>
            <li><a href="/faq/marks/">Маркировки на упаковках</a></li>
        </ul>
    </nav>
    <div class="container">
        <p>«Eco-freindly» - это проект, который способен помочь людям начать вести или поддерживать экологичный образ
            жизни. Здесь вы сможете найти все необходимое : информацию о видах отходов и сроках их разложения, карту
            пунктов сбора отходов и ненужных вещей, чек-лист повседневных дел, которые можно заменить на более
            «экологичные». Вы так же можете видеть новости об эко-проектах, которые проводятся в рамках вашего города,
            чтобы узнать о новых лайфхаках или поделиться опытом с единомышленниками.</p>
        <p> Мы надеемся, что наш ресурс поможет вам изменить свою жизнь. Помните: миру нужен не один человек, ведущий
            идеальную экологичную жизнь, миру нужны миллионы, которые делают это не идеально. </p>
    </div>
</main>
</body>
</html>