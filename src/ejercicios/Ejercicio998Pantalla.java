package ejercicios;

import java.util.Scanner;

/*
//hacer un recuadro con un caracter elegido

//y en linea del medio, centrado, escribir la palabra pasada por parametro
//El alto y el ancho del recuadro debe pasarse tambien por parametro

*/

public class Ejercicio998Pantalla {

	public static void main(String[] args) {
		int width = 60;
		int height = 10;
		String message = getMessage();
		dibujarPantalla(message, width, height, '#');

	}

	private static String getMessage() {
		System.out.println("Please enter the message");
		Scanner sc = new Scanner(System.in);
		String message = sc.next();
		sc.close();
		return message;
	}

	private static void dibujarPantalla(String message, int width, int height, char symbol) {
		int messageRow = (height / 2);
		int messageCol = (width / 2) / (message.length() / 2);
		for (int row = 0; row < height; row++) {

			for (int col = 0; col < width; col++) {
				if (row == 0 || row == height - 1) {
					System.out.print(symbol);
				} else {

					if (col == 0 || col == (width - 1)) {
						System.out.print(symbol);
					} else {
						if (row == messageRow) {
							if (col == messageCol) {
								System.out.print(message);
								col += message.length();
							}
						} else
							System.out.print(" ");

					}
				}

//					} else {
//
////						if (row == messageRow) {
////							if (col == messageCol) {
////								for (int i = 0; i < message.length(); i++) {
////									System.out.println("1");
//								}
			}
			System.out.println();
		}

	}

}
