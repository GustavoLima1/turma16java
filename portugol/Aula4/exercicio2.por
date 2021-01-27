programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		real somaDardos = 0.00, mediaDardos = 0.00
		inteiro  contador = 0, dardo [10], maiorNumero = 0

		para ( inteiro x = 0 ; x < 10; x++)
			{
				dardo[x]=Util.sorteia(1, 9)
				
				escreva(dardo[x],"\n")

				somaDardos = somaDardos + dardo[x]

				se(dardo[x] >= maiorNumero)
				{
					se (dardo[x] == maiorNumero)
					{
					contador++	
					}
					senao
					{
					contador=1 //reinicilização
					}
				
					
					maiorNumero = dardo[x]
		
				}
			}
			
				mediaDardos = somaDardos / 10
				escreva("A média: ",mediaDardos," e ocorreu: ", contador," vezes")
		
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 234; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */