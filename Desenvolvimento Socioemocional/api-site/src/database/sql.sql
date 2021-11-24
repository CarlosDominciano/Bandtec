/* para workbench - local - desenvolvimento */
CREATE DATABASE gamezone;

USE gamezone;

CREATE TABLE usuario (
	idUsuario INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(70) NOT NULL,
	email VARCHAR(70) UNIQUE NOT NULL,
	senha VARCHAR(50) NOT NULL,
	nick VARCHAR(50) NOT NULL
);

CREATE TABLE triste (
	id INT PRIMARY KEY AUTO_INCREMENT,
	qntd decimal(5)
);

CREATE TABLE feliz (
	id INT PRIMARY KEY AUTO_INCREMENT,
	qntd decimal(5)
);

CREATE TABLE amei (
	id INT PRIMARY KEY AUTO_INCREMENT,
	qntd decimal(5)
);

CREATE TABLE uau (
	id INT PRIMARY KEY AUTO_INCREMENT,
	qntd decimal(5)
);

CREATE TABLE grr (
	id INT PRIMARY KEY AUTO_INCREMENT,
	qntd decimal(5)
);
