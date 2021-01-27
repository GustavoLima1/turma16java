programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real salario = 0, mediaSalarios = 0, mediaFilhos = 0, percentualSalario = 0, totalSalario = 0, totalMenos100 = 0, maiorSalario = 0
		real numeroFilhos = 0, totalFilhos = 0
		const inteiro HABITANTES = 5

		para (inteiro giro = 1; giro <= HABITANTES; giro++)
		{
			escreva(" Digite o salario do Habitante ",giro,": ")
			leia(salario)
			escreva(" Digite a quantidade de filhos do Habitante ",giro,": ")
			leia(numeroFilhos)
			
			totalSalario = totalSalario + salario
			mediaSalarios = totalSalario / HABITANTES
			
			totalFilhos = totalFilhos + numeroFilhos
			mediaFilhos = totalFilhos / HABITANTES

			se (salario <= 100)
			{
				totalMenos100 ++ 
				percentualSalario = totalMenos100 / HABITANTES * 100
			} 
			se ( salario > maiorSalario)
			{
				maiorSalario = salario
			}
			
		}
		escreva("Média de filhos: ",mediaFilhos,"\n","Média de salarios: ",mediaSalarios,
		"\nPercentual de pessoas com menos de 100R$ de salario: ",mat.arredondar(percentualSalario,2),
		"%","\nO maior salário foi de: ", maiorSalario)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 935; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */