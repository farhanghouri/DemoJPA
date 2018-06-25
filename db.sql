 
CREATE user waseem password '';
create database testdb owner waseem;

CREATE TABLE employees(
   oid BIGINT PRIMARY KEY     NOT NULL,
   ename VARCHAR(20),
   phno Integer
);

INSERT INTO employees VALUES(1,'KHALID','1234')
INSERT INTO employees VALUES(2,'AHMED','1234')