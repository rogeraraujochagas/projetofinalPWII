CREATE DATABASE API_EXEMPLO_DB

USE rogerbel


CREATE TABLE feriados
(	F_ID int IDENTITY NOT NULL PRIMARY KEY,
	F_TIPO VARCHAR(20) NOT NULL,
	F_DESC varchar(60) NOT NULL,
	F_DATA date NOT NULL);
