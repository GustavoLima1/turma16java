programa
{
	
	funcao inicio()
	{
		inteiro soma = 0, media = 0, quantidadeVezes = 0, numero = 1

		enquanto(numero > 0)
		{
			escreva ("digite um número ")
			leia(numero)	
			
			se ( numero > 0)
			{
			soma = soma + numero
			quantidadeVezes++
			media = soma / quantidadeVezes
			}
		}
		escreva("Soma total: ", soma,"\nA média é: ", media)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 182; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */