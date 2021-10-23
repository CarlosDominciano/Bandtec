-- escolher um jogo; criar min 3, max 5 tabelas; tabelas precisam se relacionar;
-- sera contabilizada como tabela, tabelas associativas (obrigatorio ter uma associativa); 
-- usar relacionamento forte, fraco, 1 para n, 1 para 1;
-- escrever as regras;

create database BrawlStars;
use BrawStars;

create table Raridade (
idRaridade int not null primary key auto_increment, 
nomeRaridade varchar (12);
);