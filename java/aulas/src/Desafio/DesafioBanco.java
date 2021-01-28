package Desafio;

import java.util.Scanner;

public class DesafioBanco 
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Banco G4");
		char opcao2 = '0';
		
		int opcao = 0; 
		
		double saldo = 0.00,chequeEspecial = 1000,debitoChequeEspecial = 0;
		
		System.out.println("Conta 00000");
		
		System.out.println("selecione 1-debito - 2credito");
		opcao = read.nextInt();
		
		if(opcao == 1 && saldo ==0)
		{
			System.out.println("Sua conta ficará negativa tente outra opção");
			System.out.println("selecione 1-debito - 2credito");
		}
		
		System.out.printf("Deseja usar usar o limite? [1-S/2-N] % ",chequeEspecial);
		opcao = read.nextInt();
		
		if(chequeEspecial> 0)
		{
			System.out.println("qual valor deseja pegar empresado?");
			debitoChequeEspecial = read.nextDouble();
			
			chequeEspecial= chequeEspecial -debitoChequeEspecial;
			if
			
			
		}
		
	

		
		
		
		
		
		
		
		
	}
}
