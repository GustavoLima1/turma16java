package Lista2OOP;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double  valorDivida;

	public Fornecedor(String nome, String endere�o, String telefone, double valorCredito, double valorDivida) {
		super(nome, endere�o, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		
	}
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	
	
	public double obterSaldo(double getValorDivida,double getValorCredito)
	{
		return  getValorCredito()-getValorDivida();
	}
	
}
