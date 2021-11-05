create database faculdade;
use faculdade;

create table aluno (
ra int primary key auto_increment,
nomeAluno varchar(45),
telefone varchar(20),
fkRepresentante int,
foreign key (fkRepresentante) references aluno(ra),
fkProjeto int,
foreign key (fkProjeto) references projeto(idProjeto)
);

create table projeto (
idProjeto int primary key auto_increment,
nomeProjeto varchar(45),
descricao varchar(45)
);

create table acompanhante (
fkAluno int,
foreign key (fkAluno) references aluno(ra),
idAcompanhante int,
primary key (idAcompanhante, fkAluno),
relacaoAluno varchar(30)
);

alter table acompanhante add column nomeAcompanhante varchar(45);
insert into projeto values 
(null, "katchau", "eu sou a velocidade"),
(null, "jaja", "aaaaah");

insert into aluno values
(null, "lucas", "11968888421", 1, 2),
(null, "thayna", "11968888422", 1, 2),
(null, "yasmin", "11968888423", 1, 2),
(null, "ana", "11968888424", 2, 1),
(null, "marcos", "11968888425", 2, 1),
(null, "gustavo", "11968888426", 2, 1);

insert into acompanhante values 
(3, 1, "pai", "Maria"),
(3, 2, "mae", "Jose"),
(3, 3, "irma", "Lucas"),
(4, 4, "pai", "Enzo"),
(4, 5, "mae", "Maria");

select* from aluno;
