create database bandtec;
use bandtec;

create table alunos (
ra int primary key,
nomeAluno varchar (45) not null,
emailAluno varchar (70) not null,
fkGrupo int not null,
foreign key (fkGrupo) references grupos (idGrupo)
);

insert into alunos values
(01212110, "Carlos Dominciano", "carlos.dominciano@bandtec.com", 1), 
(01212112, "Gustavo Lura", "gustavo.lura@bandtec.com", 1), 
(01212189, "Julia Carolina", "julia.carolina@bandtec.com", 1), 
(01212190, "Adalberto Nascimento", "adalberto.nascimento@bandtec.com", 2), 
(01212155, "Lucas Bazilio", "lucas.bazilio@bandtec.com", 2), 
(01212121, "Kevin Wesselka", "kevin.wesselka@bandtec.com", 2);

create table grupos (
idGrupo int primary key not null auto_increment,
nomeGrupo varchar (45) not null,
descricaoGrupo varchar (70) not null
);

insert into grupos values
(null, "Impressora", "Controle de temperatura e umidade em impressoras 3D"), 
(null, "Abelhas", "Controle de temperatura e umidade em colmeias");

create table professores (
idProfessor int primary key not null auto_increment,
nomeProfessor varchar (45) not null,
disciplinaPrimeiroSemestre varchar (70) not null
) auto_increment = 10000;

insert into professores values
(null, "Fernando", "Pesquisa e Inovação"), 
(null, "Thiago", "Tecnologia da informação"), 
(null, "Alex", "Banco de Dados"), 
(null, "Freeza", "Algoritmo");


create table avaliacoes (
idAvaliacao int primary key auto_increment,
fkProfessores int not null,
foreign key (fkProfessores) references professores (idProfessor),
fkGrupo int not null,
foreign key (fkGrupo) references grupos (idGrupo),
notaGrupo decimal (4,2),
dataAvaliacao datetime
);

insert into avaliacoes values
(null, 10000, 1, 10, '2021-11-29 12:10:00'), 
(null, 10001, 1, 9, '2021-11-26 14:50:00'), 
(null, 10000, 2, 9, '2021-11-29 10:50:00'), 
(null, 10002, 2, 8, '2021-11-30 15:35:00'), 
(null, 10003, 2, 10, '2021-11-27 10:55:00');


select * from avaliacoes;
select * from professores;
select * from alunos;
select * from grupos;

select * from grupos join alunos on alunos.fkGrupo = grupos.idGrupo;
select nomeAluno, nomeGrupo from grupos join alunos on alunos.fkGrupo = grupos.idGrupo;

select * from grupos join alunos on alunos.fkGrupo = grupos.idGrupo where idGrupo = 1;

select avg(avaliacoes.notaGrupo) from avaliacoes;

select min(notaGrupo), max(notaGrupo) from avaliacoes;

select sum(notaGrupo) from avaliacoes;

select professores.nomeProfessor, professores.disciplinaPrimeiroSemestre, grupos.nomeGrupo,
grupos.descricaoGrupo, avaliacoes.dataAvaliacao from avaliacoes
join grupos on avaliacoes.fkGrupo = grupos.idGrupo
join professores on  avaliacoes.fkProfessores = professores.idProfessor;

select professores.nomeProfessor, professores.disciplinaPrimeiroSemestre, grupos.nomeGrupo,
grupos.descricaoGrupo, avaliacoes.dataAvaliacao from avaliacoes
join grupos on avaliacoes.fkGrupo = grupos.idGrupo
join professores on  avaliacoes.fkProfessores = professores.idProfessor where nomeGrupo = "Impressora";

select professores.nomeProfessor, professores.disciplinaPrimeiroSemestre, grupos.nomeGrupo,
grupos.descricaoGrupo, avaliacoes.dataAvaliacao from avaliacoes
join grupos on avaliacoes.fkGrupo = grupos.idGrupo
join professores on  avaliacoes.fkProfessores = professores.idProfessor where idGrupo = 1;

select nomeGrupo from grupos join avaliacoes on avaliacoes.fkGrupo = grupos.idGrupo where fkProfessores = 10001;

select * from avaliacoes join grupos on avaliacoes.fkGrupo = grupos.idGrupo
join professores on avaliacoes.fkProfessores = professores.idProfessor;

select distinct notaGrupo from avaliacoes;


























