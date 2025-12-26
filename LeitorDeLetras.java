package switchcase;

import java.util.Scanner;

public class LeitorDeLetras {

	public static void main(String[] args) {


		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite a nota (A, B, C, D ou F): ");
		        String nota = scanner.next().toUpperCase();

		        switch (nota) {
		            case "A":
		                System.out.println("Excelente");
		                break;

		            case "B":
		                System.out.println("Bom");
		                break;

		            case "C":
		                System.out.println("Regular");
		                break;

		            case "D":
		                System.out.println("Ruim");
		                break;

		            case "F":
		                System.out.println("Reprovado");
		                break;

		            default:
		                System.out.println("Nota inválida");
		        }

		        scanner.close();
		 
	}

}
