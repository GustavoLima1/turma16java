package entidades;

public class Aviao 
{
	public String nome;
	public int anoFabricašao;
	public int quantidadeLugares;
	public double velocidadeAtual;
	public double aumentarVelocidade;
	public double diminuirVelocidade;
	public double velocidade;
	

	
	public Aviao(String nome, int anoFabricašao, int quantidadeLugares) {
		super();
		this.nome = nome;
		this.anoFabricašao = anoFabricašao;
		this.quantidadeLugares = quantidadeLugares;
	}
	public int Idade()
	{
		return 2021-anoFabricašao;
	}
	
	public boolean estado(double velocidadeAtual)
	{
		

		if(velocidadeAtual == 0)
		{
			return true;
				
		}
		else if(velocidadeAtual > 0)
		{
			return false;
		}
		return false;
	}
	
	public double aumentarVelocidade (double velocidade)
	{
		return velocidadeAtual+= velocidade;
		
	}
	public double diminuirVelocidade (double velocidade)
	{
		return velocidadeAtual-= velocidade;
		
	}

}
