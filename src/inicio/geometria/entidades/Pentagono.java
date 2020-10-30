package inicio.geometria.entidades;

public class Pentagono extends Figuras implements Perimetrable{
    @Override
    public void obtenerPerimetro(int dist) {
        int perimetro = 5*dist;
        System.out.println("perimetro del pentagono = " + perimetro);

    }
}
