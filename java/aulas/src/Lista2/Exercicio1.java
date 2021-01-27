package Lista2;

import java.util.Scanner;

public class Exercicio1 
{
	public static void main(String[] args) 
	{
		int n1, n2, n3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Escreva um número");
		n1 = read.nextInt();
		System.out.print("Escreva o segundo número");
		n2 = read.nextInt();
		System.out.print("Escreva o terceiro número");
		n3 = read.nextInt();
		
		if(n1 > n2 && n1 > n3)
		{
			System.out.printf("O primeiro número: %d é o maior número",n1);
		}
		else if(n2 > n3)
		{
			System.out.printf("O Segundo número: %d é o maior número",n2);
		}
		else
		{
			System.out.printf("O terceiro número: %d é o maior número",n3);
		}
 	}
}
