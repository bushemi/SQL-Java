USE academy;

INSERT INTO Passports
(first_name, last_name)
VALUES
('Galileo'  , 'Galilei'),   # 1 t
('Johannes' , 'Kepler'),	# 2
('Rene'     , 'Descartes'),	# 3
('Blaise'   , 'Pascal'),	# 4
('Christian', 'Huygens'),	# 5
('Isaak'    , 'Newton'),	# 6
('Gottfried', 'Leibniz'),	# 7
('Johannes' , 'Gutenberg'),	# 8
('Leonardo' , 'Fibonacci'),	# 9 t
('Francis'  , 'Bacon'),		#10
('Alexander', 'Bell'),		#11
('Niels'    , 'Bohr'),		#12
('Nicolaus' , 'Copernicus'),#13
('Jacques'  , 'Cousteau'),	#14
('Marie'    , 'Curie'),		#15
('Charles'  , 'Darwin'),	#16
('Albert'   , 'Einstein'),	#17
('Michael'  , 'Faraday'),	#18
('Alexander', 'Fleming'),	#19
('Heinrich' , 'Hertz'),		#20
('Grace'    , 'Hopper'),	#21
('James'    , 'Maxwell'),	#22
('Gregor'   , 'Mendel'),	#23 t
('Dmitri'   , 'Mendeleev'),	#24
('Louis'    , 'Paster'),	#25 t
('James'    , 'Watt'),		#26 t
('Nikola'   , 'Tesla');		#27

INSERT INTO Students
(passport_id, start_date, finish_date)
VALUES
(24, '2010-09-01', '2015-06-30'),
( 2, '2010-09-01', '2015-06-30'),
( 3, '2010-09-01', '2015-06-30'),
( 4, '2011-09-01', '2016-06-30'),
( 5, '2011-09-01', '2014-06-30'),
( 6, '2011-09-01', '2016-06-30'),
( 7, '2011-09-01', '2016-06-30'),
( 8, '2012-09-01', '2014-06-30'),
(27, '2012-09-01', NULL),
(10, '2012-09-01', NULL),
(11, '2013-09-01', NULL),
(12, '2013-09-01', NULL),
(13, '2013-09-01', NULL),
(14, '2014-09-01', NULL),
(15, '2014-09-01', NULL),
(16, '2014-09-01', NULL),
(17, '2015-09-01', NULL),
(18, '2016-09-01', NULL),
(20, '2016-09-01', NULL),
(21, '2016-09-01', NULL),
(22, '2016-09-01', NULL),
(19, '2016-09-01', NULL);

INSERT INTO Forms
(name)
VALUES
('full-time'),
('evening'),
('corresponding');

INSERT INTO Groups
(name, form_id)
VALUES
('F10', 1),
('C11', 3),
('E11', 2),
('F12', 1),
('C13', 3),


INSERT INTO Subjects
(name)
VALUES
('Phisics'),
('Russian'),
('English'),
('PHP'),
('Chemistry'),
('MathLab'),
('Photoshop'),
('JAVA');


# 5 teachers
INSERT INTO Teachers
(passport_id)
VALUES
(23),
( 9),
(26),
(25),
( 1);

INSERT INTO Subject_teacher
(subject_id, teacher_id)
VALUES
(1,  1),
(2,  1),
(3,  9),
(4, 26),
(5, 23),
(6,  9),
(7, 25),
(8, 26);

INSERT INTO Student_group
(student_id, group_id)
VALUES
(24, 1),
( 2, 1),
( 3, 2),
( 4, 2),
( 5, 1),
( 6, 3),
( 7, 2),
( 8, 1),
(17, 1),
(27, 1),
(10, 2),
(11, 3),
(12, 3),
(13, 4),
(14, 4),
(15, 5),
(16, 4),
(18, 5),
(20, 5),
(21, 3),
(22, 4),
(19, 5);

INSERT INTO Mark_represent
 ( representation )
 VALUES
 ('Bad'),
 ('Normal'),
 ('Nice'),
 ('Not bad'),
 ('Perfect'),
 ('Awesome');
 
 INSERT INTO Marks
 ( student_id, group_id, subject_id, marks_id, date DATE, teacher_id)
 VALUES
(24, 1, 1, 1, 2001-05-06, 1),
( 2, 1, 2, 1, 2001-05-06, 1),
( 3, 2, 3, 6, 2001-05-06, 9),
( 4, 2, 4, 1, 2001-05-06,26),
( 5, 1, 1, 6, 2001-05-06, 1),
( 6, 3, 6, 1, 2001-05-06, 9),
( 7, 2, 5, 1, 2001-05-06,23),
( 8, 1, 7, 3, 2001-05-06,25),
(17, 1, 3, 7, 2001-05-06, 9),
(27, 1, 1, 7, 2001-05-06, 1),
(10, 2, 6, 5, 2001-05-06, 9),
(11, 3, 2, 1, 2001-05-06, 1),
(12, 3, 7, 2, 2001-05-06,25),
(13, 4, 4, 5, 2001-05-06,26),
(14, 4, 6, 1, 2001-05-06, 9),
(15, 5, 5, 5, 2001-05-06,23),
(16, 4, 7, 3, 2001-05-06,25),
(18, 5, 4, 5, 2001-05-06,26),
(20, 5, 6, 1, 2001-05-06, 9),
(21, 3, 3, 5, 2001-05-06, 9),
(22, 4, 4, 5, 2001-05-06,26),
(19, 5, 7, 1, 2001-05-06,25);


