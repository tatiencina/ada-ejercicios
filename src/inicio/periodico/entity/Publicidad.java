package inicio.periodico.entity;

public class Publicidad extends Publicacion{

    public static String marca;
    public static final float PRECIO_BASE_PUB = 15.0f;

    public Publicidad(int tamano) {
        super(tamano);
        this.tamano = tamano;
    }


    @Override // sobreescribir
    public void calcularPrecio() {
        float precioFinal = tamano*PRECIO_BASE_PUB;
        System.out.println("El precio final es " + precioFinal);


    }
}
