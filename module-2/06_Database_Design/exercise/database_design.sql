-- PUT YOUR SQL TO GENERATE THE DATABASE HERE. MAKE SURE TO SAVE FREQUENTLY!

BEGIN TRANSACTION;

DROP TABLE IF EXISTS events;
DROP TABLE IF EXISTS member_event;
DROP TABLE IF EXISTS group_members;
DROP TABLE IF EXISTS interest_group;
DROP TABLE IF EXISTS members;


CREATE TABLE members (

member_id serial PRIMARY KEY,
last_name varchar(100) NOT NULL, 
first_name varchar(100) NOT NULL,
	email varchar (100),
	phone_number varchar (20),
	date_of_birth date,
	reminder_email boolean

);

CREATE TABLE interest_group (
group_number serial PRIMARY KEY,
group_name varchar (100)NOT NULL,
number_of_members int NOT NULL
	
);

CREATE TABLE group_members (
 group_number int,
	member_id int,
	
	CONSTRAINT fk_group_members_members FOREIGN KEY (member_id) REFERENCES members (member_id),
	CONSTRAINT fk_group_members_interest_group FOREIGN KEY (group_number) REFERENCES interest_group (group_number)
	
	
);


CREATE TABLE member_event (
member_id int,
	event_number int
	
);

CREATE TABLE events (
event_number serial PRIMARY KEY,
	event_name varchar (100),
	description text,
	start_date_time TIMESTAMP,
	duration_in_minutes int,
	group_number int,
	CONSTRAINT fk_events_interest_group FOREIGN KEY (group_number) REFERENCES interest_group (group_number)
	
);

INSERT INTO members (last_name, first_name, email, phone_number, date_of_birth, reminder_email)
VALUES ('COX','ROMANCE', 'ROMANCECOX@YAHOO.COM', '216-232-2992', '02/28/1983', true),
('moore', 'landon', 'landonmoore@YAHOO.COM', '216-232-2994', '02/28/1984', true),
('moore', 'michael', 'michaelmoore@YAHOO.COM', '216-232-2993', '02/28/1990', true),
('moore', 'chris', 'chrismoore@YAHOO.COM', '216-232-3993', '05/04/1990', true),
('lewis', 'lou', 'lewislow@gmail.COM', '216-234-2993', '05/05/1990', true),
('kirk', 'willis', 'kirkwillis@YAHOO.COM', null,'02/28/1990', false),
('chris', 'willis', null, '216-234-2993', '02/07/1990',false),
('book', 'reader', 'bookreader@YAHOO.COM', '216-232-2962', '02/28/1985', true);



INSERT INTO events ( event_name, description, start_date_time, duration_in_minutes)
Values ('afrotech','techexpo', '03/03/2023 10:23:54' , '180'),
('atlanta','art expo' ,'06/09/2023 10:23:54', '300'),
('Miami','swim week','06/18/2023 10:23:54', '500'),
('cleveland','learning week','06/18/2023 10:23:54','500');


INSERT INTO interest_group (group_name, number_of_members)
Values ('the greatest', 12),
('the lowest', 18),
('love codes', 25);


INSERT INTO member_event (member_id, event_number)
VALUES (1,2),(3,1),(4,1);
				   
INSERT INTO member_event (member_id, event_number)
VALUES (2,2),(1,2),(3,2);

INSERT INTO member_event (member_id, event_number)
VALUES (1,3),(3,3),(2,3);

INSERT INTO member_event (member_id, event_number)
VALUES (1,4),(2,4),(3,4);

INSERT INTO group_members (group_number, member_id)
VALUES (2,1),(2,5),(2,7),(2,6);

INSERT INTO group_members (group_number, member_id)
VALUES (1,1),(1,5),(1,6),(1,7);

INSERT INTO group_members (group_number, member_id)
VALUES (2,1),(2,5),(2,6),(2,7);


COMMIT;