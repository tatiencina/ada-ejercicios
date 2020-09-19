package ejercicios;

import java.util.Scanner;
/* 
 * Necesito calcular el monto de la compra de l�pices
 * El valor unitario es 90.0, pero si compran m�s de 1000 el 
 * precio cambia a 85.0
 */

public class Ejercicio203Lapices {
	private static final float PRECIO_NORMAL = 90.0f;
	private static final float PRECIO_MAYORISTA = 85.0f;
	private static final int MINIMO_MAYORISTA = 1000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de l�pices: ");
		int cantLapices = sc.nextInt();

		while (cantLapices < 0) {
			System.out.println("Ingres� una cantidad inv�lida");
			System.out.println("Ingrese la cantidad de l�pices: ");
			cantLapices = sc.nextInt();
			sc.close();
		}
		float pagoLapices = 0;

		if (cantLapices >= MINIMO_MAYORISTA) {
			pagoLapices = cantLapices * PRECIO_MAYORISTA;
			System.out.println("El precio final de los l�pices es: $" + pagoLapices);

		} else {
			pagoLapices = cantLapices * PRECIO_NORMAL;
			System.out.println("El precio final de los l�pices es: $" + pagoLapices);
		}
	}

}
