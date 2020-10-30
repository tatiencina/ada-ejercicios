package inicio.minecraft.entidades;

public class Cuchillo extends Arma implements Ejecutable {


    @Override
    public void ejecutar(String objetivo) {
        System.out.println("Ejecutando <Cuchillo> en : " + objetivo);
        System.out.println("Pobre " + objetivo);

    }
}
