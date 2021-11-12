CREATE DATABASE escola;
USE escola;

CREATE TABLE responsavelFinanceiro (
idResponsavel INT PRIMARY KEY AUTO_INCREMENT,
nomeResponsavel VARCHAR (45),
relacaoResponsavel VARCHAR (45)
);

CREATE TABLE aluno (
idAluno INT PRIMARY KEY AUTO_INCREMENT,
nomeAluno VARCHAR (45),
fkIndicacao INT NULL,
FOREIGN KEY (fkIndicacao) REFERENCES aluno (idAluno),
fkResponsavel INT NOT NULL, 
FOREIGN KEY (fkResponsavel) REFERENCES responsavelFinanceiro (idResponsavel)
);

CREATE TABLE curso (
idCurso INT PRIMARY KEY AUTO_INCREMENT,
nomeCurso VARCHAR (45)
);

CREATE TABLE matricula (
idMatricula INT UNIQUE,
fkAluno INT,
fkCurso INT,
PRIMARY KEY (fkAluno, fkCurso),
FOREIGN KEY (fkAluno) REFERENCES aluno (idAluno),
FOREIGN KEY (fkCurso) REFERENCES curso (idCurso),
dataMatricula DATE
);

INSERT INTO aluno VALUES 
(NULL, "Carlos", NULL, 1), 
(NULL, "Bruno", 1, 1), 
(NULL, "Thayna", 1, 2), 
(NULL, "Yasmin", 2, 2), 
(NULL, "Kevin", 2, 3),
(NULL, "Enzo", NULL, 4); 

INSERT INTO responsavelFinanceiro VALUES 
(NULL, "Eliete", "Mãe"),
(NULL, "Claudio", "Pai"),
(NULL, "Maria", "Mãe"),
(NULL, "Roberto", "Pai");

INSERT INTO curso VALUES 
(NULL, "ADS"),
(NULL, "CCO");

INSERT INTO matricula VALUES 
(1, 1, 1, '2020-08-02'),
(2, 2, 1, '2020-08-02'),
(3, 1, 2, '2021-08-02'),
(4, 2, 2, '2021-08-02'),
(5, 3, 1, '2022-02-02'),
(6, 4, 2, '2022-08-02'),
(7, 5, 2, '2023-02-02'),
(8, 6, 2, '2021-08-02');

SELECT * FROM matricula;

ALTER TABLE matricula ADD precoMatricula DECIMAL (10,2);

UPDATE matricula SET precoMatricula = 2500.00 WHERE idMatricula IN (7);

SELECT nomeAluno, precoMatricula FROM matricula JOIN aluno ON matricula.fkAluno = aluno.idAluno;

SELECT al.nomeAluno as AlunoIndicou, indicacao.nomeAluno as AlunoIndicado FROM aluno al
	JOIN aluno indicacao
	ON al.idAluno = indicacao.fkIndicacao;
    
SELECT nomeCurso, AVG(precoMatricula) AS "media de preco"
	FROM matricula ma
    JOIN curso cu
    ON ma.fkCurso = cu.idCurso 
    GROUP BY nomeCurso;
