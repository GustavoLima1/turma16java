programa
{
	
	funcao inicio()
	{
	inteiro idade
	escreva("informe a do participante: ")
	leia(idade)

	se ( idade > 4 e idade < 8)
	{
		escreva(" Sua idade é: "+ idade + "\n Portanto sua categoria é Infantil A = 5 a 7 anos")
	}
	senao se ( idade > 7 e idade < 12)
	{
		escreva(" Sua idade é: "+ idade + "\n Portanto sua categoria é Infantil B = 8 a 11 anos")
	}
	senao se ( idade > 11 e idade < 14)
	{
		escreva(" Sua idade é: "+ idade + "\n Portanto sua categoria é Juvenil A = 12 a 13 anos")
	}	
	senao se ( idade > 13 e idade < 18)
	{
		escreva(" Sua idade é: "+ idade + "\n Portanto sua categoria é Juvenil B = 14 a 17 anos")
	}	
	senao se ( idade > 17 )
	{
		escreva(" Sua idade é: "+ idade + "\n Portanto sua categoria é Adulto = Maiores de 18 anos")
	}
	senao
	{
		escreva(" Não pode participar")
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 105; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */