package Desafio;

import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int numero,contador = 0,soma = 0;
		
		System.out.println("Digite um número positivo");
		numero = read.nextInt();
		
		do {
			
				if (numero < 1)
				{
					System.out.println("Digite um número positivo");
					numero = read.nextInt();
				}
			}	while( numero < 1);
		
		if(numero > 0)
		{
			do {
				
				contador++;
				soma+= contador; 
				System.out.printf(" + " +contador);
				
				}	while( contador < numero);
			
			System.out.printf(": %d",soma);
		}
	
	}

}
