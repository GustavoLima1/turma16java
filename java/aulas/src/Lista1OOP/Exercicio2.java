package Lista1OOP;

import entidades.Aviao;

public class Exercicio2 
{
	public static void main(String[] args) 
	{
		char opçao = 'S';
		int numero ;
	 Aviao aviao1 = new Aviao("AirLine153",2008,253); 
	 aviao1.velocidadeAtual = 100;
	 aviao1.estado( aviao1.velocidadeAtual) ;
	
	
	 System.out.printf("Nome do avião: "+aviao1.nome+"\n"
			 +"Tempo de vida do avião: "+aviao1.Idade()+" anos\n"
			 +"Quantidade de lugares: "+ aviao1.quantidadeLugares+"\n"
			 +"avião parado ?: " +(aviao1.estado(aviao1.velocidadeAtual)));
	 			System.out.println("\n");
	 			
	 			aviao1.velocidade = 50;
	 			
	 			aviao1.aumentarVelocidade(aviao1.velocidade);
	 
	 			System.out.printf("Aumentando velocidade %.2f : \n",aviao1.velocidadeAtual);
	 			
	 			aviao1.diminuirVelocidade(aviao1.velocidade);
	 	
	 			System.out.printf("Diminuindo velocidade %.2f : ",aviao1.velocidadeAtual);
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
