package inicio.Envio;

import java.util.Scanner;

public class Paquete extends Enviable {

    private static final int PESO_MAX = 5000;
    protected float costoEnvioPaq = 0;

    /*
    Atributos: Peso y zona de envío
    Precio del envío = peso del paquete * precio de la zona
     */

    private float pesoPaq;

    public Paquete() {

    }

    private void calcularCosto(float pesoPaq, int zonaEnvio) {
        //float costoEnvioPaq = 0;
        
        switch (zonaEnvio) {
            
            case 1:
                costoEnvioPaq = pesoPaq * COSTO_1;
                break;

            case 2:
                costoEnvioPaq = pesoPaq * COSTO_2;
                break;

            case 3:
                costoEnvioPaq = pesoPaq * COSTO_3;

                break;
            case 4:
                costoEnvioPaq = pesoPaq * COSTO_4;
                break;

            case 5:
                costoEnvioPaq = pesoPaq * COSTO_5;
                break;

            default:
                System.out.println("Zona inválida");
                break;

        }

        //return costoEnvioPaq;

    }

    /*public static void enviarPaquete() {
        float pesoPaq = Paquete.solicitarPesoEnvio();
        int zonaEnvio = Paquete.solicitudZona();
        Paquete newPaq = new Paquete(pesoPaq,zonaEnvio);
        newPaq.costoEnvioPaq = Paquete.calcularCosto(pesoPaq, zonaEnvio);
        System.out.println("El costo del envio es: $" + newPaq.costoEnvioPaq);
    }*/

    /*public static Paquete crear() { // los metodos estáticos son métodos de clase
        Paquete paq = new Paquete();
        System.out.println("Paquete creado con éxito");
        return paq;
        // se usa por ejemplo, para contar la cantidad de objetos creados
    }*/



    public float getPeso() {
        return pesoPaq;
    }

    public void setPeso(float pesoPaq) {
        if (pesoPaq > PESO_MAX) {
            enviable = false;
        } else {
            enviable = true;
        }
        this.pesoPaq = pesoPaq;
    }



    /*public float calcularPrecio() {


        switch (zonaEnvio) {

            case 1:
                costoEnvio = pesoPaq * COSTO_1;
                break;

            case 2:
                costoEnvio = pesoPaq * COSTO_2;
                break;

            case 3:
                costoEnvio = pesoPaq * COSTO_3;

                break;
            case 4:
                costoEnvio = pesoPaq * COSTO_4;
                break;

            case 5:
                costoEnvio = pesoPaq * COSTO_5;
                break;

            default:
                System.out.println("Zona inválida");
                break;

        }

        return costoEnvio;

    }
*/
  /*  public Paquete(float peso, int zona) {
        super(zona);
        pesoPaq = peso;
        enviable = pesoPaq < PESO_MAX;

    }*/

/*    public Paquete() {
        float pesoEnvio = solicitarPesoEnvio();
        while (pesoEnvio != 0) {
            this.setPeso(pesoEnvio);
            if (this.isEnviable()) {
                int zona = solicitudZona();
                this.setZona(zona);
                float precioTotal = this.calcularPrecio();
                System.out.println("El valor del envio es: $" + precioTotal);

                pesoEnvio = solicitarPesoEnvio();
            } else {
                System.out.println("Excede peso maximo. Transacción cancelada.");
                pesoEnvio = solicitarPesoEnvio();
            }


        }
    }*/
    static float solicitarPesoEnvio() {
        System.out.println("Ingrese peso del paquete");
        Scanner sc = new Scanner(System.in);
        float pesoPaq = sc.nextFloat();
        boolean esEnviable = pesoPaq <= PESO_MAX;
        while(!esEnviable){
            System.out.println("Excede peso maximo");
            System.out.println("Ingrese peso del paquete");

            pesoPaq = sc.nextFloat();
            esEnviable = sc.nextFloat() <= PESO_MAX;

        }
        return pesoPaq;
    }

    @Override
    public void enviar() {
        float pesoPaq = Paquete.solicitarPesoEnvio();
        validarPeso(pesoPaq);
        int zonaEnvio = Paquete.solicitudZona();
        calcularCosto(pesoPaq, zonaEnvio);
        System.out.println("El costo del envio es: $" + costoEnvioPaq);
    }

    private void validarPeso(float pesoPaq) {
    }

    /*static int solicitudZona() {
        System.out.println("Ingrese zona del envío");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }*/
}


