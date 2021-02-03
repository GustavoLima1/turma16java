package Lista2OOP;

public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endere�o, String telefone, int codigoSetor, double salarioBase,
			double imposto) {
		super(nome, endere�o, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto, double salarioBase) {
		this.imposto = imposto ;
	}

	
	
	public double obterSalario(double getSalarioBase, double getImposto)
	{
		return getSalarioBase-(getSalarioBase*(getImposto/100));
	}
	
	

}