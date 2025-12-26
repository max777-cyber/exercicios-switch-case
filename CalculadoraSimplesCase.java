package switchcase;

import java.util.Scanner;

public class CalculadoraSimplesCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		float N1, N2;

		System.out.print("Insira o primeiro numero: ");
		N1 = scanner.nextFloat();

		System.out.print("Insira o segundo numero: ");
		N2 = scanner.nextFloat();

		System.out.println("Escolha a operação:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");

		int operacao = scanner.nextInt();   
		switch (operacao) {
		    case 1:
		        System.out.println("Resultado: " + (N1 + N2));
		        break;
		    case 2:
		        System.out.println("Resultado: " + (N1 - N2));
		        break;
		    case 3:
		        System.out.println("Resultado: " + (N1 * N2));
		        break;
		    case 4:
		        System.out.println("Resultado: " + (N1 / N2));
		        break;
		    default:
		        System.out.println("Opção inválida");
		}

		scanner.close();

		
	}

}
