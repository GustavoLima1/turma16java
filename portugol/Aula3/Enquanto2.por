programa
{
	
	funcao inicio()
	{
		inteiro numero

		logico repita = verdadeiro
		
			escreva(" Digite um numero de [1,100]: \n")
			leia(numero)
			
		enquanto( repita )
		{
			se (numero > 0 e numero < 100)
				{
				numero *= 3
				escreva (numero," ")
				}
			senao se (numero > 100 )
			{
				repita = falso 
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 149; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */