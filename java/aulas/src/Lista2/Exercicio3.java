package Lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) 
	{
		int idade;
		Scanner read = new Scanner(System.in);
		
		System.out.print("Escreva a sua idade");
		idade = read.nextInt();
		
		if(idade < 10)
		{
			System.out.println("Infezlimente você não tem idade o suficiente para participar");
		}
		else if(idade < 15)
		{
			System.out.printf("Você tem %d anos. Está na categoria Infantil",idade);
		}
		else if(idade < 18)
		{
			System.out.printf("Você tem %d anos. Está na categoria Juvenil ",idade);
		}
		else if(idade < 26)
		{
			System.out.printf("Você tem %d anos. Está na categoria Adulto ",idade);
		}
		else
		{
			System.out.printf("Você tem %d anos. Ainda não temos um categoria para a sua idade ",idade);
		}
	}

}
