

insert tb_curso (curso,valor,nivel,categoria_id) values ("portugol",69.90,"basico",1);
insert tb_curso (curso,valor,nivel,categoria_id) values ("JavaScript",29.90,"basico",2);
insert tb_curso (curso,valor,nivel,categoria_id) values ("mySql",118.99,"anvançado",3);
insert tb_curso (curso,valor,nivel,categoria_id) values ("Angular",55.90,"Intermediário",4);
insert tb_curso (curso,valor,nivel,categoria_id) values ("Java",119.90,"Avançado",5);
insert tb_curso (curso,valor,nivel,categoria_id) values ("java",89.90,"basico",5);
insert tb_curso (curso,valor,nivel,categoria_id) values ("HTML",45.90,"Intermediário",4);
insert tb_curso (curso,valor,nivel,categoria_id) values ("CSS",50.00,"Avançado",4);

select * from tb_curso;

select * from tb_curso where valor > 50;

select * from tb_curso where valor between 3 and 60;

select * from tb_curso where curso like "%J%";

select * from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id;

select curso,valor,nivel, tb_categoria.categoria, tb_categoria.disponivel from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id where tb_categoria.categoria = "Front end";