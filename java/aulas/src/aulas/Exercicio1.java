package aulas;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
			int anos = 0, meses = 0, dias = 0, totalDias;
			
		 System.out.print("Escreva a sua idade: ");
		 anos = read.nextInt();
		 System.out.print("Escreva quantos meses se passaram do mês que você nasceu: ");
		 meses = read.nextInt();
		 System.out.print("Escreva quantos dias se passaram desde o dia que vc nasceu: ");
		 dias = read.nextInt();
		totalDias = anos*365 + meses * 30 + dias; 
		 System.out.printf("Sua quantidade de dias vividos é : "+totalDias);
	}

}
