package aulas;

import java.util.Scanner;

public class Exercicio4
{
	public static void main(String[] args)
	{
		double a, b, c, r, s,d;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Escreva um número [A]");
		a = read.nextDouble();
		System.out.println("Escreva um número [B]");
		b = read.nextDouble();
		System.out.println("Escreva um número [C]");
		c = read.nextDouble();
		
		r = Math.pow((a + b),2);
		s = Math.pow((b+c),2);
		d = (r + s) / 2.0 ;
		
		System.out.printf("Valor de D é: " + d);
	}
}
