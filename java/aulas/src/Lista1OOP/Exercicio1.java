package Lista1OOP;

import java.util.Scanner;

import entidades.Cliente;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		

		Cliente cliente1 = new Cliente("Gustavo",1999, "Rua","123485623148");
		cliente1.sexo = 'M';
		
		System.out.printf("Informa��es do cliente\n Nome : %s \n Idade aproximada : %d \n Sexo : %s \n Endere�o : %s \n CPF: %s",cliente1.nome,cliente1.idade(), cliente1.sexo, cliente1.endere�o,cliente1.cpf);
		
	}

}
