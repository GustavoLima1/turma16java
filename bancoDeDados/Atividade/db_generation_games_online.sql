create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint(5) auto_increment,
classe varchar(255) not null,
arma varchar(255) not null,
primary key(id)
);

insert tb_classe ( classe, arma ) values ("Guerreiro", " Machado");
insert tb_classe ( classe, arma ) values ( "Mago" , " Varinha");
insert tb_classe ( classe, arma ) values ( "Arqueiro", "Arco");
insert tb_classe ( classe, arma ) values ( "Assassino", "Adaga");
insert tb_classe ( classe, arma ) values ( "Necromante", "Cajado");

create table tb_personagem(
id bigint auto_increment,
nick varchar(255) not null,
ataque int not null,
defesa int not null,
inteligencia int not null,
destreza int  not null,
classe_id bigint,
primary key (id),
foreign key (classe_id) references tb_classe (id)
);

insert tb_personagem (nick, ataque, defesa, inteligencia, destreza, classe_id) values ("Cavalery",1900,3000,1000,1300,1);
insert tb_personagem (nick, ataque, defesa, inteligencia, destreza, classe_id) values ("Valder",2100,1050,2500,1100,2);
insert tb_personagem (nick, ataque, defesa, inteligencia, destreza, classe_id) values ("Arquimed",2600,1050,1500,2000,3);
insert tb_personagem (nick, ataque, defesa, inteligencia, destreza, classe_id) values ("Victor",2400,1500,2000,1100,4);
insert tb_personagem (nick, ataque, defesa, inteligencia, destreza, classe_id) values ("Nec",1800,1900,2000,1500,5);
insert tb_personagem (nick, ataque, defesa, inteligencia, destreza, classe_id) values ("Marty",1800,3100,1100,1400,1);

select * from tb_personagem where ataque > 2000;

select * from tb_personagem where defesa between 1000 and 2000;

select * from tb_personagem where nick like "%C%";

select nick, ataque, defesa, inteligencia, destreza, tb_classe.classe, tb_classe.arma from tb_personagem inner join tb_classe on
tb_classe.id = tb_personagem.classe_id;

select nick, ataque, defesa, inteligencia, destreza, tb_classe.classe, tb_classe.arma from tb_personagem inner join tb_classe on
tb_classe.id = tb_personagem.classe_id where classe = "Guerreiro";



