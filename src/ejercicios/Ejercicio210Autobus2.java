package ejercicios;

public class Ejercicio210Autobus2 {

	static int kms;
	static String tipoBus;
	static int personas;

	public static void main(String[] args) {

		askForInput();
		calculate();

	}

	private static void askForInput() {
		setPersonas();
		setKms();
		setTipoBus();
	}

	private static void setPersonas() {
		Personas personasBus = new Personas();
		personas = personasBus.setPersonas();
	}

	private static void setKms() {
		Kms kmsBus = new Kms();
		kms = kmsBus.setKms();

	}

	private static void setTipoBus() {
		TipoBus busViaje = new TipoBus();
		tipoBus = busViaje.setTipoBus();

	}

	private static void calculate() {
		Calculate calculo = new Calculate();
		calculo.makeCalculate(personas, kms, tipoBus);

	}

}
