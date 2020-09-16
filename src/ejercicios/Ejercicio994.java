package ejercicios;

import java.util.Scanner;

/*
 * Una empresa de comunicaciones ofrece servicio de telefon�a, banda ancha y tv digital. 
 * Cada uno de los servicios tiene un precio diferente (Telefon�a: 10, Banda ancha: 15, TV, 20). 
 * Se desea contar cu�ntos clientes optan por cada servicio para luego conocer la facturaci�n de cada uno de los servicios. 
 * Se deben ingresar los clientes por n�mero (cliente = 0 para finalizar) 
 */

public class Ejercicio994 {
	// Constantes
	private static final int PRECIO_TELEFONIA = 10;
	private static final int PRECIO_BANDA_ANCHA = 15;
	private static final int PRECIO_TV = 20;
	private static final int SENTINEL = 0;
	private static final int CANT_SERVICIOS = 3;

	public static void main(String[] args) {
		darBienvenida("Bienvenide al facturador de servicios de telefon�a");
		int cantClientes = asignarServicio();
		mostrarDatos(cantClientes);
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

	private static int asignarServicio() {
		System.out.println("Ingrese el n�mero de cliente");
		System.out.println("Para finalizar el servicio, ingrese 0. ");
		Scanner sc = new Scanner(System.in);
		int numCliente = sc.nextInt();

		int cantClientes = 0;

		int servicios[] = new int[CANT_SERVICIOS];

		while (numCliente != SENTINEL) {
			System.out.println("Ingrese el servicio que desea adquirir:");
			System.out.println("Telefon�a --> 1 // Banda ancha --> 2 // Televisi�n --> 3");
			int servicioElegido = sc.nextInt();
			switch (servicioElegido) {
			case 1:
				System.out.println("Usted a elegido la opci�n 1 - Telefon�a");
				servicios[0] += 1;
				break;
			case 2:
				System.out.println("Usted a elegido la opci�n 2 - Banda Ancha");
				servicios[1] += 1;
				break;
			case 3:
				System.out.println("Usted a elegido la opci�n 3 - Televisi�n ");
			}

			cantClientes += 1;
			System.out.println("Ingrese el n�mero de cliente");
			System.out.println("Para finalizar el servicio, ingrese 0. ");
			numCliente = sc.nextInt();

		}

		facturacionPorServicio(servicios, cantClientes);

		sc.close();

		return cantClientes;
	}

	private static void facturacionPorServicio(int[] servicios, int cantClientes) {
		for (int i = 0; i < servicios.length; i++) {
			System.out.println(
					"El servicio " + (i + 1) + " fue contratado por un total de: " + servicios[i] + " clientes.");

		}

	}

	private static void mostrarDatos(int cantClientes) {
		System.out.println("El total de clientes que han contratado un servicio es:  " + cantClientes);

	}
}
