package Lista3OOP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainLoja {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		List <Produto> lista = new ArrayList<>();
		char opcao = '0';
		while (opcao != '4')
		{
			List <Produto> Estoque = new ArrayList<>();
			Estoque.add(new Produto("Camisetas",120,30.50));
			Estoque.add(new Produto("Tênis",30,250.99));
			
			System.out.print("\nEscolha a opção: \n");
			System.out.println("1 - Adicionar Novo Produto");
			System.out.println("2 - Atualizar Produto");
			System.out.println("3 - Remover Produto");
			System.out.println("4 - Sair do programa");
			opcao = read.next().charAt(0);
			
			
			if(opcao =='1') 
			{
				System.out.println("Digite o nome do produto: ");
				String nome = read.next();
				System.out.println("Digite o valor do produto: ");
				double valor = read.nextDouble();
				System.out.println("Digite a quantidade disponível: ");
				int quantidade = read.nextInt();
				Produto produto = new Produto(nome, quantidade, valor);
				Estoque.add(produto);
			}
			else if(opcao == 2)
			{
				System.out.println("Digite o nome do produto que deseja atualizar: ");
				String nomeProduto = read.next();
				System.out.println("Digite as novas informações do produto: ");
				System.out.println("Nome: ");
				String nome2 = read.next();
				System.out.println("Valor: ");
				double preco2 = read.nextDouble();
				System.out.println("Quantidade em Estoque: ");
				int quantidade2 = read.nextInt();
				for (Produto produtoNovo : Estoque) {
					if (produtoNovo.getNome().equals(nomeProduto))
					{
						produtoNovo.setNome(nome2);
						produtoNovo.setPreco(preco2);
						produtoNovo.setQuantidade(quantidade2);
					}
				}
			}	
			else if(opcao == 3)
			{
				System.out.println("Digite o nome do produto que deseja remover: ");
				String nomeremover = read.next();
				for (Produto produtoNovo : Estoque) {
					if (produtoNovo.getNome().equals(nomeremover))
					{
						Estoque.remove(produtoNovo);
					}
				}
			}	
			
			System.out.println("\t\tProdutos em estoque:  ");
			System.out.println("\tValor\tQuantidade\tproduto");
			for (Produto produtoAtual : Estoque) 
			{		
				System.out.print("\n\t"+produtoAtual.getPreco());
				System.out.print("\t\t"+produtoAtual.getQuantidade());
				System.out.print("\t"+produtoAtual.getNome());
			}			
		}	
		
	}
		
}


