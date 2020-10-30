package inicio.geometria.entidades;

public class Triangulo extends Figuras{
    @Override
    public void obtenerPerimetro(int dist) {
        int perimetro = 3*dist;
        System.out.println("perimetro del triángulo = " + perimetro);

    }
}
