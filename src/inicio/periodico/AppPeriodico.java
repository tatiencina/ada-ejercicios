package inicio.periodico;

// Existen publicaciones que pueden ser notas (escritas o video), publicidad
// El portal puede tener 10 publicaciones online.
// Las publicaciones se cobran en función del tamaño que ocupan
// La nota tiene autor, seccion, etc.
// Descubrir las clases y atributos que necesitamos para moldear nuestro sistema.
// Conocer el total facturado en la publicación del portal.


import inicio.periodico.entity.Nota;
import inicio.periodico.entity.Publicacion;
import inicio.periodico.entity.Publicidad;
import libreriaMetodos.Sign;

import java.util.Scanner;

public class AppPeriodico {
    private static final int MAX_PUBLICACIONES = 2;

    public static void main(String[] args) {
        int seleccionMenu = mostrarMenu();
        caclularPrecioPublicacion(seleccionMenu);

    }

    private static int mostrarMenu() {
        Sign.drawSign("Seleccione tipo de nota a ingresar", ".");
        System.out.println("1) Publicidad 2) Nota 3)Salir ");
        Scanner sc = new Scanner(System.in);
        int seleccionMenu = sc.nextInt();
        return seleccionMenu;

    }

    private static void caclularPrecioPublicacion(int seleccionMenu) {
        Publicacion publicacion = null;
        int tamano;
        int totalPublicaciones = 0;
        float totalRecaudado = 0;

        while (totalPublicaciones < MAX_PUBLICACIONES && seleccionMenu != 3) {
           // while (seleccionMenu != 3 ) {
                tamano = Publicacion.solicitarTamano();
                switch (seleccionMenu) {
                    case 1:
                        String marca = Publicidad.ingresarAnunciante();
                        publicacion = new Publicidad(tamano,marca);
                        break;
                    case 2:
                        publicacion = new Nota(tamano);
                        //Carta.enviarCarta();
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + seleccionMenu);

                }
                totalRecaudado += publicacion.calcularPrecio();
                System.out.println();
                totalPublicaciones ++;
                System.out.println("El total de publicaciones es: " + totalPublicaciones);
                Sign.drawLine(70, " ");
                // if
                seleccionMenu = mostrarMenu();
           // }
        }
        System.out.println("El total recaudado es: $" + totalRecaudado);
        Sign.drawSign("Hasta la proxima!", "*");


    }


}
