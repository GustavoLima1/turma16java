package aulas;

import java.util.Scanner;

public class Exercicio2 
{
	public static void main(String[] args)
	{
		int dias = 0, meses = 0, anos = 0;
		Scanner read = new Scanner(System.in);
				System.out.println("Escreva a quantidade de dias que você tem de vida");
		dias = read.nextInt();
				
		anos = dias / 365;
		meses = ( dias % 365)/30;
		dias = ( dias % 365)% 30;
		
		
		System.out.println("Você tem: " + anos+ " anos " + meses + " meses e " + dias + " dias de vida");
	}	
}