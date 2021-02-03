package Bank16;

public class Corrente extends Conta{
	private int talao;

	public Corrente(String numero, String cpf) {
		super(numero, cpf);
	}

	public int getTalao() {
		return talao;
	}

	public void setTalao(int talao) {
		this.talao = talao;
	}
	
	public void emitirTalao (int valor)
	{
		if (valor <= 0 || valor >3)
		{
		
		}
		else if (talao + valor < 4)
		{
			talao = talao + valor;
		}
	}
	

}
