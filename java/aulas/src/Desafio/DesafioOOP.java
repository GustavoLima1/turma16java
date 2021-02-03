package Desafio;

import entidades.Produto;

public class DesafioOOP 
{
	public static void main(String[] args) 
	{
		Produto item1 = new Produto("01"); 
		Produto item2 = new Produto("02","Camisa"); 
		Produto item3 = new Produto("03",23.50,"Camisa"); 
		System.out.println();
		
		System.out.printf(item3.descriçao+"\n");
		System.out.printf(item2.descriçao+"\n");
		System.out.printf(item1.codigo+"\n");
	}

}
