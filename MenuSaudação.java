package switchcase;

import java.util.Scanner;

public class MenuSaudação {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 - Olá");
		System.out.println("2 - Bom dia");
		System.out.println("3 - Boa noite");

		int saudacao;
		   saudacao=scanner.nextInt();
		   switch (saudacao) {
		   case 1:
			   System.out.println("ola");
			   break;
		   case 2:
			   System.out.println("Bom dia");
			   break;
		   case 3:
			   System.out.println("Boa noite");
			   break;
			   
		   default:
	            System.out.println("Opção inválida");
	    }
		   scanner.close();   
		
	}

}
