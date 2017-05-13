use academy;

SELECT * FROM passports;

SELECT * FROM passports WHERE first_name = 'Irina';

SELECT * FROM passports WHERE first_name = "Anatoliy";

SELECT 100 = NULL, 100 <=> NULL, NULL = NULL, NULL <=> NULL;

SELECT 100 IS TRUE, 0 IS TRUE, '2015-06-31' IS TRUE,
"0000-00-00" IS TRUE, NULL IS TRUE;

SELECT 100 IS FALSE, 0 IS FALSE, '2015-06-31' IS FALSE,
"0000-00-00" IS FALSE, NULL IS FALSE;

SELECT 100 IS NULL, 0 IS NULL, '2015-06-31' IS NULL,
"0000-00-00" IS NULL, NULL IS NULL;

SELECT * FROM passports WHERE first_name != 'Irina';

SELECT 100 IS NOT TRUE, 0 IS NOT TRUE, '2015-06-31' IS NOT TRUE,
"0000-00-00" IS NOT TRUE, NULL IS NOT TRUE;

SELECT 100 IS NOT FALSE, 0 IS NOT FALSE, '2015-06-31' IS NOT FALSE,
"0000-00-00" IS NOT FALSE, NULL IS NOT FALSE;

SELECT 100 IS NOT NULL, 0 IS NOT NULL, '2015-06-31' IS NOT NULL,
"0000-00-00" IS NOT NULL, NULL IS NOT NULL;

SELECT * FROM passports WHERE first_name < 'Irina';

SELECT * FROM passports WHERE first_name <= 'Irina';

SELECT * FROM passports WHERE last_name > 'Pupkin';

SELECT * FROM passports WHERE last_name >= 'Pupkin';

SELECT * FROM passports WHERE first_name BETWEEN "Irina" AND 'vasiliy';

SELECT * FROM passports WHERE first_name NOT BETWEEN "Irina" AND 'vasiliy';

SELECT * FROM passports WHERE id IN (5,8,10);

SELECT * FROM passports WHERE id NOT IN (10,15,20);

SELECT * FROM passports WHERE last_name LIKE "%s%";

SELECT * FROM passports WHERE first_name NOT LIKE "%t%";

ALTER TABLE passports 
CONVERT TO CHARACTER SET cp1251 COLLATE cp1251_general_ci;

SELECT first_name, STRCMP(first_name,"irina") FROM passports;