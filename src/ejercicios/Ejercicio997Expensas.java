package ejercicios;

import java.util.Scanner;

/*
 * Se desea calcular el total de expensas a pagar
 * de un edificio de 4 pisos que tiene un 
 * departamento por piso desde planta baja hasta
 * el último piso. Se deben ingresar los valores
 * de cada departamento y luego informar el 
 * importe de expensas promedio
 */

public class Ejercicio997Expensas {
	private static final int CANT_PISOS = 4;

	public static void main(String[] args) {
		darBienvenida("Hola vecines! Esta es su calculadora de expensas.");
		calcularExpensas();

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

	private static void calcularExpensas() {

		float expensasDepto[] = new float[CANT_PISOS];
		float acumuladorExpensas = 0f;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < expensasDepto.length; i++) {
			System.out.println("Ingrese el monto de expensas del departamento " + (i + 1));
			expensasDepto[i] = sc.nextFloat();
			acumuladorExpensas += expensasDepto[i];

		}
		dibujarDivisor(50, "-");
		System.out.println("Los valores ingresados son:");
		for (int i = 0; i < expensasDepto.length; i++) {
			System.out.println("Departamento " + (i + 1) + ": $" + expensasDepto[i]);

		}
		mostrarTotales(acumuladorExpensas);

		sc.close();
		darBienvenida("Gracias por usar este servicio!");

	}

	private static void mostrarTotales(float acumuladorExpensas) {
		dibujarDivisor(50, "-");
		System.out.println("El total de expensas a pagar es: $" + acumuladorExpensas);
		dibujarDivisor(50, "-");
		System.out.println("El valor promedio de las expensas es: $" + (acumuladorExpensas / CANT_PISOS));
		;
		dibujarDivisor(50, "-");

	}

}
