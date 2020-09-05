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
			System.out.println("Excede peso m�ximo");
			System.out.println("Ingrese el peso del paquete en gramos: ");
			pesoPaq = sc.nextInt();

		}
		while (pesoPaq < 0) {
			System.out.println("Usted ingres� un valor inv�lido");
			System.out.println("Ingrese el peso del paquete en gramos: ");
			pesoPaq = sc.nextInt();
		}
		System.out.println("Las zonas de Env�o son:");
		System.out.println("1 = Am�rica del norte. 2 = Am�rica Central. 3 = Am�rica del Sur. 4 = Europa. 5 = Asia");
		System.out.println("Ingrese zona de env�o (1-5)");
		zonaEnvio = sc.nextInt();
		sc.close();

		System.out.println("Usted desea env�ar un paquete de: " + pesoPaq + " gramos a la zona " + zonaEnvio + ".");

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
			System.out.println("Zona inv�lida");
			break;

		}
		System.out.println("El costo total del env�o es: " + costoEnvio);
	}

}
