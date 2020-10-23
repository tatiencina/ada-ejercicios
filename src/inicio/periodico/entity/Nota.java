package inicio.periodico.entity;

import java.util.Scanner;

public class Nota extends Publicacion {

    private static final float PRECIO_BASE_NOTA = 80f;
    private static final float PORCENTAJE_RECARGO = 0.25f;
    public static String autor;
    public static int seccion;




    public Nota(int tamano) {
        super(tamano);
        this.tamano = tamano;
    }

    @Override
    public float calcularPrecio() {
        seccion = solicitarSeccion();
        float recargoSeccion = calcularRecargo(seccion);
        float precioFinal = (tamano*PRECIO_BASE_NOTA)*recargoSeccion;
        System.out.println("El precio final es " + precioFinal);
        return precioFinal;
    }

    private float calcularRecargo(int seccion) {
        float recargoSeccion;
        return recargoSeccion = seccion * PORCENTAJE_RECARGO;
    }

    private int solicitarSeccion() {
        System.out.println("Elija sección para su publcacion");
        System.out.println("1)Notas 2)Deportes 3)Espectaculos 4)Portada");
        Scanner sc = new Scanner(System.in);
        seccion = sc.nextInt();
        return seccion;
    }
}
