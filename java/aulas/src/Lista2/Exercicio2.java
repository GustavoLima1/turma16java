package Lista2;

import java.util.Scanner;

public class Exercicio2 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro número");
		n1 = read.nextInt();
		System.out.println("Digite o segundo número");
		n2 = read.nextInt();
		System.out.println("Digite o terceiro número");
		n3 = read.nextInt();
		
		if(n1 > n2 && n1 > n3)
		{
			if( n2 > n3)
			{
				System.out.printf("A ordem crescente é: %d %d %d",n1,n2,n3);
			}
			else
			{
				System.out.printf("A ordem crescente é: %d %d %d",n1,n3,n2);
			}
		}
		else if(n2 > n3)
		{
			if(n1 > n3)
			{
				System.out.printf("A ordem crescente é: %d %d %d",n2,n1,n3);
			}
			else
			{
				System.out.printf("A ordem crescente é: %d %d %d",n2,n3,n1);
			}
		}
		else 
		{
			if(n1 > 2)
			{
				System.out.printf("A ordem crescente é: %d %d %d",n3,n1,n2);
			}
			else
			{
				System.out.printf("A ordem crescente é: %d %d %d",n3,n2,n1);
			}
		}
		
	}
}
