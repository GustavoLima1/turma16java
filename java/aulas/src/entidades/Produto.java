package entidades;

public class Produto 
{
	public String codigo;
	public double valorUnitario;
	public String descri�ao;
	
	public Produto(String codigo)
	{
		super();
		this.codigo = codigo;
	}

	public Produto(String codigo, String descri�ao)
	{
		super();
		this.codigo = codigo;
		this.descri�ao = descri�ao;
	}

	public Produto(String codigo, double valorUnitario, String descri�ao) {
		super();
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
		this.descri�ao = descri�ao;
	}
	
	
	
	
	
}
