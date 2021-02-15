create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint(5) auto_increment,
categoria varchar(255) not null,
tipo varchar(255) not null,
primary key (id)
);

insert tb_categoria (categoria,tipo) values ("Medicamentos","Dor e contusão");
insert tb_categoria (categoria,tipo) values ("Medicamentos","Fitoterápico");
insert tb_categoria (categoria,tipo) values ("Medicamentos","Diabetico");
insert tb_categoria (categoria,tipo) values ("Cuidados diários","Higiene oral");
insert tb_categoria (categoria,tipo) values ("Cuidados diários","cabelo");

create table tb_produto(
id bigint (8) auto_increment,
produto varchar(30) not null,
marca varchar(30) not null,
preco decimal(4,2) not null,
precisa_de_receita boolean not null,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produto (produto,marca,preco,precisa_de_receita,categoria_id) values ("Castanha da india","Herbarium",63.16,false,2);
insert tb_produto (produto,marca,preco,precisa_de_receita,categoria_id) values ("Paracetamol","Euro farma",21.07,false,1);
insert tb_produto (produto,marca,preco,precisa_de_receita,categoria_id) values ("Glimepirida","EMS",21.87,false,3);
insert tb_produto (produto,marca,preco,precisa_de_receita,categoria_id) values ("Gliclazida","EMS",15.16,false,3);
insert tb_produto (produto,marca,preco,precisa_de_receita,categoria_id) values ("Shampoo","elserve",10.51,false,5);
insert tb_produto (produto,marca,preco,precisa_de_receita,categoria_id) values ("Shampoo","Unilever",17.60,false,5);
insert tb_produto (produto,marca,preco,precisa_de_receita,categoria_id) values ("Fio dental","colgate",5,false,4);
insert tb_produto (produto,marca,preco,precisa_de_receita,categoria_id) values ("Escova","colgate",5,false,4);

update tb_produto set preco =63.16 where id = 1;

select * from tb_produto where preco > 50 ;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where produto like  "%b%";

select produto,marca,preco,precisa_de_receita,tb_categoria.categoria,tb_categoria.tipo from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.categoria_id;

select produto,marca,preco,precisa_de_receita,tb_categoria.categoria,tb_categoria.tipo from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.categoria_id where tb_categoria.categoria = "Cuidados diários";
