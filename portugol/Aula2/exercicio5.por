programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva(" escreva o indice de poluição ")
		leia ( indicePoluicao)

		se (indicePoluicao < 0.30)
		{
			escreva( " O indice está em: "+ indicePoluicao + "\n Tudo sob controle ") 
		}
		senao se (indicePoluicao < 0.40)
		{
			escreva( " O indice está em: "+ indicePoluicao + "\n 1º grupo são intimadas a suspenderem suas atividades ") 
		}
		senao se (indicePoluicao < 0.50)
		{
			escreva( " O indice está em: "+ indicePoluicao + "\n As industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades")
		}
		senao
		{
			escreva(" O indice está em: "+ indicePoluicao + "\n Todos os grupos devem ser notificados a paralisarem suas atividades")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 603; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */