package switchcase;

import java.util.Scanner;

public class MenuContaBancariaCase {

	public static void main(String[] args) {
	
		    Scanner scanner = new Scanner(System.in);

		    double saldoDaConta = 5000;
		    double valor;

		    int menu;

		    System.out.println("Escolha a operação:");
		    System.out.println("1 - Ver saldo");
		    System.out.println("2 - Depositar");
		    System.out.println("3 - Sacar");
		    System.out.println("4 - Sair");

		    menu = scanner.nextInt(); // 👈 AGORA o menu recebe valor

		    switch (menu) {

		        case 1:
		            System.out.println("Seu saldo é: " + saldoDaConta);
		            break;

		        case 2:
		            System.out.print("Qual valor você vai depositar: ");
		            valor = scanner.nextDouble();

		            saldoDaConta += valor; // 👈 soma direta
		            System.out.println("Seu saldo atual é: " + saldoDaConta);
		            break;

		        case 3:
		            System.out.println("Função saque ainda não implementada");
		            break;

		        case 4:
		            System.out.println("Saindo...");
		            break;

		        default:
		            System.out.println("Opção inválida");
		    }

		    scanner.close();
		
	}

}
