programa
{
	
	funcao inicio()
	{
		inteiro numero, resultado
		

		escreva( "Digite um número: ")
		leia( numero )
		
		se ( numero == 0)
		{
				escreva(" 0 é um número neutro")
		}
		senao se (numero <0)
		{
				se (numero < 0 e numero % 2 == 0)
			{
			escreva(" Seu número é par e negativo ")
			}
			senao
			{
			escreva(" Seu número é impar e negativo ")
			}
		}
		senao
		{
			se (numero > 0 e numero % 2 == 0)
			{
			escreva(" Seu número é par ")
			}
			senao
			{
			escreva(" Seu número é impar ")
			}
			
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 64; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */