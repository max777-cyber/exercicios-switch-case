package switchcase;

import java.util.Scanner;

public class ComandoDoSistem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um comando:");
		System.out.println("ligar | desligar | reiniciar");

		
		String comando = scanner.next().toLowerCase();
		switch (comando) {
		case "ligar":
			System.out.println("Sistema ligado");
			break;
			
		case "desligar":
			System.out.println("Sistema desligado");
			break;
			
		case"reiniciar":
			System.out.println("Sistema reiniciando");
			break;
			
		default:
            System.out.println("opção inválida");
		}
		scanner.close();
	}

}
