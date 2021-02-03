package Desafio;

import java.util.Locale;
import java.util.Scanner;

public class DesafioTriangulo {
	
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); //define o tipo de padronização
		//area = base * altura / 2
		Scanner leia = new Scanner(System.in);//instaciar = criar
		
		double base, altura, area,base2, altura2, area2,base3, altura3, area3;
		
		System.out.println("Digite a base do triangulo: ");
		base = leia.nextDouble();
		System.out.println("Digite a altura do triangulo: ");
		altura = leia.nextDouble();
		
		area = ((base * altura) / 2 );
		
		System.out.printf("A area do  triangulo informado é %.2f", area);
		
		System.out.println("\nDigite a base do segundo  triangulo: ");
		base2 = leia.nextDouble();
		System.out.println("\nDigite a altura do segundo triangulo: ");
		altura2 = leia.nextDouble();
		
		area2 = ((base2 * altura2) / 2 );
		
		System.out.printf("A area do  triangulo informado é %.2f", area2);
		
		System.out.println("\nDigite a base do terceiro  triangulo: ");
		base3 = leia.nextDouble();
		System.out.println("\nDigite a altura do terceiro triangulo: ");
		altura3 = leia.nextDouble();
		area3 = ((base3 * altura3) / 2 );
		System.out.printf("\nA area do terceiro triangulo informado é %.2f", area3);
		
		if(area > area2 && area > area3)
		{
			System.out.printf("\nA maior área é do primeiro triangulo : %.2f ",area);
		}
		else if(area2 > 3 && area2 >area)
		{
			System.out.printf("\nA maior área é do segundo triangulo: %.2f ",area2);
		}
		else 
		{
			System.out.printf("\nA maior área é do terceiro triangulo: %.2f ",area3);
		}

	}

}



