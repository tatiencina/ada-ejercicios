package inicio.minecraft.entidades;

public class Revolver extends Arma implements Recargable, Ejecutable {
    private int capacidadRecarga = 6;
    @Override
    public int disparar(int numTiros, int municiones) {
        int tiros =0;
        while (tiros < numTiros){
            municiones --;
            tiros ++;

        }
        System.out.println("Disparos = " + tiros);
        System.out.println("Balas disponibles = " + municiones);
        return capacidadRecarga - tiros;
    }

    @Override
    public void ejecutar(String objetivo) {
        System.out.println("Ejecutando <Revolver> en : " + objetivo);
        System.out.println("Pobre " + objetivo);


    }
}
