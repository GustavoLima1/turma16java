package entidades;

public class Cliente {

	public String nome;
	public int anoNascimento;
	public char sexo;
	public String endere�o;
	public String cpf;
	
	public int idade()
	{
		return 2021-anoNascimento;
	
	}

	public Cliente(String nome, int anoNascimento, char sexo, String endere�o, String cpf) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.sexo = sexo;
		this.endere�o = endere�o;
		this.cpf = cpf;
	}

	public Cliente(String nome, int anoNascimento, String endere�o,String cpf)
	{
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.sexo = sexo;
		this.endere�o = endere�o;
		this.cpf = cpf;
	}
		
}
