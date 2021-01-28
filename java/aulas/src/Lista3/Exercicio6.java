package Lista3;

import java.util.Scanner;

public class Exercicio6 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int numero = 1, soma = 0, contador=0;
		double  media = 0;
		
		do {
			System.out.println("Digite um número");
			numero = read.nextInt();
			
			if(numero % 3 == 0 && numero != 0 )
			{
				soma+=numero;
				contador++;

				media =(double) soma / contador;
			}
			
		}while(numero != 0);
		if(contador!=0)
		{
			System.out.printf("A média dos numeros multiplos de 3 é: %.002f", media);
		}
		else
		{
			System.out.println("Não encontramos nenhum multiplo de 3");
		}
		
		
		
	}
}
