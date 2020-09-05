package ejercicios;

import java.util.Scanner;

public class Ejercicio203 {
	private static final float PRECIO_NORMAL = 90.0f;
	private static final float PRECIO_MAYORISTA = 85.0f;
	private static final int MINIMO_MAYORISTA = 1000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de lápices: ");
		int cantLapices = sc.nextInt();

		while (cantLapices < 0) {
			System.out.println("Ingresó una cantidad inválida");
			System.out.println("Ingrese la cantidad de lápices: ");
			cantLapices = sc.nextInt();
			sc.close();
		}
		float pagoLapices = 0;

		if (cantLapices >= MINIMO_MAYORISTA) {
			pagoLapices = cantLapices * PRECIO_MAYORISTA;
			System.out.println("El precio final de los lápices es: $" + pagoLapices);

		} else {
			pagoLapices = cantLapices * PRECIO_NORMAL;
			System.out.println("El precio final de los lápices es: $" + pagoLapices);
		}
	}

}
