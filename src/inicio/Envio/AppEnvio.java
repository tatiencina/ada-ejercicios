package inicio.Envio;

import libreriaMetodos.Sign;

import java.util.Scanner;


public class AppEnvio {
    public static void main(String[] args) {
        inciarSistema();
        int seleccionMenu =  mostrarMenu();
        calcularEnvio(seleccionMenu);
        
    }

    private static void calcularEnvio(int seleccionMenu) {
        Enviable enviable;
        while (seleccionMenu != 3) {
            switch (seleccionMenu) {
                case 1:
                    enviable = new Paquete();
                    //Paquete.enviarPaquete();
                    break;
                case 2:
                    enviable = new Carta();
                    //Carta.enviarCarta();
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + seleccionMenu);
            }
            enviable.enviar();
            Sign.drawLine(70," ");
            seleccionMenu = mostrarMenu();
        }
        Sign.drawSign("Hasta la proxima!", "*");
    }


    private static int mostrarMenu() {
        Sign.drawSign("Seleccione operacion a realizar", ".");
        System.out.println("1) Enviar Paquete 2) Enviar Carta 3) Salir");
        Scanner sc = new Scanner(System.in);
        int seleccionMenu = sc.nextInt();
        return seleccionMenu;
    }

    private static void inciarSistema() {
        Sign.drawSign("Sistema de envios", "*");
    }
}
