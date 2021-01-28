package Desafio;

import java.util.Scanner;

public class Desafio2 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		final double habitantes= 3;
		
		double filhos = 0,mFilhos = 0,tFilhos = 0,salario =0,mSalario = 0,tSalario = 0,maiorSalario = 0,percentagem = 0, contador = 0;
		
		for ( int x = 1; x <= habitantes; x++)
		{
			System.out.printf("Informe o sálario do habitante %d: ", x);
			salario = read.nextDouble();
			System.out.printf("Informe a quantidade de filhos do habitante %d: ",x);
			filhos = read.nextDouble();
			
			tFilhos+=filhos;
			tSalario+=salario;
			mFilhos = tFilhos/habitantes;
			mSalario = tSalario / habitantes;
			if ( salario > maiorSalario)
			{
				maiorSalario = salario;
			}
			if(salario < 100)
			{
				contador++;
			}
			percentagem = ((contador/habitantes)*100);
		}
		percentagem = contador / habitantes;
		System.out.printf("média de salarios %.002f \nmédia de filhos %.002f\nmaior salário é %.002f \npercentagem de pessoas com salario menor que 100: %.002f ",mSalario,mFilhos,maiorSalario,percentagem);
	}
}
