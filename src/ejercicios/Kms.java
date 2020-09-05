package ejercicios;

import java.util.Scanner;

public class Kms {
	public int setKms() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique la cantidad de kms a recorrer: ");

		int kms = sc.nextInt();// creo la variable km
		// sc.close();
		return kms;
	}

}
