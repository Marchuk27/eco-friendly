<#import "shared/navbars/nabar-faq.ftl" as navbar/>
<!DOCTYPE html>
<html lang="eng">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>FAQ</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/faq-marks.css'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/header.css'>
    <script src="/js/faq-marks.js" type="text/javascript"></script>
</head>
<body>
<@navbar.navbarTemplate/>
<main>
    <nav>
        <ul>
            <li><a href="/faq">О проекте</a></li>
            <li><a href="#">Виды отходов</a></li>
            <li><a href="/faq/periods">Сроки разложения</a></li>
            <li><a href="/faq/marks" id="current">Маркировки на упаковках</a></li>
        </ul>
    </nav>
    <div class="container">
        <div class="search-container">
            <div class="search-container__search">
                <div class="search-container__search__label">Быстрый поиск:</div>
                <select class="search-container__search__input" onchange="location.hash=this.value">
                    <option value="PET">1 - PET / ПЭТ </option>
                    <option value="#HDPE">2 - HDPE / PEHD / ПЭВП</option>
                    <option value="#PVC">3 - PVC / ПВХ</option>
                    <option value="#LDPE">4 - LDPE / PEBD</option>
                    <option value="#PP">5 - PP</option>
                    <option value="#PS">6 - PS</option>
                    <option value="#O">O / OTHER</option>
                </select>
                <!--<input id="search-input" class="search-container__search__input" placeholder="например: LDPE"/>-->
            </div>
            <div class="search-container__advice">
                Возмите продукт/вещь, и найдите на нем маркировку. У продуктов питания эта маркировка, как правило находится с нижней части упаковки, у одежды - с внутренней стороны.
            </div>
        </div>
        <div class="cards-container">
            <div class="card" id="PET">
                <div class="card__header">
                    <h2 class="card__header__title">1 - PET / ПЭТ</h2>
                    <img src="/images/plasticLogo.png" alt="">
                </div>
                <div class="card__content">
                    <div class="card__content__other">
                        <div class="card__content__transcript">
                            <div class="card__content__transcript__value">Полиэтилентерфталат</div>
                            <div class="card__content__transcript__label">расшифровка</div>
                        </div>
                        <div class="card__content__packages">
                            <div class="card__content__packages__value">Вода, напитки, молоко, кефир, йогурт, кетчуп специи, бытовая химия, растительное масло</div>
                            <div class="card__content__packages__label">упаковки, где часто встречается</div>
                        </div>
                    </div>
                    <div class="card__content__note">
                        <div class="card__content__note__value">Принимают почти во всех точках сбора. Исключение — бутылки из-под растительного масла, т.к. масло проникает в пластик и не даёт возможности производить из него вторсырьё</div>
                        <div class="card__content__note__label">примечание</div>
                    </div>
                </div>
            </div>
            <div class="card" id="HDPE">
                <div class="card__header">
                    <h2 class="card__header__title">2 - HDPE / PEHD / ПЭВП</h2>
                    <img src="/images/plasticLogo.png" alt="">
                </div>
                <div class="card__content">
                    <div class="card__content__other">
                        <div class="card__content__transcript">
                            <div class="card__content__transcript__value">Полиэтилен высокой прочности</div>
                            <div class="card__content__transcript__label">расшифровка</div>
                        </div>
                        <div class="card__content__packages">
                            <div class="card__content__packages__value">Вода, пакеты, кисломолчные продукты, одноразовая посуда, крышки, контейнеры, бытовая химия, детские игрушки., молоко, кефир, йогурт, кетчуп специи, бытовая химия, растительное масло</div>
                            <div class="card__content__packages__label">упаковки, где часто встречается</div>
                        </div>
                    </div>
                    <div class="card__content__note">
                        <div class="card__content__note__value">Принимают почти во всех точках сбора. Способен выделять формальдегид — бесцветный газ, негативно влияющий на органы дыхания, кожный покров и нервную систему.</div>
                        <div class="card__content__note__label">примечание</div>
                    </div>
                </div>
            </div>
            <div class="card" id="PVC">
                <div class="card__header">
                    <h2 class="card__header__title">3 - PVC / ПВХ</h2>
                    <img src="/images/plasticLogo.png" alt="">
                </div>
                <div class="card__content">
                    <div class="card__content__other">
                        <div class="card__content__transcript">
                            <div class="card__content__transcript__value">Поливинилхлорид</div>
                            <div class="card__content__transcript__label">расшифровка</div>
                        </div>
                        <div class="card__content__packages">
                            <div class="card__content__packages__value">Контейнеры для еды и пищевая плёнка, детские игрушки, пластиковые окна, скатерти и занавески для ванной, линолеум и искусственная кожа.</div>
                            <div class="card__content__packages__label">упаковки, где часто встречается</div>
                        </div>
                    </div>
                    <div class="card__content__note">
                        <div class="card__content__note__value">На переработку не принимают. При сжигании выделяет диоксин — высокотоксичное вещество, негативно влияющее на репродуктивную и иммунную системы, вызывает гормональные нарушения и раковые заболевания</div>
                        <div class="card__content__note__label">примечание</div>
                    </div>
                </div>
            </div>
            <div class="card" id="PEBD">
                <div class="card__header">
                    <h2 class="card__header__title">4 - LDPE / PEBD</h2>
                    <img src="/images/plasticLogo.png" alt="">
                </div>
                <div class="card__content">
                    <div class="card__content__other">
                        <div class="card__content__transcript">
                            <div class="card__content__transcript__value">Полиэтилен низкой плотности</div>
                            <div class="card__content__transcript__label">расшифровка</div>
                        </div>
                        <div class="card__content__packages">
                            <div class="card__content__packages__value">Почти все пакеты (в т.ч. мусорные), пищевая пленка, часть упаковок под бытовую технику</div>
                            <div class="card__content__packages__label">упаковки, где часто встречается</div>
                        </div>
                    </div>
                    <div class="card__content__note">
                        <div class="card__content__note__value">На переработку принимают, но не везде. Использовать можно несколько раз. Почти безвреден (самый безвредный), но при нагревании и в процессе разложения выделяет формальдегид.</div>
                        <div class="card__content__note__label">примечание</div>
                    </div>
                </div>
            </div>
            <div class="card" id="PP">
                <div class="card__header">
                    <h2 class="card__header__title">5 - PP</h2>
                    <img src="/images/plasticLogo.png" alt="">
                </div>
                <div class="card__content">
                    <div class="card__content__other">
                        <div class="card__content__transcript">
                            <div class="card__content__transcript__value">Полипропилен</div>
                            <div class="card__content__transcript__label">расшифровка</div>
                        </div>
                        <div class="card__content__packages">
                            <div class="card__content__packages__value">Стаканчики для сметаны, йогуртов, мороженого, шоколад, пакеты для хлеба, подгузники, детское питание, пищевые контейнеры, трубочки для напитков, шприцы</div>
                            <div class="card__content__packages__label">упаковки, где часто встречается</div>
                        </div>
                    </div>
                    <div class="card__content__note">
                        <div class="card__content__note__value">На переработку принимают, но не везде. Использовать можно несколько раз. Почти безвреден (самый безвредный), но при нагревании и в процессе разложения выделяет формальдегид.</div>
                        <div class="card__content__note__label">примечание</div>
                    </div>
                </div>
            </div>
            <div class="card" id="PS">
                <div class="card__header">
                    <h2 class="card__header__title">6 - PS</h2>
                    <img src="/images/plasticLogo.png" alt="">
                </div>
                <div class="card__content">
                    <div class="card__content__other">
                        <div class="card__content__transcript">
                            <div class="card__content__transcript__value">Полистирол</div>
                            <div class="card__content__transcript__label">расшифровка</div>
                        </div>
                        <div class="card__content__packages">
                            <div class="card__content__packages__value">Одноразовые столовые приборы, яйца, коробки под овощи, пенопласт, аудиокассеты, CD/DVD-коробки, детские игрушки</div>
                            <div class="card__content__packages__label">упаковки, где часто встречается</div>
                        </div>
                    </div>
                    <div class="card__content__note">
                        <div class="card__content__note__value">На переработку принимают, но не везде. Рекомендуется использовать только один раз: при повторном использовании, нагревании выделяет стирол, который отрицательно влияет на функцию печени и почек, кровеносную, систему.</div>
                        <div class="card__content__note__label">примечание</div>
                    </div>
                </div>
            </div>
            <div class="card" id="O">
                <div class="card__header">
                    <h2 class="card__header__title">O / OTHER</h2>
                    <img src="/images/plasticLogo.png" alt="">
                </div>
                <div class="card__content">
                    <div class="card__content__other">
                        <div class="card__content__transcript">
                            <div class="card__content__transcript__value">Всё остальное</div>
                            <div class="card__content__transcript__label">расшифровка</div>
                        </div>
                        <div class="card__content__packages">
                            <div class="card__content__packages__value">Детские бутылочки, прозрачные одноразовые столовые приборы, многоразовые тары под воду, игрушки, тюбики зубной пасты, рукава для выпечки, CD-диски</div>
                            <div class="card__content__packages__label">упаковки, где часто встречается</div>
                        </div>
                    </div>
                    <div class="card__content__note">
                        <div class="card__content__note__value">Не принимают. Избегайте. Переиспользуется несколько раз, после частого мытья или при нагревании выделяет бисфенол А или луорен-9-бисфенол (BHPF), который отрицательно влияет на мозг, репродуктивную и эндокринную системы.</div>
                        <div class="card__content__note__label">примечание</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</main>
</body>
</html>