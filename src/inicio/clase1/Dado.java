package inicio.clase1;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Dado extends ConsoleProgram {

	public void runDice() {
		int numSides = readInt("Cantidad de lados del dado: ");
		int maxRolls = readInt("Cantidad de tiros: ");
		int numRolls = 0;

		while (true) {
			int roll = rollDice(maxRolls, numSides);
			numRolls++;
			if (numRolls == maxRolls + 1)
				break;
			println("Sacaste " + roll);

		}
		println("Ya agotaste tus tiros. Cómo te fue?");

	}

	/*
	 * public void runDice(int numSides, int maxRolls) { int numRolls = 0; while
	 * (true) { int roll = rollDice(maxRolls, numSides); numRolls++; if (numRolls ==
	 * maxRolls + 1) break; println("Sacaste " + roll);
	 * 
	 * } println("Ya agotaste tus tiros. Cómo te fue?"); }
	 */
	private int rollDice(int maxRolls, int numSides) {
		int total = 0;
		for (int i = 0; i < maxRolls; i++)
			;
		total += rgen.nextInt(1, numSides);
		return total;

	}

	private RandomGenerator rgen = RandomGenerator.getInstance();
}
