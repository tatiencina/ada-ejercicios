package inicio.Teatro;

import java.util.Scanner;

/*
//Se venden boletos de una funcion numerados del 0-49. Cada uno de esos boletos
//se corresponde con una butaca que tiene fila y columna
//Solicitar que asiento elige la persona al  comprarlo y marcarlo de alguna manera
//hasta que se ingrese valor de fila 0
//Listar los asientos vendidos
 */
public class AppTeatro {
    private static final int CANT_BUTACAS = 50;
    private static final int SENTINEL = 99;

    public static void main(String[] args) {
        // vector de butacas de 0 a 49 con un objeto butaca en cada posición.
        // Almacena objetos del tipo butaca.

        Butaca[] butacas = new Butaca[CANT_BUTACAS];

        for (int i = 0; i < CANT_BUTACAS; i++) {
            butacas[i] = new Butaca(); // inicializo con objetos vacíos

        }
        System.out.println("Venta de butacas");

        //int posicion = solicitarPosicion("asiento");
        int col;
        int fila;
       /* while (posicion != SENTINEL) {
            fila = solicitarPosicion("fila");
            col = solicitarPosicion("columna");
            Butaca butaca = new Butaca();
            butaca.setNumero(posicion);
            if (butacas[posicion].isOcupado()) {
                System.out.println("Asiento no disponible");
            } else {
                butaca.setOcupado(true);
                butacas[posicion] = butaca;
                System.out.println("Venta confirmada");
            }

            butaca.setFila(fila);
            butaca.setCol(col);
            posicion = solicitarPosicion("fila");
        }
        for (Butaca butaca : butacas) {
            if (butaca.isOcupado()) {
                System.out.println("Butaca ocupada " + butaca.getNumero());
            }
        }*/

        int posicion = 0;
        while (posicion != SENTINEL) {
            Butaca but = Butaca.crear(solicitarPosicion("asiento"));
            fila = solicitarPosicion("fila");
            col = solicitarPosicion("columna");

            if (butacas[posicion].isOcupado()) {
                System.out.println("Asiento no disponible");
            } else {
                but.setOcupado(true);
                butacas[posicion] = but;
                System.out.println("Venta confirmada");
            }

            but.setFila(fila);
            but.setCol(col);
            posicion = solicitarPosicion("asiento");
        }

    }

    private static int solicitarPosicion(String x) {
        System.out.println("Ingrese número de " + x);
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();

    }
}
