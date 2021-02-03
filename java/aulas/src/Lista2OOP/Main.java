package Lista2OOP;

public class Main 
{
	public static void main(String[] args) 
	{
		Fornecedor forn1 = new Fornecedor("Magazine", " Rua rio verde", "(11)98173-6677",1000, 6000);
		
		System.out.println("Fornecedor: "+ forn1.getNome()+"\nEndere�o: " + forn1.getEndere�o()+"\nTelefone: "+forn1.getTelefone()+"");
		System.out.println("Saldo da empresa: "+forn1.obterSaldo(forn1.getValorCredito(), forn1.getValorDivida())+"R$ \n\n");
		
		Empregado empreg1 = new Empregado("Francisco","Rua Veridiano","(11)95725-6487",05,1640,9);
		
		System.out.printf("Nome do Funcion�rio: %s \nEndere�o: %s \nN�mero : %s \nSetor: %d \nSalario base: %.2f \nImposto: %.2f %% \n",empreg1.getNome(),empreg1.getEndere�o(),empreg1.getTelefone(),empreg1.getCodigoSetor(),empreg1.getSalarioBase(),empreg1.getImposto());
		System.out.printf("Sal�rio l�quido: "+empreg1.obterSalario(empreg1.getSalarioBase(),empreg1.getImposto()));
		
		Administrador admin1 = new Administrador("Victor","Rua Marcos dourado","(11)98564-3278",450.50);
		
		System.out.printf("\n\nNome do Funcion�rio: %s \nEndere�o: %s \nN�mero : %s \nAjuda de Custo: %.2f",admin1.getNome(),admin1.getEndere�o(),admin1.getTelefone(),admin1.getAjudaDeCustos());
		
		
		Operario oper1= new Operario("Vivian","Rua Valentina","(11)98452-8535",350.90,15,2700.75);
		
		System.out.printf("\n\nNome do Funcion�rio: %s \nEndere�o: %s \nN�mero : %s \nValor da Produ��o: %.2f \nComiss�o: %.2f %%",oper1.getNome(),oper1.getEndere�o(),oper1.getTelefone(),oper1.getValorProducao(),oper1.getComissao());
		System.out.println("\nSal�rio:"+oper1.obterSalario() );
		
		Vendedor vend1 = new Vendedor("Veronica","Rua fllentina","(11)98452-8535",500,8,2000.75);
		
		System.out.printf("\nNome do Funcion�rio: %s \nEndere�o: %s \nN�mero : %s \nValor da Produ��o: %.2f \nComiss�o: %.2f %%",vend1.getNome(),vend1.getEndere�o(),vend1.getTelefone(),vend1.getValorVendas(),vend1.getComissao());
		System.out.println("\nSal�rio:"+vend1.obterSalario() );
		
	}
	

}
