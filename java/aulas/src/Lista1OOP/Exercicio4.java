package Lista1OOP;

import entidades.Funcionario;

public class Exercicio4 
{
	public static void main(String[] args)
	{
		Funcionario func1 = new Funcionario("Jose",1200.50,'M',20);
		Funcionario func2 = new Funcionario("Maria",3200.50,'F',31);
		
		System.out.printf("Olá ,%s %s, seu salário é de: %.2f R$ \n",func1.tratar(),func1.nome,func1.salario);
		System.out.printf("Olá ,%s %s, seu salário é de: %.2f R$",func2.tratar(),func2.nome,func2.salario);
	
		
		
	}
}
