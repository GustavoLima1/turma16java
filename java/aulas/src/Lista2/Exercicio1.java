package Lista2;

import java.util.Scanner;

public class Exercicio1 
{
	public static void main(String[] args) 
	{
		int n1, n2, n3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Escreva um n�mero");
		n1 = read.nextInt();
		System.out.print("Escreva o segundo n�mero");
		n2 = read.nextInt();
		System.out.print("Escreva o terceiro n�mero");
		n3 = read.nextInt();
		
		if(n1 > n2 && n1 > n3)
		{
			System.out.printf("O primeiro n�mero: %d � o maior n�mero",n1);
		}
		else if(n2 > n3)
		{
			System.out.printf("O Segundo n�mero: %d � o maior n�mero",n2);
		}
		else
		{
			System.out.printf("O terceiro n�mero: %d � o maior n�mero",n3);
		}
 	}
}
