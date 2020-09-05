package ejercicios;

import java.util.Scanner;

public class Ejercicio210Autobus {
	private static final float COSTO_A = 2;
	private static final float COSTO_B = 2.5f;
	private static final float COSTO_C = 3;
	private static final int MIN_PERSONAS = 20;

	static int personas;
	static int kms;
	static String tipoBus;

	public static void main(String[] args) {

		askForInput();
		calculate();

	}

	private static void askForInput() {
		setPersonas();
		setKms();
		setTipoBus();
	}

	private static int setPersonas() {
		// instanciamos la clase Scanner
		// crea un nuevo objeto scanner que se le asigna a la variable sc
		// la clase System tiene atributos, en este caso uso in ENTRADA
		// Nos devuelve un objeto que es una entrada de datos
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique la cantidad de pasajeros: ");

		personas = sc.nextInt();// creo la variable cantidad de personas
		// next int se detiene hasta que recibe el Input. El resultado
		// lo guardo en personas
		// sc.close();
		return personas;

	}

	private static int setKms() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique la cantidad de kms a recorrer: ");

		kms = sc.nextInt();// creo la variable km
		// sc.close();
		return kms;

	}

	private static String setTipoBus() {
		Scanner sc = new Scanner(System.in);// nuevo objeto de la clase Scanner.
		// parametros (System.in)
		System.out.println("Indique el tipo de bus (A,B o C): ");

		tipoBus = sc.next();
		sc.close();
		return tipoBus;
	}

	private static void calculate() {
		System.out.println("Usted ingresó: " + personas + " personas. Indicó un recorrido de: " + kms
				+ "kms. Seleccionó el Bus: " + tipoBus.toUpperCase());

		int totalPersonas = MIN_PERSONAS;
		if (personas > MIN_PERSONAS) {
			totalPersonas = personas;
		}

		int costoTotal = totalPersonas * kms;

		float totalGrupal = 0;

		switch (tipoBus.toUpperCase()) {
		case "A":
			totalGrupal = costoTotal * COSTO_A;
			break;
		case "B":
			totalGrupal = costoTotal * COSTO_B;
			break;
		case "C":
			totalGrupal = costoTotal * COSTO_C;
			break;

		}

		float costoPersona = totalGrupal / totalPersonas;

		System.out.println("El costo total del grupo es: " + totalGrupal);
		System.out.println("El costo por persona es: " + costoPersona);
	}

}
