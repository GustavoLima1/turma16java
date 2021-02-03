package entidades;

public class Produto 
{
	public String codigo;
	public double valorUnitario;
	public String descriçao;
	
	public Produto(String codigo)
	{
		super();
		this.codigo = codigo;
	}

	public Produto(String codigo, String descriçao)
	{
		super();
		this.codigo = codigo;
		this.descriçao = descriçao;
	}

	public Produto(String codigo, double valorUnitario, String descriçao) {
		super();
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
		this.descriçao = descriçao;
	}
	
	
	
	
	
}
