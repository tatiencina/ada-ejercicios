package ejercicios;

import java.util.Scanner;

/*
 * Un tablero de 3 x 3 matriz [fila] [columna]
 * Jugador uno: ingrese fila, ingrese columna por input
 * Una vez que tengo las coordenadas muestro el tablero X o O 
 * Verificar si la posición está libre y verificar si ganó
 * Mientras nadie gane, juega el siguiente 
 */

public class Ejercicio999TaTeTi {
	private static final int ROWS = 3;
	private static final int COLS = 3;

	public static void main(String[] args) {
		String[][] tablero = new String[ROWS][COLS];
		boolean isWinner = false;
		darBienvenida("TATETI");
		dibujartablero(tablero);
		jugar(tablero, isWinner);
		// Definir quién está jugando

		// Pido posicion al jugador 1

		// verifico que la posicion esté vacía

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

	private static void jugar(String tablero[][], boolean isWinner) {
		int turnCounter = 2;
		int turn = 0;
		while (!isWinner(tablero) && turnCounter < 11) { // Mientras no haya ganador o se llenen los casilleros

			turn = turnCounter % 2;
			playTurn(turn, tablero);
			System.out.println("Turno " + (turnCounter - 1));
			mostrarTablero(tablero);
//			isWinner = isWinner(tablero);
			turnCounter++; // Acumulador de turnos

		}
		if (isWinner(tablero)) {
			System.out.println("GANASTE!!! JUGADOR " + (turn + 1));
		} else {
			if (turnCounter == 11) {
				System.out.println("Se terminaron los turnos, no hay ganador!");
			}
		}

	}

	private static void playTurn(int turno, String[][] tablero) {
		System.out.println("Ingrese fila");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Ingrese columna");
		int col = sc.nextInt();

		while (col < 0 || col > 2 || row < 0 || row > 2) {
			System.out.println("Posición inválida!");
			if (row < 0 || row > 2) {
				System.out.println("Ingrese fila");
				row = sc.nextInt();
			} else {
				System.out.println("Ingrese columna");
				col = sc.nextInt();
			}
		}

		while (tablero[row][col] == " X " || tablero[row][col] == " O ") {
			System.out.println("Esa posición ya está ocupada!");
			System.out.println("Ingrese fila");
			row = sc.nextInt();
			System.out.println("Ingrese columna");
			col = sc.nextInt();
		}

		if (turno == 0) {
			// juega el jugador 1 X
			tablero[row][col] = " X ";

		} else { // juega el jugador 2 0
			tablero[row][col] = " O ";
		}

	}

	private static boolean isWinner(String tablero[][]) {

		boolean cond1 = (tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2]);
		boolean cond2 = (tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2]);
		boolean cond3 = (tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2]);
		boolean cond4 = (tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0]);
		boolean cond5 = (tablero[0][1] == tablero[1][1] && tablero[0][1] == tablero[2][1]);
		boolean cond6 = (tablero[0][2] == tablero[1][2] && tablero[0][2] == tablero[2][2]);
		boolean cond7 = (tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]);
		boolean cond8 = (tablero[0][2] == tablero[1][1] && tablero[0][0] == tablero[2][0]);
		return (cond1 || cond2 || cond3 || cond4 || cond5 || cond6 || cond7 || cond8)
				&& (tablero[0][0] == "X" || tablero[0][0] == "O");
	}

	private static void dibujartablero(String[][] tablero) {
		for (int i = 0; i < tablero.length; i++) { // filas
			// relleno de la matriz, todas las posiciones valen 0
			for (int j = 0; j < tablero.length; j++) { // columnas
				tablero[i][j] = " - ";

			}

		}

		mostrarTablero(tablero);

	}

	private static void mostrarTablero(String[][] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}

	}

}
