package inicio.mediosdepago;

// Se desea registrar los pagos realizados por los clientes
// Se reciben pagos en efectivo, cheque o tarjeta de credito
// Se desea conocer el total pagado por los diferentes medios
// Se ingresan los pagos hasta el ingreso de importe 0.

import inicio.mediosdepago.entity.Cheque;
import inicio.mediosdepago.entity.Efectivo;
import inicio.mediosdepago.entity.MedioDePago;
import inicio.mediosdepago.entity.TarjetaDeCredito;
import libreriaMetodos.Sign;

import java.util.Scanner;

public class AppMediosDePago {
    private static final float SENTINEL = 0;

    public static void main(String[] args) {
        iniciarSistema();
        ingresarPagos();
        mostrarImportes();
    }

    private static void mostrarImportes() {
    }

    private static void ingresarPagos() {
        MedioDePago newMedioDePago;

        float importe = solicitarImporte();


        while (importe!=SENTINEL){
            int medio = seleccionarMediodePago();
            String moneda = solicitarString("Moneda");
            switch (medio){
                case 1:
                    Efectivo efectivo = new Efectivo(importe,moneda);
                    break;
                case 2:
                    String numero = solicitarString("Numero de tarjeta");
                    TarjetaDeCredito tarjeta = new TarjetaDeCredito(importe, moneda, numero);
                    break;
                case 3:
                    numero = solicitarString ("Numero de cheque");
                    Cheque cheque = new Cheque(importe, moneda, numero);
                    // instace of
                    if (cheque instanceof MedioDePago){

                    }
                    break;
            }
            importe = solicitarImporte();
        }
    }

    private static String solicitarString(String mensaje) {
        System.out.println("Ingrese" + mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }



    private static float solicitarImporte() {
        System.out.println("Ingrese importe");
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();

    }

    private static int seleccionarMediodePago() {
        System.out.println("Ingrese medio de pago");
        System.out.print("1 - Tarjeta de credito 2 - Efectivo 3 - Cheque");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();


    }

    private static void iniciarSistema() {
        Sign.drawSign("Welcome","*");
        Sign.drawSign("App Medios de Pago", "-");
        System.out.println();
    }


}
