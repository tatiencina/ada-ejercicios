package ejercicios;

import java.util.Scanner;

//Se venden boletos de una funcion numerados del 0-49. Cada uno de esos boletos
//se corresponde con un asiento
//Solicitar que asiento elige la persona al  comprarlo y marcarlo con un valor 1
//hasta que se ingrese asiento numero 99
//Listar los asientos vendidos

public class Ejercicio993 {
	private static final int CANT_BUTACAS = 50;
	private static final int CANT_FILAS = CANT_BUTACAS / 10;

	public static void main(String[] args) {
		darBienvenida("Bienvenide al sistema de venta de boletos");
		int butacas[] = inicializarButacas();
		int contador = venderButacas(butacas);
		mostrarButacas(contador, butacas);
		dibujarTeatro(butacas);

	}

	private static void darBienvenida(String mensajeBienvenida) {
		dibujarSubrayado(mensajeBienvenida.length(), "=");
		System.out.println(mensajeBienvenida.toUpperCase());
		dibujarSubrayado(mensajeBienvenida.length(), "=");
		System.out.println();
	}

	private static void dibujarSubrayado(int longitud, String simbolo) {
		for (int i = 0; i < longitud; i++) {
			System.out.print(simbolo);

		}
		System.out.println();

	}

	private static int[] inicializarButacas() {
		int butacas[] = new int[CANT_BUTACAS];
		for (int i = 0; i < butacas.length; i++) {
			butacas[i] = 0;
		}
		return butacas;
	}

	private static int venderButacas(int[] butacas) {

		int solicitudAsiento;
		int contador = 0;

		System.out.println("Ingrese el número de butaca que desea adquirir");
		Scanner sc = new Scanner(System.in);
		solicitudAsiento = sc.nextInt();

		while (solicitudAsiento != 99) {
			if (!teatroLleno(butacas)) {

				if (esValido(solicitudAsiento)) {
					System.out.println("Butaca: " + (solicitudAsiento));

					if (asientoDisponible(butacas, solicitudAsiento)) {
						contador = venderAsiento(butacas, solicitudAsiento, contador);

					} else {
						System.out.println("Butaca no disponible. Seleccione otra ubicación");
						System.out.println();
					}

					System.out.println("Para adquirir otra localidad, ingrese el número de butaca que desea .");
					System.out.println("De lo contrario, ingrese 99 para terminar.");
					solicitudAsiento = sc.nextInt();
				} else {

					System.out
							.println("Ingresó un numero de butaca inválido. Por favor seleccione un asiento entre 1 y "
									+ CANT_BUTACAS);
					solicitudAsiento = sc.nextInt();

				}

			}

			else {
				System.out.println("Todas las localidades fueron vendidas!");
				dibujarSubrayado(50, "*");
				solicitudAsiento = 99;
			}

		}
		sc.close();
		dibujarSubrayado(50, "*");
		return contador;

	}

	private static boolean teatroLleno(int butacas[]) {
		boolean estaLleno = true;
		for (int i = 0; i < butacas.length; i++) {
			estaLleno = estaLleno && butacas[i] == 1;

		}
		return estaLleno;
	}

	private static int venderAsiento(int[] butacas, int solicitudAsiento, int contador) {
		butacas[solicitudAsiento - 1] = 1;
		contador += 1;
		System.out.println("Butaca disponible.");
		System.out.println();
		System.out.println("Venta confirmada");
		System.out.println();
		return contador;
	}

	private static boolean asientoDisponible(int butacas[], int solicitudAsiento) {
		boolean disponible = (butacas[solicitudAsiento - 1] == 0);
		return disponible;
	}

	private static boolean esValido(int solicitudAsiento) {
		boolean valido = (solicitudAsiento - 1 >= 0 && solicitudAsiento - 1 < (CANT_BUTACAS));

		return valido;

	}

	private static void mostrarButacas(int contador, int[] butacas) {
		System.out.println("Total de butacas vendidas:" + contador);
		for (int j = 0; j < butacas.length; j++) {
			if (butacas[j] == 1) {
				System.out.println("Butaca: " + (j + 1));
			}
		}
		System.out.println("Total de butacas disponibles: " + (CANT_BUTACAS - contador));
		dibujarSubrayado(50, "*");
	}

	private static void dibujarTeatro(int butacas[]) {
		System.out.println("SALA");
		System.out.println();
		for (int i = 0; i < CANT_FILAS; i++) {
			for (int j = 0; j < 10; j++) {
				if (butacas[10 * i + j] == 0) {
					System.out.print("*");
				} else
					System.out.print("x");

			}
			System.out.println();

		}
	}

}
