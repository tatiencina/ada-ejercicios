package inicio.minecraft.entidades;

public interface Recargable {

    default int recargar (){
        int municiones = 6;
        System.out.println("Balas disponibles = " + municiones);
        return municiones;
    }

    int disparar (int numTiros, int municiones);

}
