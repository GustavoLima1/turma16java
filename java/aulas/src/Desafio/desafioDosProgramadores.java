package Desafio;

import java.util.Scanner;

public class desafioDosProgramadores 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("Escreva um n�mero positivo");
		numero = read.nextInt();
		
		if(numero < 0 ) 
		{
			System.out.println("N�o vou calcular n�mero negativo");
		}
		else if(numero == 0) 
		{
			System.out.println("Zero � um numero neutro");
		}
		else if(numero % 2 == 0)
		{
			System.out.println("Seu n�mero � par");
		}
		else
		{
			System.out.println("Seu n�mero � impar");
		}
	}
}
