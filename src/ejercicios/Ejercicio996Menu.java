package ejercicios;

import java.util.Scanner;

//Desarrollar un sistema que permita el ingreso de totales recaudados de lunes a viernes, 
//donde ademas se pueda modificar uno de los valores ingresados seleccionando el numero de dia.
//Tambien se deberan poder listar los valores ingresados.(opcional ordenado de mayor a menor)
//Todas las funciones se codificaran en un menu con valores enteros hasta que el usuario ingrese 
//cero para salir. (1. agregar  2. listar 3. modificar 4. salir)

public class Ejercicio996Menu {

	private static final int CANT_DIAS = 5;
	private static final int SENTINEL = 0;

	public static void main(String[] args) {
		darBienvenida("Bienvenido a su registro de recaudaciones.");
		menuDeFunciones();
		desplegarDatos();

	}

	private static void menuDeFunciones() {

		desplegarMenu();

	}

	private static void desplegarMenu() {
		System.out.println("Seleccione operación a realizar:");
		System.out.println("1) Agregar 2)Listar 3) Modificar 4) Salir");
		Scanner sc = new Scanner(System.in);
		int seleccion = sc.nextInt();

		while (!validarSeleccion(seleccion)) {
			System.out.println("Opción inválida");
			System.out.println("Seleccione operación a realizar:");
			System.out.println("1) Agregar 2)Listar 3) Modificar 4) Salir");
			seleccion = sc.nextInt();
		}
		while (seleccion != SENTINEL) {
			switch (seleccion) {
			case 1:
				agregarRecaudaciones();

			}
		}

	}

	private static void agregarRecaudaciones() {
		for (int i = 0; i < CANT_DIAS - 1; i++) {
			System.out.println("Ingrese la recaudación total del día " + (i) + ".");

		}

	}

	private static boolean validarSeleccion(int seleccion) {
		return (seleccion > 4 || seleccion < 0);

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
