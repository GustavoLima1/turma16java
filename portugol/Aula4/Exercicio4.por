programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		real somaValores =0.00, somaDiagonal = 0.00
		inteiro matriz [3][3]

		para (inteiro x = 0; x < 3; x++)
		{
			para(inteiro y = 0; y < 3; y++)
			{
				matriz [x] [y]=Util.sorteia(1, 9)
				escreva(matriz[x][y]," ")

				somaValores += matriz[x][y]
				se( x == y)
				{
					somaDiagonal+= matriz[x][y]
				}
			}
			escreva("\n")
		}
		
		escreva("A Soma da matriz é: ",somaValores)
		escreva("\nA soma de valores da diagonal principal é ", somaDiagonal) 
		
		
	}


}




/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 533; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */