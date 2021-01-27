package aulas;

import java.util.Scanner;

public class Exercicio3 
{
	public static void main(String[] args) 
	{
		int event, seconds = 0, minutes = 0, hours = 0;
		
		Scanner read = new Scanner(System.in);
		System.out.println("Escreva a duração do evento");
		event = read.nextInt();
		
		hours = event /60/60;
		minutes = event % 60;
		seconds = event % 60 % 60;
		
		System.out.printf("O evento durou %d Horas %d minutos e %d segundos",hours,minutes,seconds);

	}
}
