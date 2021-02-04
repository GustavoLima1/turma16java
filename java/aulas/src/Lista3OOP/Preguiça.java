package Lista3OOP;

public class Pregui�a extends Animal{

	public Pregui�a(String nome, int idade) {
		super(nome, idade);
	
	}

	@Override
	public String emitirSom() {
	
		return "vocaliza��o";
	}
	
	public String acao()
	{
		return "Subindo em arvore";
	}
	public String status()
	{
		return "\nNome: "+super.getNome()+"\nIdade: "+super.getIdade()+"\nEmitir som: "+emitirSom()+"\nA��o: "+acao();
	}

}
