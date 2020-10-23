package inicio.periodico.entity;

import java.util.Scanner;

public class Publicidad extends Publicacion{
    public static final float PRECIO_BASE_PUB = 15.0f;
    protected  String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    public Publicidad(int tamano, String marca) {
        super(tamano);
        this.marca = marca;
    }

    public static String ingresarAnunciante(){
        System.out.println("Indique el anunciante");
        Scanner sc = new Scanner(System.in);
        return sc.next();

    }



    @Override // sobreescribir
    public float calcularPrecio() {
        float precioFinal = tamano*PRECIO_BASE_PUB;
        System.out.println("El precio final es " + precioFinal);
        return precioFinal;


    }


}
