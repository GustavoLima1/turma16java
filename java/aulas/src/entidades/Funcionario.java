package entidades;

public class Funcionario 
{
	public String nome;
	public double salario;
	public char sexo;
	public int idade;
	
	public Funcionario(String nome, double salario, char sexo, int idade)
	{
		super();
		this.nome = nome;
		this.salario = salario;
		this.sexo = sexo;
		this.idade = idade;
	}	
	public String tratar()
	{
		String tratar = "";
		if(idade>17)
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
	
	
	

}
