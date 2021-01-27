programa
{
	
	funcao inicio()
	{
		inteiro numero, soma = 0
		

		para (numero = 1;numero < 500; numero++ )
		{
			se( numero % 3 == 0 e numero % 2 != 0)
			soma = soma + numero
			
			
		}
		escreva(" A soma dos numeros impares e multiplos de 3 é: " + soma)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */