package aulas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 
{
	public static void main(String[]args) 
	{
		
		double nota1, nota2, nota3, media;
		Scanner read = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Escreva a nota 1: ");
		nota1 = read.nextDouble();
		System.out.print("Escreva a nota 2: ");
		nota2 = read.nextDouble();
		System.out.print("Escreva a nota 3: ");
		nota3 = read.nextDouble();
		
		
		media = ((nota1*2) + (nota2*3) + (nota3*5)) /10;
		System.out.println("A média do aluno é: " + df.format(media));
		
	}
}
