programa
{
	
	funcao inicio()
	{
		inteiro producao 
		escreva (" Tempo de produção da máquina em segundos")
		leia (producao)

		inteiro horas = producao/60
		inteiro minutos = (producao % 60) / 60
 		inteiro segundos = (producao % 60) % 60

 		escreva("O tempo de duração do evento é: "+horas + "h " + minutos+ "m "+ segundos + "s")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */