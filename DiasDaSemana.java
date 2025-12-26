/**
 * 
 */
package switchcase;

import java.util.Scanner;

/**
 * 
 */
public class DiasDaSemana {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int DiasDaSemana;
		System.out.print("Insra um numero de 1 a 7 que representa o dia da semana:");
		DiasDaSemana=scanner.nextInt();
		
		switch(DiasDaSemana) {
		case 1:
			System.out.println("você escolheu Domingo");
		break;
		
		case 2:
		 System.out.println("você escolheu Segunda-feira");
		break;
		 
		case 3:
			System.out.println("você escolheu Terça-feira");
		break;

		case 4:
			System.out.println("você escolheu Quarta-feira");
		break;
			 
		case 5:
			System.out.println("você escolheu Quinta-feira");
		break;
			 
		case 6:
			System.out.println("você escolheu Sexta-feira");
		break;
			 
		case 7:
			System.out.println("você escolheu Sabado");
		break;
		
		   default:
               System.out.println("Entrada inválida. Por favor, insira um número de 1 a 7.");
               break;
		}
		
		scanner.close();
	}

}
