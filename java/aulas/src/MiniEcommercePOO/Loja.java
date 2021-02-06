package MiniEcommercePOO;

import java.util.Locale;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		char comando;
		System.out.println("───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───\r\n"
				+ "───█▒▒░░░░░░░░░▒▒█───\r\n"
				+ "────█░░█░░░░░█░░█────\r\n"
				+ "─▄▄──█░░░▀█▀░░░█──▄▄─\r\n"
				+ "█░░█─▀▄░░░░░░░▄▀─█░░█\r\n"
				+ "█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\r\n"
				+ "█░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█\r\n"
				+ "█░░║║║╠─║─║─║║║║║╠─░░█\r\n"
				+ "█░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█\r\n"
				+ "█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█");
		linha(32);
		System.out.print("\nPAGUFE PET\nAqui, seu animal é mais feliz! \n");
		linha(32);
		System.out.print("\nInforme seu nome: ");
		String nome = ler.nextLine();
		System.out.print("Informe seu sexo [M/F/O]: ");
		char sexo = ler.next().toUpperCase().charAt(0);
		
		while(sexo != 'M' && sexo != 'F' && sexo != 'O')
		{
			System.out.print("Informe seu sexo [M/F/O]: ");
			sexo = ler.next().toUpperCase().charAt(0);
		}
		
		Cliente cliente = new Cliente(nome,sexo);
		
		System.out.print("\nCOMANDOS:\na = Adicionar produto ao carrinho\nr = Retirar produto do carrinho\nc = Exibir o carrinho de compras\nf = Finalizar compra\ns = Sair\n");
		System.out.print("\nDigite o que deseja: ");
		comando = ler.next().toLowerCase().charAt(0);
		
		
	}
	public static void linha(int tamanho) 
	{
		for (int x=1;x< tamanho; x++)
		{
			System.out.print("_");
		}
		System.out.println();
	}
	

}
