--Activity 1
-- Create salesman table
CREATE TABLE salesman (salesman_id int,salesman_name varchar2(32),salesman_city varchar2(32),commission int);
DESCRIBE salesman;

--activity 2
-- Insert multiple rows at once
INSERT ALL
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13)
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

-- View data from all columns
SELECT * FROM salesman;

--Activity3
--Show data from salesman id and salesman city
select salesman_id,salesman_city from salesman;
--show data of salesman from paris
select * from salesman where salesman_city = 'Paris';
--show sales man id and commission of Paul Adam
select SALESMAN_ID,COMMISSION from salesman where SALESMAN_NAME ='Paul Adam'

-activity 4

ALTER table salesman add grade int;
update salesman set grade=100;
select * from salesman;


--activity 5

--Update the grade score of salesman from Rome to 200
update salesman set grade =200 where salesman_city='Rome';
select * from salesman;
--Update the grade score for salesman Pit Alex	 to 300
update salesman set grade =300 where salesman_name='Pit Alex';
select * from salesman;
--update the name McLyon to Pierre
update salesman set salesman_name = 'Pierre' where salesman_name = 'McLyon';
select * from salesman;
