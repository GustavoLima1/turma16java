package Lista3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 
{
		public static void main(String[] args)
		{
			Scanner read = new Scanner(System.in);
			
			Random random = new Random();
			Random aleatorio = new Random();
			
			final int pesquisaPessoas = 150;
			int participantes = 0, idade = 0, sexo = 1, humor = 1;
			int nMasculino,NFeminino,nOutros;
			int contador1 = 0,contador2 = 0,contador3 = 0,contador4 = 0,contador5 = 0,contador6 = 0;
			
			while(participantes < pesquisaPessoas)
			{
				participantes ++;
				idade = aleatorio.nextInt(100);
				System.out.println("Idade da pessoa:"+idade);
				
				sexo = random.nextInt(3)+1;
				System.out.println("Sexo que se identifica [1-feminino / 2-masculino / 3-Outros]\n"+sexo);
				
				humor = random.nextInt(3)+1;
				System.out.println("Humor [1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva]\n"+humor);
				
				if(idade < 18 && humor == 1 )
				{
					contador6++;
					
				}
				if(idade > 40 && humor == 2)
				{
					contador5++;
				}
				if(sexo == 3 && humor == 1)
				{
					contador4++;
				}
				if(sexo == 2 && humor ==3)
				{
					contador3++;
				}
				if( sexo == 1 && humor ==2)
				{
					contador2++;
				}
				if(humor == 1)
				{
					contador1++;
				}
			}
			System.out.printf("Numero de pessoas calmas: %d \nO número de mulheres nervosas: %d \nO número de homens agressivos: %d \n",contador1,contador2,contador3);
			System.out.printf("O número de outros calmos: %d \nO número de pessoas nervosas com mais de 40 anos: %d \nO número de pessoas calmas com menos de 18 anos: %d",contador4,contador5,contador6);	
			
		}
}
