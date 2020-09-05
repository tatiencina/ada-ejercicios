package ejercicios;

import java.util.Scanner;

public class Personas {
	public int setPersonas() {
		// instanciamos la clase Scanner
		// crea un nuevo objeto scanner que se le asigna a la variable sc
		// la clase System tiene atributos, en este caso uso in ENTRADA
		// Nos devuelve un objeto que es una entrada de datos
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique la cantidad de pasajeros: ");

		int personas = sc.nextInt();// creo la variable cantidad de personas
		// next int se detiene hasta que recibe el Input. El resultado
		// lo guardo en personas
		// sc.close();
		return personas;

	}

}
