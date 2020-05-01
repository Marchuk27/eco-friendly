INSERT INTO users(username, password, enabled)
VALUES ('demo_user', '1demo_pass', true);
INSERT INTO users(username, password, enabled)
VALUES ('demo_admin', '2demo_pass', true);
INSERT INTO authorities(username, authority)
VALUES ('demo_user', 'ROLE_USER');
INSERT INTO authorities(username, authority)
VALUES ('demo_admin', 'ROLE_ADMIN');