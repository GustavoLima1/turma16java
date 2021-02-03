package Lista1OOP;

import entidades.Eletronico;

public class Exercicio3 {
	public static void main(String[] args)
	{
		Eletronico item1 = new Eletronico("Computador",true,1800.25,"Cinza");
		Eletronico item2 = new Eletronico("Ventilador",false,25,"Branco");
		
		System.out.printf(" Item : %s \n Funcionando: %b \n preço: %.2f  \n cor: %s \n \n",item1.nome,item1.funcionando,item1.preço,item1.cor);
		System.out.printf(" Item : %s \n Funcionando: %b \n preço: %.2f  \n cor: %s \n",item2.nome,item2.funcionando,item2.preço,item2.cor);
		
	}

}
