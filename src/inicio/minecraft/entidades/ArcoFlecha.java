package inicio.minecraft.entidades;

public class ArcoFlecha extends Arma implements Recargable, Ejecutable {
    private int capacidadRecarga = 10;
    @Override
    public int recargar() {
        int municiones = 10;
        System.out.println("Flechas disponibles = " + municiones);
        return municiones;
    }

    @Override
    public int disparar(int numTiros, int municiones) {
       int tiros = 0;
        while (tiros < numTiros){
            municiones --;
            tiros ++;

        }
        System.out.println("Flechazos = " + tiros);
        System.out.println("Flechas disponibles = " + municiones);
        return capacidadRecarga - tiros;

    }

    @Override
    public void ejecutar(String objetivo) {
        System.out.println("Ejecutando <Arco y Flecha> en : " + objetivo);
        System.out.println("Pobre " + objetivo);

    }
}
