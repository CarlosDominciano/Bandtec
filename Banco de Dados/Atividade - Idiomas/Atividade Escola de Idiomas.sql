CREATE DATABASE Faculdade;
USE Faculdade;

CREATE TABLE Alunos (
idAluno INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nomeAluno VARCHAR (45),
enderecoAluno VARCHAR (60)
);

INSERT INTO Alunos VALUES
(NULL, "Lucas", "Rua um"),
(NULL, "Thayna", "Rua dois"),
(NULL, "Yasmin", "Rua dois"),
(NULL, "Millie", "Rua tres"),
(NULL, "Samuel", "Rua quatro");

CREATE TABLE Cursos (
idCurso INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nomeCurso VARCHAR (45),
nomeCoordenador VARCHAR (45),
mediaCurso DECIMAL (2)
);

INSERT INTO Cursos VALUES
(NULL, "Eletronica", "Monteiro", 5),
(NULL, "Design", "Marcia", 6),
(NULL, "Mecanica", "Rosa", 7);

CREATE TABLE AlunoCurso (
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
fkAluno INT,
FOREIGN KEY (fkAluno) REFERENCES Alunos (idAluno),
fkCurso INT,
FOREIGN KEY (fkCurso) REFERENCES Cursos (idCurso),
notaNoCurso DECIMAL (2),
dataInicio DATE
);

INSERT INTO AlunoCurso VALUES 
(NULL, 1 , 1 , 9 , "2020-02-05"),
(NULL, 2 , 1 , 8 , "2020-02-05"),
(NULL, 2 , 2 , 10 , "2020-07-05"),
(NULL, 3 , 3 , 7 , "2021-08-05"),
(NULL, 4 , 2 , 5 , "2021-02-05"),
(NULL, 5 , 1 , 7 , "2020-02-05"),
(NULL, 5 , 3 , 10 , "2021-08-05");

SELECT * FROM AlunoCurso;
SELECT * FROM Alunos;
SELECT * FROM Cursos;

SELECT * FROM AlunoCurso WHERE fkCurso = 1;
SELECT * FROM AlunoCurso WHERE fkAluno = 5;
SELECT sum(mediaCurso) FROM Cursos;
SELECT avg(mediaCurso) FROM Cursos; 
SELECT max(mediaCurso), min(mediaCurso) FROM Cursos;
SELECT max(notaNoCurso), min(notaNoCurso) FROM AlunoCurso group by fkCurso; 
SELECT max(notaNoCurso), min(notaNoCurso) FROM AlunoCurso group by fkAluno; 
SELECT avg(notaNoCurso) FROM AlunoCurso group by fkAluno; 
SELECT notaNoCurso From AlunoCurso;

SELECT distinct (notaNoCurso) FROM AlunoCurso; 
SELECT count(distinct notaNoCurso) FROM AlunoCurso; 
SELECT count(notaNoCurso) FROM AlunoCurso; 



