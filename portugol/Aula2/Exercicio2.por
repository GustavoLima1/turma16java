programa
{
	
	
	funcao inicio()
	{
		inteiro c = 20, numeroHoras, salario = 10 
		const inteiro horasNormais = 50

		escreva(" Escreva as horas trabalhadas ")
		leia(numeroHoras)

		se ( numeroHoras <= horasNormais)
		{	
			c = 0
			escreva(" Seu salário é de: " + numeroHoras * salario + "\n Salário sobre horas excedentes : " + c )
		}
		senao
		{
			escreva( " Seu salário é de: " + horasNormais * salario + "\n Salário sobre horas excedentes : " + c * (numeroHoras - horasNormais ))
		}
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 493; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */