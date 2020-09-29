package ejercicios;

import java.util.Scanner;

/*
 * Un tablero de 3 x 3 matriz [fila] [columna]
 * Jugador uno: ingrese fila, ingrese columna por input
 * Una vez que tengo las coordenadas muestro el tablero X o O 
 * Verificar si la posici�n est� libre y verificar si gan�
 * Mientras nadie gane, juega el siguiente 
 */

public class Ejercicio999TaTeTi {
	private static final int ROWS = 3;
	private static final int COLS = 3;
	private static final int MAX_TURNS=9;

	public static void main(String[] args) {
		String[][] tablero = new String[ROWS][COLS];
		drawSign("TATETI","=");
		StartGame(tablero);



	}

	private static void StartGame(String[][]tablero) {
		String choice = "Y";
		while (continuePlaying(choice)) {
			startBoard(tablero);
			playGame(tablero);
			drawLine(70,"*");
			System.out.println("Seguimos jugando?");
			System.out.print("Sí (Y) - No (N) --> ");
			Scanner sc = new Scanner(System.in);
			choice = sc.next().toUpperCase();
			drawLine(70,"*");

			while(!choice.equals("N") && !choice.equals("Y")){
				System.out.print("Sí (Y) - No (N) --> " );
				choice = sc.next().toUpperCase();
				drawLine(70,"*");


			}
			if (choice.equals("N")) break;

		}
		drawSign("Hasta la próxima!", "=");

	}

	private static boolean continuePlaying(String choice){
		return (choice.equals("Y"));

	}

	private static void drawSign(String mensajeBienvenida, String symbol) {
		drawLine(mensajeBienvenida.length(), symbol);
		System.out.println(mensajeBienvenida.toUpperCase());
		drawLine(mensajeBienvenida.length(), symbol);
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
			System.out.println("Turno " + (turnCounter+1)); // Imprimo contador en pantalla para verificar valores
			showBoard(tablero);
			turnCounter++; // Acumulador de turnos

		}
		if (isWinner(tablero)) {
			drawSign("El jugador " + (player+1) + " gana!", "*");
		} else {
			if (turnCounter == MAX_TURNS) {
				drawLine(70,"-");
				System.out.println("Se terminaron los turnos, no hay ganador! =(");
				drawLine(70,"-");
			}
		}

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

	private static boolean isWinner(String tablero[][]) {

		boolean hor1 = (tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2] && (tablero[0][0] == " X " || tablero[0][0] == " O "));
		boolean hor2 = (tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2] && (tablero[1][0] == " X " || tablero[1][0] == " O "));
		boolean hor3 = (tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2] && (tablero[2][0] == " X " || tablero[2][0] == " O "));
		boolean ver1 = (tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0] && (tablero[0][0] == " X " || tablero[0][0] == " O "));
		boolean ver2 = (tablero[0][1] == tablero[1][1] && tablero[0][1] == tablero[2][1] && (tablero[0][1] == " X " || tablero[0][1] == " O "));
		boolean ver3 = (tablero[0][2] == tablero[1][2] && tablero[0][2] == tablero[2][2] && (tablero[0][2] == " X " || tablero[0][2] == " O "));
		boolean dia1 = (tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2] && (tablero[0][0] == " X " || tablero[0][0] == " O "));
		boolean dia2 = (tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0] && (tablero[0][2] == " X " || tablero[0][2] == " O "));
		return (hor1 || hor2 || hor3 || ver1 || ver2 || ver3 || dia1 || dia2);
	}

	private static void startBoard(String[][] tablero) {
		for (int i = 0; i < tablero.length; i++) { // filas
			// relleno de la matriz, todas las posiciones son iguales a " - "
			for (int j = 0; j < tablero.length; j++) { // columnas
				tablero[i][j] = " - ";

			}

		}
		drawSign("A jugar!", ".");
		showBoard(tablero);
		System.out.println();

	}

	private static void showBoard(String[][] tablero) {
		for (String[] strings : tablero) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(strings[j]);
			}
			System.out.println();
		}

	}

}
