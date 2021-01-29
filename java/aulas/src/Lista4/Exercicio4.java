package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		Random random = new Random();
		
		int matriz [] [] = new int [3][3], soma = 0,somaDiagonal = 0;
		
		for( int linha = 0; linha < 3; linha++)
		{
			for(int coluna = 0; coluna <3;coluna++)
			{
				matriz [linha] [coluna] = random.nextInt(9);
				System.out.print("\t"+matriz [linha] [coluna]);	
				soma+=matriz [linha] [coluna];
				if(linha == coluna)
				{
					somaDiagonal+=matriz [linha] [coluna];
				}
			}
			System.out.println();
		}
		System.out.printf("A soma é %d e a soma da primeira diagonal é %d",soma,somaDiagonal);
	}

}
