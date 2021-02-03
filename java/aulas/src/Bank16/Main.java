package Bank16;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		double valor= 0;
		int talao = 0;
		int dia = 0;
		
		System.out.println("Conta Corrente");
		
		Corrente conta2 = new Corrente("0002","12348756214");
		
		System.out.println("Digite o valor que deja creditar");
		valor = read.nextDouble();
		conta2.creditar(valor);
			
		System.out.println("Digite o valor que deja debitar");
		valor = read.nextDouble();
		
		conta2.debitar(valor);
		
		System.out.println("Digite a quantidade de talão que vc deseja");
		talao = read.nextInt();
		
		conta2.emitirTalao(talao);
		
		System.out.print("Seu Saldo é: "+conta2.getSaldo()+"\nQuantidade de talão emitido: "+ conta2.getTalao());
		
		
		System.out.println("\n\nConta poupança");
		Poupanca conta3 = new Poupanca("0004","1234875142",05);
		
		System.out.println("Digite o valor que deja creditar");
		valor = read.nextDouble();
		conta3.creditar(valor);
			
		System.out.println("\nDigite o valor que deja debitar");
		valor = read.nextDouble();
		
		conta3.debitar(valor);
		
		
		System.out.print("Seu Saldo é: "+conta3.getSaldo());
		
		System.out.println("\nQue dia é hoje");
		dia = read.nextInt();
		conta3.correcao(dia);
		
		System.out.print("Seu Saldo é: "+conta3.getSaldo());
		
		
	}

}
