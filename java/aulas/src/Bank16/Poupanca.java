package Bank16;

public class Poupanca extends Conta{
	private int diaAniversario;


	public Poupanca(String numero, String cpf, int diaAniversario) {
		super(numero, cpf);
		this.diaAniversario = diaAniversario;
		
	}

	public int getDia() {
		return diaAniversario;
	}
	

	public void correcao(int diaAniversario)
	{
		double correcao =  super.getSaldo()*0.005;
		
		if(this.diaAniversario == diaAniversario)
		{
			super.creditar(correcao);
		}
	}


}
