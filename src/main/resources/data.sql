INSERT INTO account(username, password, enabled)
VALUES ('demo_user', '1demo_pass', true);
INSERT INTO account(username, password, enabled)
VALUES ('demo_admin', '2demo_pass', true);
INSERT INTO authority(id, username_username, authority)
VALUES (2, 'demo_user', 'ROLE_USER');
INSERT INTO authority(id, username_username, authority)
VALUES (1, 'demo_admin', 'ROLE_ADMIN');

-- TEST QUERY FOR FILLING TABLES FOR SEE REST RESULT IN JSON (LEHA DO THAT)
-- !!! user_account_id должен быть такой же как и у существующего юзера в таблице user_accounts, иначе
-- придется инсертить туда, тк это связь
INSERT INTO tracker(id, accums_total, clothes_total, danger_total, glass_total, metal_total, other_total,
                    paper_total, plastic_total, techn_total, total, account_username)
VALUES (5, '12', '2', '42', '12', '12', '56', '0', '3', '4', '143', 'vasyan');

insert into check_list(id, account_username)
values (123, 12);

insert into check_list_saved_ideas(check_list_id, saved_ideas)
values (123, 'pgAdmin говно ебаное');

-- ЗАПРОС ДЛЯ ЗАПОЛНЕНИЯ ТАБЛИЦЫ ДОСТИЖЕНИЙ
INSERT INTO achievement(id, description, name, url_to_icon)
VALUES(1, 'Зарегистрируйтесь в личном кабинете', 'Эко-энтузиаст', '');

