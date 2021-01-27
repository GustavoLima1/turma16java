package Desafio;

import java.util.Scanner;

public class desafioDosProgramadores 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("Escreva um número positivo");
		numero = read.nextInt();
		
		if(numero < 0 ) 
		{
			System.out.println("Não vou calcular número negativo");
		}
		else if(numero == 0) 
		{
			System.out.println("Zero é um numero neutro");
		}
		else if(numero % 2 == 0)
		{
			System.out.println("Seu número é par");
		}
		else
		{
			System.out.println("Seu número é impar");
		}
	}
}
