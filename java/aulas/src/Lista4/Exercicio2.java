package Lista4;

import java.util.Scanner;

public class Exercicio2 
{

	public static void main(String[] args) 
	{
	Scanner read = new Scanner(System.in);
	final int TENTATIVAS = 10;
	int lan�amento[] = new int[TENTATIVAS],maiorLan�amento = 0, contador = 0,totalPontua��o = 0;
	double media = 0;
	
		for(int x =0 ; x < TENTATIVAS;x++)
		{
			System.out.print("Digite o valor do lan�amento");
			lan�amento[x] = read.nextInt();
		
			if(lan�amento[x] > maiorLan�amento)
			{
				contador = 1;
				maiorLan�amento = lan�amento[x];
			}
			else if(lan�amento[x] == maiorLan�amento)
			{
				contador++;
			}
			totalPontua��o += lan�amento[x];
			media =(double) totalPontua��o / TENTATIVAS;
		}
		System.out.printf("\nA m�dia � %.002f e a Maior Pontua��o apareceu %d vezes",media,contador);
	}

}
