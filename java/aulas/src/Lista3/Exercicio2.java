package Lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		final int totalPessoas = 10;
		int contadorPar = 0,contadorImpar = 0, numero= 0;
		
	
		for(int x = 0; x < totalPessoas;x++)
		{
			System.out.println("Digite um número positivo");
			numero = read.nextInt();
			
			if( numero < 1)
			{
				System.out.println("Tente novamente . Digite um número positivo");
				numero = read.nextInt();
			}
			if(numero % 2 == 0)
			{
				contadorPar++;
			}
			else
			{
				contadorImpar++;
			}
			
		}
		System.out.printf("Quantidade de par: %d \nQuantidade de impar: %d ",contadorPar,contadorImpar);
	}

}
