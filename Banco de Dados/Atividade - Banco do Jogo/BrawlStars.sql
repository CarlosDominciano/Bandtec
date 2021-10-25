-- escolher um jogo; criar min 3, max 5 tabelas; tabelas precisam se relacionar;
-- sera contabilizada como tabela, tabelas associativas (obrigatorio ter uma associativa); 
-- usar relacionamento forte, fraco, 1 para n, 1 para 1;
-- escrever as regras;

create database BrawlStars;
use BrawlStars;

create table Personagens (
idPersonagem int not null primary key auto_increment,
nomePersonagem varchar (45),
espacoMunicao decimal (1,0),
qntdProjeteis decimal (2,0),
raridade varchar (20),
ataque decimal (1),
defesa decimal (1),
utilidade decimal (1),
super_ varchar (30),
check (espacoMunicao >= 1 and espacomunicao <= 5),
check (qntdProjeteis >= 1 and qntdProjeteis <= 20)
);

insert into Personagens value 
(null, "Shelly", 3, 5, "Caminho dos Troféus", 

create table Nível (
idNivel int not null primary key auto_increment,
nivel decimal (2),
check (nivel > 0 and nivel < 11),
qntdPoderesEstrela decimal (1) null,
check (qntdPoderesEstrela > 0 and qntdPoderesEstrela < 2)
);

create table Estatísticas (
idEstatisticas int not null primary key auto_increment,
fkPersonagem int,
foreign key (fkPersonagem) references Personagens (idPersonagem),
fkNivel int,
foreign key (fkPersonagem) references Nível (idNivel),
danoPersonagem decimal (6) not null,
curaPersonagem decimal (6) null,
vidaPersonagem decimal (6) not null,
superDano decimal (6) null,
superCura decimal (6) null,
habilidadePassiva varchar (20) null
);

create table PoderesDeEstrela (
idPoderEstrela int not null primary key auto_increment,
nomePoderEstrela varchar (25),
curaPoderEstrela decimal (6) null,
danoPoderEstrela decimal (6) null
); 

create table Jogadores (
idJogador int not null primary key auto_increment, 
nomeJogador varchar (60) not null,
qntdPersonagens decimal (3) not null,
fkPersonagemFavorito int,
foreign key (fkPersonagemFavorito) references Personagens (idPersonagem)
);

alter table Personagens add column super_ varchar (30);

select * from Personagens;
