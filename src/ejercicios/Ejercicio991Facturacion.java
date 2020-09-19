package ejercicios;

import java.util.Scanner;

/*
 * Se tiene una l�nea de 4 cajas donde se cobran facturas que luego 
 * ser�n cargadas en el sistema.
 * Se solicitar� el n�mero de caja y el importe cobrado. La carga 
 * finaliza con importe cero.
 * Informar la cantidad de facturas cobradas por cada caja 
 * y el promedio de todas las facturas.
 */

public class Ejercicio991Facturacion {

	private static final int CANT_CAJAS = 4;

	public static void main(String[] args) {

		int cajas[] = new int[CANT_CAJAS];
		int caja;
		double totalFacturas = 0;
		int cantidadFacturas = 0;
		double promedio = 0f;

		for (int i = 0; i < cajas.length - 1; i++) {
			cajas[i] = 0;
		}

		System.out.println("Bienvenide! ");
		System.out.println("Ingrese el importe de la factura ( 0 para terminar )");
		Scanner sc = new Scanner(System.in);
		double importe = sc.nextDouble();

		while (importe != 0) {

			System.out.println("Ingrese el n�mero de caja");
			caja = sc.nextInt();

			while (caja > cajas.length && caja > 0) {
				System.out.println("N�mero de caja inexistente");
				System.out.println("Ingrese el n�mero de caja");
				caja = sc.nextInt();
			}

			totalFacturas = totalFacturas + importe;
			cajas[caja - 1] = cajas[caja - 1] + 1;

			System.out.println("Ingrese el importe de la factura ( 0 para terminar )");
			importe = sc.nextDouble();

		}

		sc.close();
		for (int i = 0; i < cajas.length; i++) {
			System.out.println("La caja " + (i + 1) + " tiene un total de " + cajas[i] + " facturas");
			cantidadFacturas = cantidadFacturas + cajas[i];
		}

		System.out.println("El total de facturas ingresadas es: " + cantidadFacturas);

		promedio = totalFacturas / cantidadFacturas;
		System.out.println("La recaudaci�n total es : " + totalFacturas);
		System.out.println("El promedio de facturaci�n es: " + promedio);
	}
}
