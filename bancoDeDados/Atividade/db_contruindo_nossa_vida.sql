create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint (5) auto_increment,
categoria varchar(255) not null,
disponivel boolean not null,
primary key (id)
);

insert tb_categoria (categoria,disponivel) values ("Material de construção", true);
insert tb_categoria (categoria,disponivel) values ("Tinta", true);
insert tb_categoria (categoria,disponivel) values ("Piso", true);
insert tb_categoria (categoria,disponivel) values ("Janelas", true);
insert tb_categoria (categoria,disponivel) values ("Madeira", true);

create table tb_produto(
id bigint (8) auto_increment,
produto varchar(40) not null,
marca varchar(40) not null,
preco decimal(5,2) not null,
quantidade int not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produto (produto,marca,preco,quantidade,categoria_id) values ("blocos","Nova união",0.99,2000,1);
insert tb_produto (produto,marca,preco,quantidade,categoria_id) values ("Tinta fosco roxo"," união",389.99,1500,2);
insert tb_produto (produto,marca,preco,quantidade,categoria_id) values ("Tinta fosco azul"," união",489.99,3500,2);
insert tb_produto (produto,marca,preco,quantidade,categoria_id) values ("Piso laminado prime","Eucatex",49.99,6500,3);
insert tb_produto (produto,marca,preco,quantidade,categoria_id) values ("Piso laminado encaixe","Eucatex",39.99,200,3);
insert tb_produto (produto,marca,preco,quantidade,categoria_id) values ("janela de aço","romex",465.99,200,4);
insert tb_produto (produto,marca,preco,quantidade,categoria_id) values ("Janela de aluminio","fortsol",399.99,200,4);
insert tb_produto (produto,marca,preco,quantidade,categoria_id) values ("Chapa MDF Cru","Viapol",49.99,200,5);

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where produto like "%c%";

select produto,marca,preco,quantidade,tb_categoria.categoria,tb_categoria.disponivel from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.categoria_id;

select produto,marca,preco,quantidade,tb_categoria.categoria,tb_categoria.disponivel from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.categoria_id where categoria_id = 2;
