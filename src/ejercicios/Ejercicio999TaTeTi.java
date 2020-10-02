package ejercicios;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * Un tablero de 3 x 3 matriz [fila] [columna]
 * Jugador uno: ingrese fila, ingrese columna por input
 * Una vez que tengo las coordenadas muestro el tablero X o O 
 * Verificar si la posición está libre y verificar si ganó
 * Mientras nadie gane, juega el siguiente
 *
 * Incluye validaciones para:
 * - posición válida
 * - posición no ocupada
 * - hay un ganador
 * - se agotaron los turnos
 * - continuar jugando o finalizar juego
 */

public class Ejercicio999TaTeTi {
	private static final int ROWS = 3;
	private static final int COLS = 3;
	private static final int MAX_TURNS=9;
	private static String continuePlaying = "Y";

	public static void main(String[] args) {
		String[][] tablero = new String[ROWS][COLS];
		drawSign("TATETI","=");
		startGame(tablero);



	}

	private static void startGame(String[][]tablero) {

		// while (continuePlaying(choice)) {
			while(continuePlaying.equals("Y")){
			startBoard(tablero);
			playGame(tablero);
			drawLine(70,"*");
			restartOrExit();

			// if (continuePlaying.equals("N")) break;
		}
		drawSign("Hasta la próxima!", "=");

	}

	private static void restartOrExit() {

		System.out.println("Seguimos jugando?");
		System.out.print("Sí (Y) - No (N) --> ");
		Scanner sc = new Scanner(System.in);
		continuePlaying = sc.next().toUpperCase();
		drawLine(70,"*");

		while(!continuePlaying.equals("N") && !continuePlaying.equals("Y")){
			System.out.print("Sí (Y) - No (N) --> " );
			continuePlaying = sc.next().toUpperCase();
			drawLine(70,"*");


		}

	}

	/*private static boolean continuePlaying(String choice){
		return (choice.equals("Y"));

	}*/

	private static void drawSign(String signMessage, String symbol) {
		drawLine(signMessage.length(), symbol);
		System.out.println(signMessage.toUpperCase());
		drawLine(signMessage.length(), symbol);
		System.out.println();
	}

	private static void drawLine(int longitud, String simbolo) {
		for (int i = 0; i < longitud; i++) {
			System.out.print(simbolo);

		}
		System.out.println();

	}

	private static void playGame(String[][] tablero) {
		int turnCounter = 0;
		int player = 1;
		while (!isWinner(tablero) && turnCounter < MAX_TURNS) { // Mientras no haya ganador o se llenen los casilleros

			player = turnCounter % 2;
			playTurn(player, tablero);
			System.out.println("Turno " + ( 1 + turnCounter)); // Imprimo contador en pantalla para verificar valores
			showBoard(tablero);
			turnCounter++; // Acumulador de turnos

		}
		if (turnCounter == MAX_TURNS) {
			drawLine(70,"-");
			System.out.println("Se terminaron los turnos, no hay ganador! =(");
			drawLine(70,"-");
		} else {
			drawSign("El jugador " + (player + 1) + " gana!", "*");
		}

		/*if (isWinner(tablero)) {
			drawSign("El jugador " + (player+1) + " gana!", "*");
		} else {
			if (turnCounter == MAX_TURNS) {
				drawLine(70,"-");
				System.out.println("Se terminaron los turnos, no hay ganador! =(");
				drawLine(70,"-");
			}
		}*/

	}

	private static void playTurn(int player, String[][] tablero) {
		System.out.println("Turno del Jugador " + (player+1));
		int row = askNextMove("Fila");
		int col = askNextMove("Columna");


		while (tablero[row-1][col-1].equals(" X ") || tablero[row-1][col-1].equals(" O ")) {
			System.out.println("Esa posición ya esta ocupada!");
			drawLine(70,"-");
			System.out.println("Por favor, ingresá otra.");
			row = askNextMove("Fila");
			col = askNextMove("Columna");

		}

		if (player == 0) {
			// juega el jugador 1  = X
			tablero[row-1][col-1] = " X ";

		} else { // juega el jugador 2 = O
			tablero[row-1][col-1] = " O ";
		}

	}

	private static int askNextMove(String type) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese " + type + " : ");
		int move = sc.nextInt();
		while(move<1 || move>3){
			System.out.println(type + " inválida!");
			System.out.print("Ingrese " + type + " : ");
			move = sc.nextInt();

		}
		return move;


	}

	private static boolean isWinner(String[][] tablero) {
		// filas
		boolean hor1 = (tablero[0][0].equals(tablero[0][1]) && tablero[0][0].equals(tablero[0][2]) && (tablero[0][0].equals(" X ") || tablero[0][0].equals(" O ")));
		boolean hor2 = (tablero[1][0].equals(tablero[1][1]) && tablero[1][0].equals(tablero[1][2]) && (tablero[1][0].equals(" X ") || tablero[1][0].equals(" O ")));
		boolean hor3 = (tablero[2][0].equals(tablero[2][1]) && tablero[2][0].equals(tablero[2][2]) && (tablero[2][0].equals(" X ") || tablero[2][0].equals(" O ")));
		// columnas
		boolean ver1 = (tablero[0][0].equals(tablero[1][0]) && tablero[0][0].equals(tablero[2][0]) && (tablero[0][0].equals(" X ") || tablero[0][0].equals(" O ")));
		boolean ver2 = (tablero[0][1].equals(tablero[1][1]) && tablero[0][1].equals(tablero[2][1]) && (tablero[0][1].equals(" X ") || tablero[0][1].equals(" O ")));
		boolean ver3 = (tablero[0][2].equals(tablero[1][2]) && tablero[0][2].equals(tablero[2][2]) && (tablero[0][2].equals(" X ") || tablero[0][2].equals(" O ")));
		// diagonales
		boolean dia1 = (tablero[0][0].equals(tablero[1][1]) && tablero[0][0].equals(tablero[2][2]) && (tablero[0][0].equals(" X ") || tablero[0][0].equals(" O ")));
		boolean dia2 = (tablero[0][2].equals(tablero[1][1]) && tablero[0][2].equals(tablero[2][0]) && (tablero[0][2].equals(" X ") || tablero[0][2].equals(" O ")));
		return (hor1 || hor2 || hor3 || ver1 || ver2 || ver3 || dia1 || dia2);
	}

	private static void startBoard(String[][] tablero) {
		for (int i = 0; i < tablero.length; i++) // filas
			// relleno de la matriz, todas las posiciones son iguales a " - "
			// columnas
			for (int j = 0; j < tablero.length; j++) tablero[i][j] = " - ";


		drawSign("A jugar!", ".");
		showBoard(tablero);
		System.out.println();

	}

	private static void showBoard(String[][] tablero) {
		for (String[] strings : tablero) { // Loop for each
			IntStream.range(0, tablero.length).forEach(j -> {
				System.out.print("|");
				System.out.print(strings[j]);
			});
			System.out.print("|");

			System.out.println();
			IntStream.range(0, tablero.length).mapToObj(j -> " ").forEach(System.out::print);
			System.out.println();
		}

	}

}
