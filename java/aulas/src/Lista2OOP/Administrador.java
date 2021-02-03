package Lista2OOP;

public class Administrador extends Pessoa {
	
	private double ajudaDeCustos;
	
	public Administrador(String nome, String endereço, String telefone, double ajudaDeCustos) {
		super(nome, endereço, telefone);
		this.ajudaDeCustos = ajudaDeCustos;
	}

	public double getAjudaDeCustos() {
		return ajudaDeCustos;
	}

	public void setAjudaDeCustos(double ajudaDeCustos) {
		this.ajudaDeCustos = ajudaDeCustos;
	}

	
}
