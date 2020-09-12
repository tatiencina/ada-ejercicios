package ejercicios;

import java.util.Scanner;

public class Ejercicio993 {
	private static final int CANT_BUTACAS = 50;

	public static void main(String[] args) {
		darBienvenida();
		int butacas[] = inicializarButacas();
		int contador = venderButacas(butacas);
		mostrarButacas(contador, butacas);

	}

	private static void darBienvenida() {
		System.out.println("Bienvenide al sistema de venta de boletos");
		System.out.println("============================");
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
			if (esValido(solicitudAsiento)) {
				System.out.println("Butaca: " + (solicitudAsiento)/* + "=" + (butacas[solicitudAsiento]) */);

				if (butacas[solicitudAsiento - 1] == 0) {
					butacas[solicitudAsiento - 1] = 1;
					contador += 1;
					System.out.println("Butaca disponible.");
					System.out.println();
					System.out.println("Venta confirmada");

				} else {
					System.out.println("Butaca no disponible. Seleccione otra ubicación");
				}

				System.out.println("Para adquirir otra butaca, ingrese el número de butaca que desea adquirir.");
				System.out.println("De lo contrario, ingrese 99 para terminar.");
				solicitudAsiento = sc.nextInt();
			} else {

				System.out.println("Ingresó un numero de butaca inválido. Por favor seleccione un asiento entre 1 y "
						+ CANT_BUTACAS);
				solicitudAsiento = sc.nextInt();

			}
		}
		sc.close();
		return contador;

	}

	private static boolean esValido(int solicitudAsiento) {
		boolean valido = (solicitudAsiento - 1 >= 0 && solicitudAsiento - 1 < (CANT_BUTACAS));

		return valido;

	}

	private static void mostrarButacas(int contador, int[] butacas) {
		System.out.println("Butacas vendidas:" + contador);
		for (int j = 0; j < butacas.length; j++) {
			if (butacas[j] == 1) {
				System.out.println("Butaca: " + j);
			}
		}

	}
}
