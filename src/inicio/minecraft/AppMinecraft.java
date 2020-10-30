package inicio.minecraft;
/*
 //tenemos diferentes armas(cuchillo, revolver, arco y flecha)
//tenemos interfaz recargable con dos metodos: recargar int cantidad, y disparar
//implementar en las clases
 */

import inicio.minecraft.entidades.ArcoFlecha;
import inicio.minecraft.entidades.Cuchillo;
import inicio.minecraft.entidades.Revolver;
import libreriaMetodos.Sign;

import java.util.Scanner;

public class AppMinecraft {
    public static void main(String[] args) {
        int seleccionMenu = mostrarMenu();
        equiparArma(seleccionMenu);

    }

    private static void equiparArma(int seleccionMenu) {
        while (seleccionMenu!=4) {
            int numTiros, municiones;
            String objetivo;
            switch (seleccionMenu) {
                case 1:
                    Cuchillo pepito = new Cuchillo();
                    objetivo = pedirObjetivo();
                    pepito.ejecutar(objetivo);
                    System.out.println("ZAS! En toda la cara");
                    break;
                case 2:
                    Revolver revolver = new Revolver();
                    municiones = revolver.recargar();
                    numTiros = ingresarTiros("balas");
                    revolver.disparar(numTiros, municiones);
                    objetivo = pedirObjetivo();
                    revolver.ejecutar(objetivo);

                    break;
                case 3:
                    ArcoFlecha arcoyflecha = new ArcoFlecha();
                    municiones = arcoyflecha.recargar();
                    numTiros = ingresarTiros("flechas");
                    arcoyflecha.disparar(numTiros, municiones);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + seleccionMenu);

            }
            seleccionMenu = mostrarMenu();
        }
        Sign.drawSign("Hasta la proxima!", "*");
    }

    private static String pedirObjetivo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cual es tu objetivo??");
        return scan.nextLine();

    }

    private static int ingresarTiros(String municion) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuantas " + municion + " quiere tirar?");
        return scan.nextInt();
    }

    private static int mostrarMenu() {
        Sign.drawSign("Seleccione arma", ".");
        System.out.println("1)Cuchillo 2)Revolver 3)Arco y Flecha 4)Salir ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
}



