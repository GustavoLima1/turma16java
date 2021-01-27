package Lista2;

import java.util.Scanner;

public class Exercicio4 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("Escreva um número positivo ");
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
			System.out.println("Seu número é par \nE a sua raiz é: " + Math.sqrt(numero));
		}
		else
		{
			System.out.println("Seu número é impar \nE a sua potência é: " + Math.pow(numero, 2));
		}
	}
}