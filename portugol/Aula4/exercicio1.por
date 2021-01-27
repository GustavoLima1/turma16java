programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro numero [5], maiorNumero = 0

		para ( inteiro x = 0 ; x < 5; x++)
			{
				
				(numero[x]) = Util.sorteia(1, 10)
				escreva(numero[x],"\n")

				se ( numero[x] > maiorNumero)
				{
					maiorNumero = numero[x]
				}		
			}
				escreva("O maior número é: ",maiorNumero)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 346; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */