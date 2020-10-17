package inicio.Envio;

import java.util.Scanner;

public class Carta extends Enviable{
    protected float costoEnvioCarta;

    private static final float PRECIO_BASE = 50.50f;
    int tipoEnvio;

    public Carta (int zonaEnvio, int tipoEnvio){
        super(zonaEnvio);
        this.tipoEnvio = tipoEnvio;

    }

    public Carta() {

    }


    public static int solicitudTipoEnvio() {
        System.out.println("Seleccione tipo de envio");
        System.out.println("1) Standard 2) Certificada 3) Express");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private void  calcularCosto(int zonaEnvio, int tipoEnvio) {

        switch (tipoEnvio) {

            case 1:
                costoEnvioCarta = PRECIO_BASE * COSTO_1;
                break;

            case 2:
                costoEnvioCarta = PRECIO_BASE * COSTO_2;
                break;

            case 3:
                costoEnvioCarta = PRECIO_BASE * COSTO_3;

                break;

            default:
                System.out.println("Tipo invalido");
                break;

        }

    }

    /*public static void enviarCarta() {
        int zonaEnvio = Carta.solicitudZona();
        int tipoEnvio = Carta.solicitudTipoEnvio();
        Carta newCarta = new Carta(zonaEnvio,tipoEnvio);
        newCarta.costoEnvioCarta = Carta.calcularCosto(zonaEnvio, tipoEnvio);
        System.out.println("El costo del envio es: $" + newCarta.costoEnvioCarta);
    }*/

    @Override
    public void enviar() {
        int zonaEnvio = Carta.solicitudZona();
        int tipoEnvio = Carta.solicitudTipoEnvio();
        calcularCosto(zonaEnvio, tipoEnvio);
        System.out.println("El costo del envio es: $" + costoEnvioCarta);
    }
}
