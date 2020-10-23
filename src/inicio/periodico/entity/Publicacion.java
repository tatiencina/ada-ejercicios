package inicio.periodico.entity;

import java.util.Scanner;

public abstract class Publicacion {
// atributos
    //public static float precio;
    public static int tamano;
// método abstracto
    public abstract float calcularPrecio();
    // getters y setters
  /*  public static float getPrecio() {
        return precio;
    }

    public static void setPrecio(float precio) {
        Publicacion.precio = precio;
    }*/

    public static int getTamano() {
        return tamano;
    }

    public static void setTamano(int tamano) {
        Publicacion.tamano = tamano;
    }
// constructor de la clase abstracta
    public Publicacion(int tamano){

    }

    public static int solicitarTamano() {
        System.out.println("Ingrese tamano");
        Scanner sc = new Scanner(System.in);
        int tamano = sc.nextInt();
        return tamano;

    }
}
