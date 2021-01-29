package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		Random random = new Random();
		
		int n1 [] [] = new int [4][6];
		int n2 [] [] = new int [4][6];
		int m1 [] [] = new int [4][6];
		int m2 [] [] = new int [4][6];
		
		System.out.println( "MATRIZ N1\n");
		for( int linha = 0; linha < 4; linha++)
		{
			for(int coluna = 0; coluna < 6 ;coluna++)
			{
				n1 [linha] [coluna] = random.nextInt(9);
				System.out.print("\t"+n1 [linha] [coluna]);	
			}
			System.out.println();
		}	
		
		System.out.println( "\nMATRIZ N2\n");
		for( int linha = 0; linha < 4; linha++)
		{
			for(int coluna = 0; coluna < 6 ;coluna++)
			{
				n2 [linha] [coluna] = random.nextInt(9);
				System.out.print("\t"+n2 [linha] [coluna]);	
			}
			System.out.println();
		}	
		
		System.out.println( "\\nMATRIZ M1\n");
		for( int linha = 0; linha < 4; linha++)
		{
			for(int coluna = 0; coluna < 6 ;coluna++)
			{
				m1 [linha][coluna]= n1 [linha] [coluna] + n2 [linha] [coluna];
				System.out.print("\t"+m1 [linha] [coluna]);	
			}
			System.out.println();
		}	
		System.out.println( "\nMATRIZ M1\n");
		for( int linha = 0; linha < 4; linha++)
		{
			for(int coluna = 0; coluna < 6 ;coluna++)
			{
				m2 [linha][coluna]= n1 [linha] [coluna] - n2 [linha] [coluna];
				System.out.print("\t"+m2 [linha] [coluna]);	
			}
			System.out.println();
		}	
		System.out.println("FIM DO PROGRAMA!");
		
	}
}
