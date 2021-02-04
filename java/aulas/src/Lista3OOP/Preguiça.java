package Lista3OOP;

public class Preguiça extends Animal{

	public Preguiça(String nome, int idade) {
		super(nome, idade);
	
	}

	@Override
	public String emitirSom() {
	
		return "vocalização";
	}
	
	public String acao()
	{
		return "Subindo em arvore";
	}
	public String status()
	{
		return "\nNome: "+super.getNome()+"\nIdade: "+super.getIdade()+"\nEmitir som: "+emitirSom()+"\nAção: "+acao();
	}

}
