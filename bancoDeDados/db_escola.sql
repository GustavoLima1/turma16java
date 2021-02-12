create database db_escola;

use db_escola;

create table tb_alunos(
matricula bigint(7) auto_increment,
nome varchar(255) not null,
idade int not null,
genero varchar(1) not null,
turma varchar(20) not null,
nota float not null,
primary key(matricula)
);

insert into tb_alunos (nome,idade,genero,turma,nota) values ("Viviane", 11, "M", "5ª A",9.5);
insert into tb_alunos (nome,idade,genero,turma,nota) values ("Fernando", 13, "F" , "7ª B",7.7);
insert into tb_alunos (nome,idade,genero,turma,nota) values ("Carla", 16, "M" , "2º B",5.5);
insert into tb_alunos (nome,idade,genero,turma,nota) values ("Jessica", 15, "M" , "1º E",8);
insert into tb_alunos (nome,idade,genero,turma,nota) values ("Felipe", 12, "O" , "6ª C",3);

select * from tb_alunos where nota < 7;
select * from tb_alunos where nota > 7;

update tb_alunos set nota = 7 WHERE matricula = 2;

select * from tb_alunos;