package ProjetoCadFun;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String nome;
		int matricula;
		int horas;
		double valorHoras;
		double acrescimo;
		char opcao;
		
		System.out.println("Escreva o nome do funcionário: ");
		nome = read.nextLine();
		System.out.println("Escreva a matricula do funcionário: ");
		matricula = read.nextInt();
		System.out.println("Escreva a quantidade de horas de trabalho: ");
		horas = read.nextInt();
		System.out.println("Escreva o valor da hora trabalhada: ");
		valorHoras = read.nextDouble();
		System.out.println("Funcionário será terceiro ? ");
		opcao = read.next().toUpperCase().charAt(0);
		
		if (opcao == 'S')
		{
			System.out.println("qual a porcentagem do acrescimo ? ");
			acrescimo = read.nextDouble();
			
			Empregado func1 = new Terceiro(nome,matricula,horas,valorHoras,acrescimo);
			
			System.out.printf("Nome: %s  \nMatricula:  %d \nHoras de trabalho : %d \nValor Hora : %.2f \n Salario: %.2f",func1.getNome(),func1.getMatricula(),func1.getHoras(),func1.getValorHora(),func1.salario());
		}
		else
		{
			Empregado func1 = new Empregado("nome",matricula,horas,valorHoras);
			System.out.printf("Nome: %s  \nMatricula:  %d \nHoras de trabalho : %d \n Valor Hora : %.2f\nSalario: %.2f",func1.getNome(),func1.getMatricula(),func1.getHoras(),func1.getValorHora(),func1.salario());
		}
		
			
		
		
		
	
	}
	
	
	
}
