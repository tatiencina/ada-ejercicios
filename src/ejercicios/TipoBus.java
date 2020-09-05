package ejercicios;

import java.util.Scanner;

public class TipoBus {
	public String setTipoBus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el tipo de bus (A,B o C): ");

		String tipoBus = sc.next();
		sc.close();
		return tipoBus;
	}
}
