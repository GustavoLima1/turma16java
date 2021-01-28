package Lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		int idade = 0, contador21 = 0, contador50 = 0;
		
		
		while(idade != -99)
		{
			System.out.print("Digite uma idade: ");
			idade = read.nextInt();
			if(idade > 0 && idade < 21)
			{
				contador21++;
			}
			else if( idade > 50)
			{
				contador50++;
			}
			else if( idade == -99)
			{
				idade = -99;
			}
			else
			{
				System.out.print("Digite uma idade positiva: ");
				idade = read.nextInt();
			}
			
		}
		System.out.printf("Quantidade de pessoas com menos de 21 anos: %d \nQuantidade de pessoas com mais de 50 anos: %d",contador21,contador50);

	}

}
