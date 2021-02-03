package Desafio;

import java.util.Scanner;

import entidades.Pessoa;

public class DesafioObjeto {

	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		Pessoa pessoa1 = new Pessoa("Gustavo");
		Pessoa pessoa2 = new Pessoa("JEAN",true);
		
		
		
		System.out.println("Digite seu sexo [M/F]");
		pessoa1.sexo = read.next().toUpperCase().charAt(0);
		
		System.out.println("Digite seu ano de nascimento [aaaa]");
		pessoa1.anoNascimento = read.nextInt();
		
		
		
		System.out.printf("Bem vindo, %s %s ,%s",pessoa1.tratar(),pessoa1.nome,pessoa1.mensagem());
	
		
		
		
		
	}

}
