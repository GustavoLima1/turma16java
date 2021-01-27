package aulas;

import java.util.Scanner;

public class Exercicio7 
{
	public static void main(String[] args) 
	{
		int a, b, c, d, e, f, x, y;
		
		Scanner read = new Scanner(System.in);
		System.out.print("Digita valor de a: ");
		a = read.nextInt();
		System.out.print("Digita valor de b: ");
		b = read.nextInt();
		System.out.print("Digita valor de c: ");
		c = read.nextInt();
		System.out.print("Digita valor de d: ");
		d = read.nextInt();
		System.out.print("Digita valor de e: ");
		e = read.nextInt();
		System.out.print("Digita valor de f: ");
		f = read.nextInt();
		
		x = (c*e - b*f) / (a*e - b*d);
		y = (a*f - c*d) / (a*e - b*d);
		System.out.println("Valor de x é: "+ x +"\nValor de y é: " + y);
	}

}
