-- Arquivo de apoio, caso você queira criar tabelas como as aqui criadas para a API funcionar.
-- Você precisa executar os comandos no banco de dados para criar as tabelas,
-- ter este arquivo aqui não significa que a tabela em seu BD estará como abaixo!

/* para sql server - remoto - produção */

CREATE TABLE usuario (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(70),
	email VARCHAR(70),
	senha VARCHAR(50),
	nick VARCHAR(50)
);


/* para workbench - local - desenvolvimento */
CREATE DATABASE gamezone;

USE gamezone;

CREATE TABLE usuario (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(70),
	email VARCHAR(70),
	senha VARCHAR(50),
	nick VARCHAR(50)
);
