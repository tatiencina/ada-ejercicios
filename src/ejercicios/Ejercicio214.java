package ejercicios;

import java.util.Scanner;

public class Ejercicio214 {
	private static final float COSTO_1 = 11.0f;
	private static final float COSTO_2 = 10.0f;
	private static final float COSTO_3 = 12.0f;
	private static final float COSTO_4 = 24.0f;
	private static final float COSTO_5 = 27.0f;
	private static final int PESO_MAX = 5000;

	static int pesoPaq;
	static int zonaEnvio;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el peso del paquete en gramos: ");
		pesoPaq = sc.nextInt();
		while (pesoPaq > PESO_MAX) {
			System.out.println("Excede peso máximo");
			System.out.println("Ingrese el peso del paquete en gramos: ");
			pesoPaq = sc.nextInt();

		}
		while (pesoPaq < 0) {
			System.out.println("Usted ingresó un valor inválido");
			System.out.println("Ingrese el peso del paquete en gramos: ");
			pesoPaq = sc.nextInt();
		}
		System.out.println("Las zonas de Envío son:");
		System.out.println("1 = América del norte. 2 = América Central. 3 = América del Sur. 4 = Europa. 5 = Asia");
		System.out.println("Ingrese zona de envío (1-5)");
		zonaEnvio = sc.nextInt();
		sc.close();

		System.out.println("Usted desea envíar un paquete de: " + pesoPaq + " gramos a la zona " + zonaEnvio + ".");

		float costoEnvio = 0;

		switch (zonaEnvio) {

		case 1:
			costoEnvio = pesoPaq * COSTO_1;
			break;

		case 2:
			costoEnvio = pesoPaq * COSTO_2;
			break;

		case 3:
			costoEnvio = pesoPaq * COSTO_3;

			break;
		case 4:
			costoEnvio = pesoPaq * COSTO_4;
			break;

		case 5:
			costoEnvio = pesoPaq * COSTO_5;
			break;

		default:
			System.out.println("Zona inválida");
			break;

		}
		System.out.println("El costo total del envío es: " + costoEnvio);
	}

}
