package inicio.geometria.entidades;

public class Circulo extends Figuras {

    @Override
    public void obtenerPerimetro(int dist) {
        double perimetro = (2 * Math.round(Math.PI) * dist);
        System.out.println("perimetro del círculo = " + perimetro);

    }
}
