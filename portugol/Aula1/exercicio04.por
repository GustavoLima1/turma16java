programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real a, b, c, r, s, d
		escreva("escreva A ")
		leia (a)
		escreva("escreva B ")
		leia (b)
		escreva("escreva C ")
		leia (c)	

		real resultadoR = (a +b)
		real resultadoS = (b + c)
		r = mat.potencia(resultadoR, 2.0)
		s = mat.potencia(resultadoS, 2.0)

		d = r * s / 2.0
		escreva("resultado de D é " + d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 397; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */