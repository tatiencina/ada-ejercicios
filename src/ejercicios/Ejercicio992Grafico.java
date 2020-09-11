package ejercicios;

import java.util.Scanner;

public class Ejercicio992Grafico {
	public static void main(String[] args) {
		System.out.println("Sistema de estaciones en ruta");// atajo sysout
		System.out.println("============================");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese cantidad de estaciones intermedias: ");
		int totalEstaciones = sc.nextInt();

		System.out.println(); // deja un rengl�n vac�o

		int ciudades[] = new int[totalEstaciones]; // Vector
		double acumulador = 0; // acumulador de distancias

		for (int i = 0; i < ciudades.length; i++) {
			System.out.print("Ingrese los kms para la estaci�n " + (i + 1) + ": ");
			ciudades[i] = sc.nextInt();
			acumulador += ciudades[i];

		}

		System.out.println("La distancia promedio entre estaciones es: " + (acumulador / totalEstaciones));

		sc.close();

		System.out.print("*");
		for (int j = 0; j < totalEstaciones; j++) {

			dibujarTrayecto(ciudades[j]);

		}

	}

	/*
	 * por cada estaci�n imprimo la cantidad de l�neas seg�n los kms luego imprimo
	 * un *
	 */
	private static void dibujarTrayecto(int distancia) {
		for (int i = 0; i < distancia; i++) {
			System.out.print("-");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.print("*");

	}

}
