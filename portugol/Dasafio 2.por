programa
{
	
	funcao inicio()
	{
		const inteiro quantidadeAluno = 40
		cadeia alunos[] = {"ALONSO MENDES SILVA DE OLIVEIRA","ANDRESSA FERREIRA DOS SANTOS","ATHOS GIOM DE PAIVA MESQUITA","C NDIDO JURELMO DOS SANTOS CAVALEIRO","CAROLINA GUIDA","DANIELE DOS SANTOS PINHEIRO","DÉBORA VIDEIRA MONTEIRO","DENILSON TEIXEIRA DE SOUZA","DENISE BRITO ANJOS","FELIPE CASAGRANDE TEIXEIRA DE CASTRO","FERNANDO BEDNARSKI RAMOS","FERNANDO DE BARROS SABALETE","GISELE DE OLIVEIRA PAZ","GUSTAVO DE SOUZA GUILHEN","GUSTAVO ESTEBAN CARRERAS JORGE","GUSTAVO LIMA DE SOUZA","IGOR MILHOMENS DOS SANTOS","JEAN PABLO CESARIO DA SILVA","JESSICA REGINA RODRIGUES HOLANDA","KAREN BERNARDI","KEWIN SOUTO BARROS","LEONARDO LIMA CINTRA","LEONARDO QUEIROZ BURJATO","LUCAS ALVES SCHIMIT","LUCAS DE BARROS PAIFAR","LUCAS LOIOLA DE ALMEIDA","MARCOS DOS SANTOS","MARIA NAZARE CORTEZ LIMA","MARIANA LIMA","MATHEUS RIBEIRO VILLELA","MAYARA CARDINOT MAFIOLETTI","MILTON JUNIOR CAVALCANTE DA PENHA","NATÃ DE ARAUJO GRECU","OSVALDO TAVARES VELASCO","PAOLA ALENCAR LISBOA","RAPHAEL EUZÉBIO SCAZITI","RENATO ANDRÉ NASCIMENTO SILVA","RUI ALMEIDA DE ANDRADE","TATIANE TISSONI ANTUNES","VICTOR DE MORAIS ARAUJO"}
		cadeia matricula[40]
		inteiro notas[40], numeroMatricula = 0
		logico opcao = verdadeiro
		inteiro condicao

		

		para ( inteiro x = 0; x < 40; x++)
		{
			  
			 matricula[x] = "G7-" + (x+1) 
			 
			escreva("Matricula- ", matricula[x] ," Nome: ", alunos[x],"\n")
		}
		escreva("\n")
		enquanto(opcao == verdadeiro)
		{
			escreva("Selecione um aluno pelo numero da matricula: ")
			leia(numeroMatricula)
			numeroMatricula -= 1

			escreva("Alune selecionado:\n", alunos[numeroMatricula],"\n Qual a nota do Alune [0,10]? " )
			leia(notas[numeroMatricula])
				se( notas[numeroMatricula] <0 e notas[numeroMatricula] > 10)
				{
					escreva("Você não escolheu uma das opções de nota \n Qual a nota do alune [0,10]?")
				}

			escreva("Deseja continuar cadastrando 1-Sim ou 2-N ? ")
			leia(condicao)

			se(condicao == 1)
			{
				opcao = verdadeiro
			}
			senao se ( condicao == 2)
			{
				opcao = falso
			}
			senao
			{
				escreva("Você não escolheu uma das alternativas!\nDeseja continuar cadastrando? digite o numero [1-Sim ou 2-N]? ")
				leia(condicao)
				
			}

		}
		limpa()
			para(inteiro x = 0; x < 40; x++)
			{
				se( notas[x] != 0)
				{
					se (notas[x] < 5)
					{
						escreva( alunos[x], " Matricula ", matricula[x], " E sua nota é: ", notas[x], " Situação: Reprovado! \n")
					}
					senao se (notas[x] < 8)
					{
						escreva( alunos[x], " Matricula ", matricula[x], " E sua nota é: ", notas[x], " Situação: Em análise. \n")
					}
					senao 
					{
						escreva( alunos[x], " Matricula ", matricula[x], " E sua nota é: ", notas[x], " Situação: Aprovado! \n")
					}
				}escreva("\n")
			}
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2800; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */