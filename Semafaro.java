package switchcase;

import java.util.Scanner;

public class Semafaro {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Verde");
		System.out.println("Amarelo");
		System.out.println("Vermelho");
		
		String semafaro = scanner.next().toLowerCase();
		
		switch (semafaro){
		case "verde":
			System.out.println("Pode passar");
			break;
			
		case "Amarelo":
			System.out.println("Atenção");
			break;
			
		case "vermelho":
			System.out.println("Pare");
			break;
		default:
            System.out.println("cor inválida");
    }

    scanner.close();
		
	}

}
