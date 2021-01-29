package Lista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int pontuacao [] = new int [5], maiorPontuaçao = 0;
		
		
		for(int x = 0; x < 5;x++)
		{
			
		System.out.printf("Digite o valor da pontuação da rodada %d: ",(x+1));
		pontuacao[x] = read.nextInt();
		while(pontuacao[x] < 0)
		{
			System.out.printf("Digite um valor positivo na pontuação da rodada %d: ",(x+1));
			pontuacao[x] = read.nextInt();
		}
		
		if(pontuacao[x] > maiorPontuaçao )
		{
			maiorPontuaçao = pontuacao[x];
		}
		
		}
		System.out.printf("\nA maior Pontuação foi %d",maiorPontuaçao);
	}

}
