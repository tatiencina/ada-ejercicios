package inicio.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AppCollection {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        lista.add("Daiana");
        lista.add("Sofia");
        System.out.println("Ingrese nombre del alumne");
        String toAdd = scan.next();
        lista.add(toAdd);
        System.out.println("Listado de alumnos = " + lista);
        System.out.println(lista.size());
        System.out.println("Remover alumne = " + lista.get(1));
        System.out.println("Comienzo bucle...");
        for (int i = 0; i < lista.size(); i++) {
            String item = lista.get(i);
            System.out.println("Alumne " + (i+1) +" : " + item);
        }
        lista.remove(1);
        lista.remove("Daiana");
        System.out.println("Listado de alumnos = " + lista);

        System.out.println("Comienzo bucle for each...");
        for (String pos : lista
             ) {
            System.out.println("Alumne: "+ pos);
            
        }
        System.out.println("Comienzo bucle...");
        for (int i = 0; i < lista.size(); i++) {
            String item = lista.get(i);
            System.out.println("Alumne " + (i+1) +" : " + item);
        }

        System.out.println("function lambda (arrow function)...");
        lista.forEach(x -> {
            System.out.println(x);
        });

    }

    Set<String> conjunto = (Set<String>) new ArrayList<String>();
}
