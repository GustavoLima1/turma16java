programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro Numero1 [4][6], Numero2 [4][6], matriz [4][6], matriz2 [4][6]

		escreva (" Matriz 1\n")
		para( inteiro x = 0 ; x < 4; x++)
		{
			para (inteiro y = 0; y < 6; y++)
			{
				Numero1 [x] [y]=Util.sorteia(1, 9)
				escreva(Numero1[x][y]," ")
			}
			escreva("\n")
		}	
		escreva ("Matriz 2\n")
		para( inteiro x = 0 ; x < 4; x++)
		{
			para (inteiro y = 0; y < 6; y++)
			{
				Numero2 [x] [y]=Util.sorteia(1, 9)
				escreva(Numero2[x][y]," ")
			}
			escreva("\n")
		}
			escreva (" Resposta A  Soma\n")
			para( inteiro x = 0 ; x < 4; x++)
		{
			para (inteiro y = 0; y < 6; y++)
			{
				matriz[x][y] = (Numero1[x][y] + Numero2[x][y])

				escreva(matriz[x][y]," ")
			}
			escreva("\n")
		}
			escreva("\n")
			escreva (" Resposta B Diferença \n")
			para( inteiro x = 0 ; x < 4; x++)
		{
			para (inteiro y = 0; y < 6; y++)
			{
				matriz2[x][y] = (Numero1[x][y] - Numero2[x][y])

				escreva(matriz2[x][y]," ")
			}
			escreva("\n")
		}	
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */