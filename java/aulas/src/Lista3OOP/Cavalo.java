package Lista3OOP;

public class Cavalo extends Animal implements AcaoCorrer{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public String emitirSom() {
		
		return "Rinchar";
	}

	@Override
	public String correr() {
		
		return "correndo" ;
	}
	public String status()
	{
		return "\nNome: "+super.getNome()+"\nIdade: "+super.getIdade()+"\nEmitir som: "+emitirSom()+"\nAção: "+correr();
	}
	

}
