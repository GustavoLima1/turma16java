package Lista2;

import java.util.Scanner;

public class Exercicio4 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("Escreva um n�mero positivo ");
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
			System.out.println("Seu n�mero � par \nE a sua raiz �: " + Math.sqrt(numero));
		}
		else
		{
			System.out.println("Seu n�mero � impar \nE a sua pot�ncia �: " + Math.pow(numero, 2));
		}
	}
}