package ejercicios;

import java.util.Scanner;

//Desarrollar un sistema que permita el ingreso de totales recaudados de lunes a viernes, 
//donde ademas se pueda modificar uno de los valores ingresados seleccionando el numero de dia.
//Tambien se deberan poder listar los valores ingresados.(opcional ordenado de mayor a menor)
//Todas las funciones se codificaran en un menu con valores enteros hasta que el usuario ingrese 
//cero para salir. (1. agregar  2. listar 3. modificar 4. salir)

public class Ejercicio996Menu {

	private static final int CANT_DIAS = 5;
	private static final int SENTINEL = 4;
	private static float recaudacion[] = new float[CANT_DIAS];

	public static void main(String[] args) {
		darBienvenida("Bienvenido a su registro de recaudaciones.");
		ofrecerOpciones();

	}

	private static void ofrecerOpciones() {

		int seleccion = mostrarMenu();

		while (!validarSeleccion(seleccion)) {
			System.out.println("Opción inválida");
			seleccion = mostrarMenu();
		}
		while (seleccion != SENTINEL) {
			switch (seleccion) {
			case 1:
				agregarRecaudaciones();
				break;

			case 2:
				listarRecaudacion(recaudacion);
				break;

			case 3:
				modificarDatosIngresados();
				break;

			}
			seleccion = mostrarMenu();

		}
		salir();

	}

	private static void salir() {
		System.out.println("Gracias por utilizar nuestro servicio");

	}

	private static void modificarDatosIngresados() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el día cuya recaudación desea modificar ");
		int i = sc.nextInt();
		// validacion dia existente
		while (i < 0 || i > CANT_DIAS) {
			System.out.println("Valor inválido. Por favor ingrese el día cuya recaudación desea modificar");
			i = sc.nextInt();
		}
		System.out.println("Ingrese nueva recaudación del día " + i);
		recaudacion[i - 1] = sc.nextFloat();

	}

	private static void listarRecaudacion(float[] recaudacion) {
		for (int i = 0; i < CANT_DIAS; i++) {

			System.out.println("La recaudación del día " + (i + 1) + " es $" + recaudacion[i] + ".");

		}

	}

	private static void agregarRecaudaciones() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < CANT_DIAS; i++) {

			System.out.println("Ingrese la recaudación total del día " + (i + 1) + ".");
			recaudacion[i] = sc.nextFloat();
			System.out.println("Monto ingresado exitosamente");
			System.out.println();

		}

	}

	private static int mostrarMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menú");
		dibujarDivisor(70, "=");
		System.out.println("Seleccione operación a realizar:");
		System.out.println("1) Agregar");
		System.out.println("2) Listar");
		System.out.println("3) Modificar ");
		System.out.println("4) Salir");
		int seleccion = sc.nextInt();
		return seleccion;

	}

	private static boolean validarSeleccion(int seleccion) {
		return (seleccion <= 4 || seleccion > 0);

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
