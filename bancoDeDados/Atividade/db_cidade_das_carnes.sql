create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
 id bigint(5) auto_increment,
 tipo varchar(255) not null,
 disponivel boolean not null,
 primary key (id)
 );

insert  tb_categoria (tipo, disponivel)values ("Aves", true);
insert  tb_categoria (tipo, disponivel)values ("Bovinas", true);
insert  tb_categoria (tipo, disponivel)values ("Frutos do mar", true);
insert  tb_categoria (tipo, disponivel)values ("Suína", true);
insert  tb_categoria (tipo, disponivel)values ("Frios", false);

create table tb_produto (
	id bigint(5) auto_increment,
    nome varchar(255) not null,
    preco decimal(4,2) not null,
    quantidade_kg int not null,
	id_categoria bigint,
    
    primary key (id),
    foreign key (id_categoria) references tb_categoria(id)
    );
    
insert  tb_produto (nome, preco, quantidade_kg, id_categoria)values ("Coração de Frango", 21.95, 20, 1);
insert  tb_produto (nome, preco, quantidade_kg, id_categoria)values ("Coxinha da Asa", 16.90,  90, 1);
insert  tb_produto (nome, preco, quantidade_kg, id_categoria)values ("Frango Inteiro", 20.00, 40, 1);
insert  tb_produto (nome, preco, quantidade_kg, id_categoria)values ("Carne Bovina", 90.00,  85, 2);
insert  tb_produto (nome, preco, quantidade_kg, id_categoria)values ("Camarão Cozido", 65.00, 50, 3);
insert  tb_produto (nome, preco, quantidade_kg, id_categoria)values ("Pernil", 30.00, 30, 4);
insert  tb_produto (nome, preco, quantidade_kg, id_categoria)values ("Mussarela", 2.50, 0.100, 5);

select * from tb_produto where preco > 50.00;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%c%";

select nome, preco,quantidade_kg, tb_categoria.tipo,tb_categoria.disponivel from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.id_categoria;

select nome, preco,quantidade_kg, tb_categoria.tipo,tb_categoria.disponivel from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.id_categoria where disponivel = false;