programa
{
	
	funcao inicio()
	{
		inteiro p, E, m
		const inteiro pesoRegulamento = 50

		escreva(" Escreva o peso do produto ")
		leia(p)
		
		E = p - pesoRegulamento
		m = E * 4.00
		se (p <= pesoRegulamento)
		{	
			E = 0
			m = 0
			escreva (" Excesso: "+ E +"\n Multa: " + m)
		}
		senao
		{
			escreva (" Excesso: "+ E +"\n Multa de : " + m +" Reais" )
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 111; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */