package switchcase;

import java.util.Scanner;

public class Logincase {

	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);
		
		int menu;
		
		System.out.println("1 - Administrador");
		
		System.out.println("2 - Usuário");
		
		System.out.println("3 - Convidado");
		
		menu=scanner.nextInt();
		switch(menu) {
		
		case 1:
			System.out.print("Administrador");
			break;
			
		case 2:
			System.out.print("Usuário");
			break;
		
		case 3:
			
			System.out.print("Convidado");
			break;
			
		 default:
	            System.out.println("Opção inválida");
			
			
		}
		  scanner.close();
	}

}
