-- cria um banco de dados 
create database db_servico_rh;
-- acessa o banco
use db_servico_rh;
-- cria a tabela funcionário
create table tb_funcionario(
id bigint auto_increment,
nome varchar(255)not null,
idade int not null,
salario float not null,
departamento varchar(30),
funcao varchar(35),
primary key(id)
);
-- Inserir 
select * from tb_funcionario;
insert into tb_funcionario (nome,idade,salario,departamento,funcao) value("Rafael",21,1900.30,"RH","Analista");
insert into tb_funcionario (nome,idade,salario,departamento,funcao) value("mayara",27,3000.50,"financeiro","Analista pleno");
insert into tb_funcionario (nome,idade,salario,departamento,funcao) value("David",21,5300.99,"Marketing","Supervisor");
insert into tb_funcionario (nome,idade,salario,departamento,funcao) value("Daiane",35,7800,"Marketing","Gerente");
insert into tb_funcionario (nome,idade,salario,departamento,funcao) value("Manoel",35,7800,"TI","Engenheiro de software");

select  * from  tb_funcionario where salario > 2000;
select  * from  tb_funcionario where salario < 2000;

update tb_funcionario set salario = 9800.78 where id = 5;



