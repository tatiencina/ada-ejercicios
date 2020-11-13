package inicio.ajedrez;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppAjedrez {
    public static void main(String[] args) {

        Map<Ficha, ArrayList<Posicion>> listaMovimientos = new HashMap<Ficha, ArrayList<Posicion>>();
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese color de la ficha (Escriba salir para terminar)");
        String color = scan.next().toLowerCase();
        while(!color.equals("salir")){
            System.out.print("Ingrese nombre de la ficha: ");
            String nombre = scan.next();
            System.out.print("Ingrese numero de ficha: ");
            int num = scan.nextInt();
            Ficha nuevaFicha = new Ficha(color, nombre, num);

            listaMovimientos.put(nuevaFicha, new ArrayList<Posicion>());
            System.out.print("Ingrese eje x (99 para salir): ");
            int x = scan.nextInt();
            while (x != 99) {
                System.out.print("Ingrese eje y: ");
                int y = scan.nextInt();
                Posicion nuevaPosicion = new Posicion(x, y);
                listaMovimientos.get(nuevaFicha).add(nuevaPosicion);
                System.out.print("Ingrese eje x: ");
                x = scan.nextInt();
            }
            System.out.print("Ingrese color de la ficha (Escriba salir para terminar): ");
            color = scan.next();
        }

        System.out.println(listaMovimientos);


    }
}

