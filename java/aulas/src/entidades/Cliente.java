package entidades;

public class Cliente {

	public String nome;
	public int anoNascimento;
	public char sexo;
	public String endereço;
	public String cpf;
	
	public int idade()
	{
		return 2021-anoNascimento;
	
	}

	public Cliente(String nome, int anoNascimento, char sexo, String endereço, String cpf) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.sexo = sexo;
		this.endereço = endereço;
		this.cpf = cpf;
	}

	public Cliente(String nome, int anoNascimento, String endereço,String cpf)
	{
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.sexo = sexo;
		this.endereço = endereço;
		this.cpf = cpf;
	}
		
}
