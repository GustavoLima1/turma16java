programa
{

	
	funcao inicio()
	{
		cadeia agenda[24][31]
		cadeia nome
		inteiro dia=0, hora=0
		caracter opcao, continuar, reiniciar
		logico  facaGrande = verdadeiro

		escreva("Digite o seu nome: ")
		leia(nome)
	faca{
		faca
		{
			
			escreva("\nESCOLHA UM DIA PARA CADASTRO [1/31] :")
			leia(dia)
			enquanto (dia <=0 ou dia > 31)
			{
				escreva("\nData informada incorreta, escolha uma data entre 1 e 31:")
				leia(dia) 
			}
			
			dia -= 1 
			escreva("SELECIONE A HORA DO EVENTO[0-23]: ")
			leia(hora)
			enquanto( hora < 0 ou hora > 23 )
			{
				escreva("\nHora informada incorreta, escolha entre 0 e 23 h: ")
				leia(hora)
			}
			escreva("\nInforme a tarefa nesta data e hora:")
			leia(agenda[hora][dia])
			escreva("Continua 1-sim ou 2-não:")
			leia(opcao)
			
		} enquanto(opcao=='1')

		escreva("Mostrar agenda? 1-sim ou 2-não:")
			leia(continuar)
			
		se( continuar == '1')
		{
		
			para (inteiro x= 0; x<31; x++)
			{
				para(inteiro y=0; y<24;y++)
				{
					se (agenda[y][x] != "")
					{
					escreva("\nAgenda\n",nome,"\nDia :",x+1," hora: ",y," : ",agenda[y][x])	
					
					}
				
				}
			}	
		}
		se( continuar == '2' ou continuar == '1')
		{
			escreva("\n\nreiniciar Agenda? 1-Sim 2-Não")
			leia(reiniciar)
				se(reiniciar =='1')
				{	
				facaGrande = verdadeiro
				}
				senao se ( reiniciar == '2')
				{
					facaGrande = falso
				}
		}
		senao
		{
			escreva("opção inválida! Deseja mostrar agenda 1-sim ou 2-não:")
			leia(continuar)
		}
		}enquanto(facaGrande == verdadeiro)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1120; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */