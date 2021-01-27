programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real b, a, area
		escreva(" Digite um valor pra base do triangulo")
		leia(b)
		escreva(" Digite um valor pra altura do triangulo")
		leia(a)

		area = b * a / 2

		se (b > 0 e a > 0)
		{
			escreva(" A area do triangulo é: "+ mat.arredondar(area, 2))
		}
		senao 
		{
			escreva(" numeros inválidos")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 238; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */