package Lista2OOP;

public class Vendedor extends Pessoa{
	
	private double valorVendas;
	private double comissao;
	private double salario;
	
	public Vendedor(String nome, String endereço, String telefone, double valorVendas, double comissao, double salario) {
		super(nome, endereço, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		this.salario = salario;
	}
	
	
	public double getValorVendas() {
		return valorVendas;
	}


	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double obterSalario()
	{
		return salario= salario + (valorVendas*(comissao/100));
	}
}
