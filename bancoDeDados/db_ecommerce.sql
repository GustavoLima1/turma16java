create database db_ecommerce;

use db_ecommerce;

create table tb_roupas(
id bigint(5) auto_increment,
nome varchar(255) not null,
Tamanho varchar(255) not null,
Preco decimal (5,2) not null,
marca varchar(255) not null,
primary key (id)
);

insert into tb_roupas (nome, Tamanho, Preco, marca) values ("Tênis","37", 399.9, "Adidas");
insert into tb_roupas (nome, Tamanho, Preco, marca) values ("Camisa", "G", 69.90, "Nike");
insert into tb_roupas (nome, Tamanho, Preco, marca) values ("calça", "M", 59.60, "Bivik");
insert into tb_roupas (nome, Tamanho, Preco, marca) values ("Saia", "G", 44.90, "Renner");
insert into tb_roupas (nome, Tamanho, Preco, marca) values ("Blusa", "M", 119.90, "Hering");

select * from tb_roupas where preco > 500;
select * from tb_roupas where preco < 500;
update tb_roupas set preco = 599.99 where id = 2;
