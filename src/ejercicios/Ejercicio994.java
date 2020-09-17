package ejercicios;

import java.util.Scanner;

/*
 * Una empresa de comunicaciones ofrece servicio de telefonía, banda ancha y tv digital. 
 * Cada uno de los servicios tiene un precio diferente (Telefonía: 10, Banda ancha: 15, TV, 20). 
 * Se desea contar cuántos clientes optan por cada servicio para luego conocer la facturación de cada uno de los servicios. 
 * Se deben ingresar los clientes por número (cliente = 0 para finalizar) 
 */

public class Ejercicio994 {
	// Constantes
	private static final int PRECIO_TELEFONIA = 10;
	private static final int PRECIO_BANDA_ANCHA = 15;
	private static final int PRECIO_TV = 20;
	private static final int SENTINEL = 0;
	private static final int CANT_SERVICIOS = 3;

	public static void main(String[] args) {

		darBienvenida("Bienvenide al facturador de servicios de telefonía");
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
		System.out.println("Ingrese el número de cliente");
		System.out.println("Para finalizar el servicio, ingrese 0. ");
		Scanner sc = new Scanner(System.in);
		int numCliente = sc.nextInt();

		int servicios[] = new int[CANT_SERVICIOS];
		int cantClientes = 0;
		int factServicio[] = new int[CANT_SERVICIOS];

//		ArrayList<Integer> clientes = new ArrayList<Integer>();
//			for (int i = 0; i < clientes.length; i++) {
//				clientes[i] = 0;
//			}

		while (numCliente != SENTINEL) {

			System.out.println("Ingrese el servicio que desea adquirir:");
			System.out.println("Telefonía --> 1 // Banda ancha --> 2 // Televisión --> 3");
			int servicioElegido = sc.nextInt();

			if (servicioValido(servicioElegido)) {
				switch (servicioElegido) {
				case 1:
					System.out.println("Usted a elegido la opción 1 - Telefonía");
					servicios[0] += 1;
					factServicio[0] += PRECIO_TELEFONIA;
					break;
				case 2:
					System.out.println("Usted a elegido la opción 2 - Banda Ancha");
					servicios[1] += 1;
					factServicio[1] += PRECIO_BANDA_ANCHA;
					break;
				case 3:
					System.out.println("Usted a elegido la opción 3 - Televisión ");
					servicios[2] += 1;
					factServicio[2] += PRECIO_TV;
					break;
				}

//				if(clienteNuevo(numCliente))
				cantClientes += 1;
				dibujarDivisor(70, "=");
				System.out.println("Ingrese el número de cliente");
				System.out.println("Para finalizar el servicio, ingrese 0. ");
				numCliente = sc.nextInt();

			} else {
				System.out.println("El valor ingresado no corresponde a ninguno de nuestros servicios.");

			}
		}

		facturacionPorServicio(servicios, cantClientes, factServicio);

		sc.close();

		return cantClientes;
	}

//	private static boolean clienteNuevo(int numCliente, Integer[] clientes) {
//		return   ();
//		
//			
//		
//		;
//	}

	private static boolean servicioValido(int servicioElegido) {
		return (servicioElegido > 0 && servicioElegido <= CANT_SERVICIOS);

	}

	private static void facturacionPorServicio(int[] servicios, int cantClientes, int[] factServicio) {
		dibujarDivisor(70, "=");

		for (int i = 0; i < servicios.length; i++) {
			System.out.println(
					"El servicio " + (i + 1) + " fue contratado por un total de: " + servicios[i] + " clientes.");
			System.out.println(
					"La facturación total por contrataciones del servicio " + i + " es de: $" + factServicio[i]);
			dibujarDivisor(70, "=");

		}

	}

	private static void mostrarDatos(int cantClientes) {
		System.out.println("El total de clientes que han contratado un servicio es:  " + cantClientes);
		dibujarDivisor(70, "=");

	}
}
