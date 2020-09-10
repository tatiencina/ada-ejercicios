package ejercicios;

import java.util.Scanner;

/*
*En un trayecto entre dos ciudades se deben realizar paradas 
*intermedias.
*Se desea conocer cuantas paradas se van a realizar 
*en el viaje y la longitud de los trayectos en kilometros.
*Se desea conocer la longitud promedio entre ciudades y
*cuales son las paradas mas cercanas
 * 
 */

public class Ejercicio992 {
	public static void main(String[] args) {
		int cantParadas = 0;

		int paradaCercana = 0;

		double totalDistancias = 0;

		double minKm = -1;

		System.out.println("Bienvenide a su calculadora de paradas!");
		System.out.println("Para continuar, ingrese la cantidad de paradas que desea realizar");
		Scanner sc = new Scanner(System.in);
		cantParadas = sc.nextInt();
		// Cantidad de paradas

		while (cantParadas <= 0) {
			System.out.println("La cantidad de paradas tiene que ser mayor que 0.");
			System.out.println("Por favor, ingrese la cantidad de paradas que desea realizar");
			cantParadas = sc.nextInt();
		}

		double distancias[] = new double[cantParadas];
		for (int i = 0; i < distancias.length; i++) {
			distancias[i] = 0;

		}

		for (int i = 0; i < distancias.length; i++) {
			System.out.println(
					"Ingrese ahora la distancia que desea recorrer hasta la parada n°" + (i + 1) + " (en kms).");
			distancias[i] = sc.nextDouble();
			totalDistancias += distancias[i];

			if (minKm == -1 || distancias[i] < minKm) {
				paradaCercana = i + 1;
				minKm = distancias[i];

			}

		}

		System.out.println("Ingrese a cuántos kms de su destino le gustaría realizar la última parada (en kms).");
		double distanciaFinal = sc.nextDouble();
		System.out.println("La distancia total es " + (totalDistancias + distanciaFinal) + "kms");
		System.out.println("La distancia promedio entre paradas es: " + (totalDistancias / cantParadas) + "kms");
		System.out.println("La menor distancia entre paradas es de: " + minKm + "kms, entre las paradas "
				+ (paradaCercana - 1) + " y " + (paradaCercana));
		sc.close();

	}
}
