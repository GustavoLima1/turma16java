package aulas;

import java.util.Scanner;

public class Exercicio8
{
	public static void main(String[] args)
	{
		double custoFabrica, impostos, distribuidor;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o valor do carro: ");
		custoFabrica = read.nextDouble();
		
		distribuidor = custoFabrica*0.28;
		impostos = custoFabrica*0.45;
		System.out.printf("Valor de fabrica %.002f R$ valor ao consumidor %.002f R$",custoFabrica,(custoFabrica+impostos+distribuidor));
				
		
	}
}
