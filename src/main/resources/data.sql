INSERT INTO users(username, password, enabled)
VALUES ('demo_user', '1demo_pass', true);
INSERT INTO users(username, password, enabled)
VALUES ('demo_admin', '2demo_pass', true);
INSERT INTO authorities(username, authority)
VALUES ('demo_user', 'ROLE_USER');
INSERT INTO authorities(username, authority)
VALUES ('demo_admin', 'ROLE_ADMIN');

-- TEST QUERY FOR FILLING TABLES FOR SEE REST RESULT IN JSON (LEHA DO THAT)
-- !!! user_account_id должен быть такой же как и у существующего юзера в таблице user_accounts, иначе
-- придется инсертить туда, тк это связь
INSERT INTO tracker(id, accums_total, clothes_total, danger_total, glass_total, metall_total, other_total,
paper_total, plastic_total, techn_total, total, user_account_id)
VALUES (5, '12', '2', '42', '12', '12', '56', '0', '3', '4', '143', 12);

insert into check_list(id, user_account_id) values (123, 12);

insert into check_list_saved_ideas(check_list_id, saved_ideas) values (123, 'pgAdmin говно ебаное');

