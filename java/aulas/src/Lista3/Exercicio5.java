package Lista3;

import java.util.Scanner;

public class Exercicio5
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int numero = 1, soma = 0;
		
		do
		{	
			System.out.println("Digite um n�mero");
			numero = read.nextInt();
			
			soma+= numero;
			
			
		}while(numero !=0);
		System.out.printf("A soma dos n�mero �: %d ", soma);
	}
}
