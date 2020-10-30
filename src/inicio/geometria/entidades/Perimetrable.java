package inicio.geometria.entidades;

public interface Perimetrable {

    default void obtenerPerimetro(int dist) {
        int perimetro = 4 * dist;
        System.out.println("perimetro del cuadrado = " + perimetro);
    }
}


