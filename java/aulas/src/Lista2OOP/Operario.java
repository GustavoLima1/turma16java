package Lista2OOP;

public class Operario extends Pessoa{
	
	private double valorProducao;
	private double comissao;
	private	double salario;
	
	public Operario(String nome, String endereço, String telefone, double valorProducao, double comissao, double salario) {
		super(nome, endereço, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}



	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double obterSalario()
	{
		return salario+(valorProducao*(comissao/100));
	}

}
