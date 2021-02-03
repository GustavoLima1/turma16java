package Lista1OOP;

import java.util.Scanner;

import entidades.Cliente;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		

		Cliente cliente1 = new Cliente("Gustavo",1999, "Rua","123485623148");
		cliente1.sexo = 'M';
		
		System.out.printf("Informações do cliente\n Nome : %s \n Idade aproximada : %d \n Sexo : %s \n Endereço : %s \n CPF: %s",cliente1.nome,cliente1.idade(), cliente1.sexo, cliente1.endereço,cliente1.cpf);
		
	}

}
