package entidades;

public class Pessoa {
	
	public String nome;
	public int anoNascimento;
	public char sexo;
	public boolean estaVivo;
	
	
	public int idade()
	{
		return 2021 - anoNascimento;
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	public Pessoa(String nome,boolean estaVivo)
	{
		super();
		this.estaVivo = estaVivo;
		this.nome =nome ;
		
	}

	public String tratar()
	{
		String tratar = "";
		if(idade()>17)
		{
			if (sexo == 'M')
			{
				tratar = "Sr.";
			}
			else if(sexo == 'F')
			{
				tratar = "Sra.";
			}
			else
			{
				tratar = "Sre.";
			}
		}	
		else
		{
			tratar = " Você";
		}
		
		return tratar;
	}
	public String mensagem() 
	{
		String mensagem = "";
		
		if ( idade()> 18)
		{
			mensagem = "Você pode comprar o que quiser";
		}
		
		else
		{
			mensagem = " Você não pode comprar produtos +18";
		}
		return mensagem;
	}
	
}


