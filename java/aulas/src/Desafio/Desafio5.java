package Desafio;

import java.util.Scanner;

public class Desafio5 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		String  agenda [][] = new String[24][31];
		int dia = 0, hora = 0;
		char opçaoSN;
		
		
			do
			{
				System.out.println("Escolha um dia");
				dia = read.nextInt();
				while( dia <= 0 || dia> 31)
				{
					System.out.println("Data informada incorreta. Escolha [1/31]");
					dia = read.nextInt();
				}
				dia -=1;
				System.out.println("Selecione a hora do evento");
				hora = read.nextInt();
				
				while(hora <0 || hora > 23)
				{
					System.out.println("Hora incorreta. Selecione a hora do evento");
					hora = read.nextInt();
				}
				System.out.println("Informe o evente nesta data e hora");
				agenda [hora] [dia] = read.next();
				
				System.out.println("Deseja continuar [S/N]?");
				opçaoSN = read.next().toUpperCase().charAt(0);
					
			
			}while(opçaoSN != 'N');
			
		
		for(int x = 0;x < 24; x++)
		{
			for(int y = 0;y < 31; y++)
			{
				
				if(agenda[x][y] != null)
				{
					System.out.printf(" hora  %d dia do evento %d evento %s", x, (y+1),agenda[x][y]);
				}
				System.out.println();
			}
		}
		
	}		
	
}
