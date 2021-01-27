programa
{
	
	funcao inicio()
	{
		real custoFabricante, distribuidor, impostos, custoConsumidor 
				
		escreva(" Escreva o custo do Fabricante " )
		leia(custoFabricante)

		distribuidor = custoFabricante * 0.28
		impostos = custoFabricante * 0.45

		custoConsumidor = custoFabricante + distribuidor + impostos
		escreva(" O custo do consumidor será de: " + custoConsumidor)
		
		
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */