package ejercicios;

import java.util.Scanner;

/*
 * Juego del ahorcado
 */

public class Ejercicio995 {

	private static final int MIN_PALABRA = 4;
	private static final int MAX_PALABRA = 10;
	private static final int MAX_ERRORES = 5;

	public static void main(String[] args) {

		darBienvenida("Juguemos al ahorcado");
		// generar palabra
		String palabra = generarPalabra();
		// repetir ingreso de letras hasta adivinar
		int errores = jugar(palabra);
		mostrarPuntos(errores);
	}

	private static String generarPalabra() {
		/*
		 * Vamos a solicitar al usuario que ingrese la palabra para jugar reglas: minimo
		 * 4 letras maximo 10 letras
		 */
		System.out.println("Vamos a empezar! Primero, pedile a un amigue que ingrese una palabra para que adivines.");
		System.out.println("No mires!");
		Scanner sc = new Scanner(System.in);
		String palabra = sc.next().toUpperCase();
		while (!esPalabraValida(palabra)) {
			System.out.println("Ups! Palabra inválida. Ingresa una nueva palabra, que tenga entre 4 y 10 letras.");
			palabra = sc.next();
		}
		dibujarDivisor(100, "*");
		System.out.println("Vamos a jugar!");
//		sc.close();
		return palabra;
	}

	private static boolean esPalabraValida(String palabra) {
		return (palabra.length() >= MIN_PALABRA && palabra.length() <= MAX_PALABRA);

	}

	private static int jugar(String palabra) {

		int aciertos = 0;
		int errores = 0;
		boolean[] resultado = new boolean[palabra.length()];

		System.out.println("Ingresá una letra!");
		Scanner sc = new Scanner(System.in);
		String letra = (sc.nextLine().toUpperCase());

		while (aciertos < palabra.length() && errores != MAX_ERRORES) {
			int posicion = palabra.indexOf(letra); // si la letra no existe devuelve -1, si no, devuelve la posición
			// buscar letra en la palabra

			if (posicion != -1) {
				// si existe, contar acierto
				resultado[posicion] = posicion != -1;
				aciertos++;

			} else {
				errores++;
			}

			for (int i = 0; i < palabra.length(); i++) {
				// si existe, mostrar letra
				if (resultado[i]) {
					System.out.print(" " + palabra.charAt(i) + " "); // devuelve la letra en su posición

				} else {
					System.out.print("_");

				}

			}
			System.out.println("Errores: " + errores);
			System.out.println();

			if (aciertos == palabra.length()) {
				System.out.println("GANASTE!!");
			}

			if (errores == MAX_ERRORES) {
				System.out.println("Oh no, ya no quedan mas intentos. Perdiste T.T");

			} else {

				System.out.println("Ingresá una letra!");
				letra = sc.next().toUpperCase();

			}
		}

		sc.close();
		return errores;
	}

	private static void mostrarPuntos(int errores) {
		// calculo el puntaje en base a intentos. 1 es maximo 10 es 0
		int puntaje = MAX_PALABRA - errores;
		System.out.println("Hiciste " + puntaje + "puntos");

	}

	private static void darBienvenida(String mensajeBienvenida) {

		dibujarDivisor(mensajeBienvenida.length(), "=");
		System.out.println(mensajeBienvenida.toUpperCase());
		dibujarDivisor(mensajeBienvenida.length(), "=");
		System.out.println();
	}

	private static void dibujarDivisor(int longitud, String simbolo) {
		for (int i = 0; i < longitud; i++) {
			System.out.print(simbolo);

		}
		System.out.println();

	}

}
