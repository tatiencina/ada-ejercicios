package ejercicios;

public class Calculate {
	private static final float COSTO_A = 2;
	private static final float COSTO_B = 2.5f;
	private static final float COSTO_C = 3;
	private static final int MIN_PERSONAS = 20;

	public void makeCalculate(int personas, int kms, String tipoBus) {
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
