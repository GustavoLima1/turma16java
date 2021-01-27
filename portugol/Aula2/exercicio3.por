programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro numero1, numero2, numero3, numero4, resultado1, resultado2, resultado3, resultado4
		escreva(" Digite o primeiro numero: ")
		leia(numero1)

		escreva(" Digite o segundo numero: ")
		leia(numero2)

		escreva(" Digite o terceiro numero: ")
		leia(numero3)

		escreva(" Digite o quarto numero: ")
		leia(numero4)
		limpa()
		resultado1 = mat.potencia( numero1,2)
		resultado2 = mat.potencia( numero2,2)
		resultado3 = mat.potencia( numero3,2)
		resultado4 = mat.potencia( numero4,2)

		se (resultado3 >= 1000)
			{
			escreva("ln"+resultado3 + "\n PROGRAMA FINALIZADO")
			}
		senao 
			{
			escreva( "o primeiro numero foi: " + numero1 + " Seu valor ao quadrado é: " + resultado1+
			"\no primeiro numero foi: " + numero2 + " Seu valor ao quadrado é: " + resultado2+
			"\no primeiro numero foi: " + numero3 + " Seu valor ao quadrado é: " + resultado3+
			"\no primeiro numero foi: " + numero4 + " Seu valor ao quadrado é: " + resultado4)
			}
		
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