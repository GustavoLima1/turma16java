package aulas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 
{
	public static void main(String[] args) 
	{
		double p1,p2,x1,x2,y1,y2,d;
		
		Scanner read = new Scanner(System.in);
		System.out.print("escreva x1: ");
		x1 = read.nextDouble();
		System.out.print("escreva x2: ");
		x2 = read.nextDouble();
		System.out.print("escreva y1: ");
		y1 = read.nextDouble();
		System.out.print("escreva y2: ");
		y2 = read.nextDouble();
		
		p1 = Math.pow((x2 - x1),2);
		p2 = Math.pow((y2 - y1),2);
		
		d = Math.sqrt(p1 + p2);
		System.out.printf("A resposta da equação é: "+d);
	}
}
