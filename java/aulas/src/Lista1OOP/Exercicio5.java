package Lista1OOP;

import entidades.Patinete;

public class Exercicio5 
{
	public static void main(String[] args) 
	{
		Patinete produto = new Patinete("Modelo Nike",40,"Rosa",75.50);
		
		System.out.printf("Patinete : %s \n Tamanho: %d \n Cor: %s \n preço : %.2f ",produto.nome,produto.tamanho,produto.cor,produto.preço);
	}
}
