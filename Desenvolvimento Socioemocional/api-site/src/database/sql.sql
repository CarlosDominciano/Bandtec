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
