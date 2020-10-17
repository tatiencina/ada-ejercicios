package inicio.Envio;

import java.util.Scanner;

public class AppEnvioNOTAS {
   /* public static void main(String[] args) {
        System.out.println("Sistema de Envíos");
        System.out.println();

        //Paquete paq2 = new Paquete(); // constructor por defecto
        //paq2.calcularPrecio();


// que pasa si tengo el constructor privado.
        // como genero objetos de esta clase

        Paquete paq1 = new Paquete(100, 1); // le paso los parámetros
        // este modo no es el mejor porque el constructor tiene muchos algoritmos adentro

        paq1.calcularPrecio();

        System.out.println(paq1.costoEnvioPaq);


       *//*float pesoPaq = 1;
        while (pesoPaq!=0){
            Paquete paq3 = new Paquete(solicitarPesoEnvio(), solicitudZona());
            if (paq3.isEnviable()){
                float precioTotal = paq3.calcularPrecio();
                System.out.println("El valor del envio es: $" + precioTotal);
            } else {
                System.out.println("Excede peso maximo. Transaccion cancelada.");
            }*//*

        // pesoPaq = solicitarPesoEnvio();


        //Paquete paq4 = Paquete.crear(); // no tengo un constructor público

    }*/


    private static float solicitarPesoEnvio() {
        System.out.println("Ingrese peso del paquete. Para salir ingrese 0. ");
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();

    }

    private static int solicitudZona() {
        System.out.println("Ingrese zona del envio");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


}
