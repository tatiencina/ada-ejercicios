package inicio.geometria;

// Se cuenta con figuras geometricas: circulo, triangulo, cuadrado, pentagono y se
// desea saber el perimetro de cada una. Se supone que los lados de las figuras son iguales
// mismo tama�o.
// Implementar la interface Perimetrable y aplicar el metodo default en caso de ser posible
// Generar una instancia de cada clase e invocar el metodo obtenerPerimetro()

import inicio.geometria.entidades.*;
import libreriaMetodos.Sign;

import java.util.Scanner;

public class AppGeometria {

    public static void main(String[] args) {

       int seleccionMenu =  mostrarMenu();
       calcularPerimetros(seleccionMenu);

       // Uso de interfaces

        /*Circulo circulo = new Circulo();
        circulo.obtenerPerimetro(4);

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.obtenerPerimetro(5);

        Triangulo triangulo = new Triangulo();
        triangulo.obtenerPerimetro(3);

        Pentagono pentagono = new Pentagono();
        pentagono.obtenerPerimetro(10);*/




    }
// uso de clase abstracta
    private static void calcularPerimetros(int seleccionMenu) {
        Figuras figura = null;

        int dist;
        while (seleccionMenu!=0) {
            switch (seleccionMenu) {
                case 1:
                    figura = new Cuadrado();
                    dist = ingresarLado();
                    break;
                case 2:
                    figura = new Triangulo();
                    dist = ingresarLado();
                    break;
                case 3:
                    figura = new Circulo();
                    dist = ingresarLado();
                    break;
                case 4:
                    figura = new Pentagono();
                    dist = ingresarLado();

                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + seleccionMenu);

            }
            figura.obtenerPerimetro(dist);
            seleccionMenu = mostrarMenu();
        }
        Sign.drawSign("Hasta la proxima!", "*");
    }

    private static int ingresarLado() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese largo del lado");
        return scan.nextInt();

    }

    private static int mostrarMenu() {
        Sign.drawSign("Seleccione el tipo de figura", ".");
        System.out.println("1)Cuadraro 2)Triangulo 3)Circulo 4)Pentagono ");
        System.out.println("Para salir ingrese 0");
        Scanner sc = new Scanner(System.in);
        int seleccionMenu = sc.nextInt();
        return seleccionMenu;


    }
}
