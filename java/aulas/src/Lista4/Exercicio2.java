package Lista4;

import java.util.Scanner;

public class Exercicio2 
{

	public static void main(String[] args) 
	{
	Scanner read = new Scanner(System.in);
	final int TENTATIVAS = 10;
	int lançamento[] = new int[TENTATIVAS],maiorLançamento = 0, contador = 0,totalPontuação = 0;
	double media = 0;
	
		for(int x =0 ; x < TENTATIVAS;x++)
		{
			System.out.print("Digite o valor do lançamento");
			lançamento[x] = read.nextInt();
		
			if(lançamento[x] > maiorLançamento)
			{
				contador = 1;
				maiorLançamento = lançamento[x];
			}
			else if(lançamento[x] == maiorLançamento)
			{
				contador++;
			}
			totalPontuação += lançamento[x];
			media =(double) totalPontuação / TENTATIVAS;
		}
		System.out.printf("\nA média é %.002f e a Maior Pontuação apareceu %d vezes",media,contador);
	}

}
