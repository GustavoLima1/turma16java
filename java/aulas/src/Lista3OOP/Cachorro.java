package Lista3OOP;

public class Cachorro extends Animal implements AcaoCorrer{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emitirSom() {
		
	return "Latir";
	}

	@Override
	public String correr() {
		
		return "Correndo";
	}
	
	public String status()
	{
		return "Nome: "+super.getNome()+"\nIdade: "+super.getIdade()+"\nEmitir som: "+emitirSom()+"\nAção: "+correr();
	}
	
	
}
