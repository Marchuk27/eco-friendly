<#import "shared/navbars/nabar-faq.ftl" as navbar/>
<!DOCTYPE html>
<html lang="eng">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>FAQ</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/faq-periods.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/header.css'>
</head>
<body>
<@navbar.navbarTemplate/>
    <main>
        <nav>
            <ul>
                <li><a href="/faq">О проекте</a></li>
                <li><a href="#">Виды отходов</a></li>
                <li><a href="/faq/periods" id="current">Сроки разложения</a></li>
                <li><a href="/faq/marks">Маркировки на упаковках</a></li>
            </ul>
        </nav>
        <div class="container">
            <div class="card">
                <h2 class="card__label">Пластик</h2>
                <div class="card__container">
                    <img class="card__container__image" src="/images/plasticLogo.png" alt="">
                    <div class="card__container__description">
                        <p>Различные виды пластика разлагаются от 100 до 1000 лет.</p>
                        <p>Например, обычный полиэтиленовый <b><i>пакет</i></b> будет разлагаться в почве чуть больше <u>ста лет</u>.</p>
                    </div>
                </div>
            </div>
            <div class="card">
                <h2 class="card__label">Стекло</h2>
                <div class="card__container">
                    <img class="card__container__image" src="/images/glass.png" alt="">
                    <div class="card__container__description">
                        Стекло можно легко перерабатывать, потому что оно сделано из песка. Однако, если выбрасывать стеклянные изделия на свалку, разложение может занять <u>миллионы лет</u>.
                    </div>
                </div>
            </div>
            <div class="card">
                <h2 class="card__label">Бумага</h2>
                <div class="card__container">
                    <img class="card__container__image" src="/images/paper.png" alt="">
                    <div class="card__container__description">
                        Бумажным отходам требуется разный срок для разложения: проездной автобусный <b><i>билет</i></b> - <u>1 месяц</u>, книги и газеты - <u>2 года</u>, офисная <b><i>бумага для принтера</i></b> - <u>2 года</u>, пергаментная бумага - <u>5 лет</u>.
                    </div>
                </div>
            </div>
            <div class="card">
                <h2 class="card__label">Одежда и текстиль</h2>
                <div class="card__container">
                    <img class="card__container__image" src="/images/clothes.png" alt="">
                    <div class="card__container__description">
                        <p><u>Неразлагаемая</u> одежда – это синтетический текстиль, в том числе полиэстер, нейлон. и т.д.</p>
                        <p>Биоразлагаемый текстиль: хлопок, лён, конопля, шерсть, кожа, шёлк, бамбук, вискоза.</p>
                        <p><b><i>Хлопок, лён и конопля</i></b> – одни из самых биоразлагаемых тканей, особенно, если они 100% натуральные. В компосте материалы могут разлагаться в течение всего лишь недели, но обычно это занимает около <u>5 месяцев</u>.</p>
                        <p>Шерсть, бамбук, вискоза — разлагаются <u>1-5 лет</u>. Натуральная <b><i>кожа</i></b> разлагается около <u>50 лет</u>.</p>
                    </div>
                </div>
                <div class="card__container">
                    <div class="card__container__image-container">
                        <img class="card__container__image" src="/images/exclamation.png" alt="">
                    </div>
                    <div class="card__container__description">
                        <p>Если вы вдруг решили выбросить одежду, то рекомендуется разрезать ткань на мелкие кусочки для более быстрого разложения.</p>
                    </div>
                </div>
            </div>
            <div class="card">
                <h2 class="card__label">Бытовая техника и электроника</h2>
                <div class="card__container">
                    <img class="card__container__image" src="/images/techn.png" alt="">
                    <div class="card__container__description">
                        Данный вид отходов справедливо занесён в черный список самых страшных отходов. <b><i>Стекло, металл и пластик</i></b>, скомбинированные вместе в одном электронном приборе, могут распадаться на мелкие частицы <u>миллионы лет</u>.
                    </div>
                </div>
            </div>
        </div>
    </main>
    </body>
</html>