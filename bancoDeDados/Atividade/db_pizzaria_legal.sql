create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint (5) auto_increment,
tamanho varchar(255) not null,
salgada boolean not null,
primary key (id)
);

insert tb_categoria (tamanho,salgada) values ("Broto",true);
insert tb_categoria (tamanho,salgada) values ("Média ",true);
insert tb_categoria (tamanho,salgada) values ("Grande",true);
insert tb_categoria (tamanho,salgada) values ("Broto",false);
insert tb_categoria (tamanho,salgada) values ("Média",false);

create table tb_pizza(
id bigint(8) auto_increment,
sabor varchar(255) not null,
preco decimal(4,2) not null,
vegana boolean not null,
categoria_id bigint not null,
primary key (id),
Foreign key (categoria_id) references tb_categoria (id)
);

insert tb_pizza (sabor,preco,vegana,categoria_id) values ("Carne seca",39.99,false,2);
insert tb_pizza (sabor,preco,vegana,categoria_id) values ("Mix de cogumelo ",49.99,true,3);
insert tb_pizza (sabor,preco,vegana,categoria_id) values ("Zatar ",49.99,true,2);
insert tb_pizza (sabor,preco,vegana,categoria_id) values ("4 queijos ",39.99,false,3);
insert tb_pizza (sabor,preco,vegana,categoria_id) values ("Carne de soja",49.99,true,1);
insert tb_pizza (sabor,preco,vegana,categoria_id) values ("Beijinho",69.99,false,5);
insert tb_pizza (sabor,preco,vegana,categoria_id) values ("Sensação",39.99,true,4);
insert tb_pizza (sabor,preco,vegana,categoria_id) values ("Brocolis",49.99,true,3);

select * from tb_pizza where preco > 45;

select * from tb_pizza where preco between 29 and 60 ;

select * from tb_pizza where sabor like "%C%";

select sabor, preco,vegana,tb_categoria.tamanho,tb_categoria.salgada from tb_pizza inner join tb_categoria
 on tb_categoria.id = tb_pizza.categoria_id;
 
 select sabor, preco,vegana,tb_categoria.tamanho,tb_categoria.salgada from tb_pizza inner join tb_categoria
 on tb_categoria.id = tb_pizza.categoria_id where salgada = false;