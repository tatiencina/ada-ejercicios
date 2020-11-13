package inicio.map.agenda;

/*
Registrar una agenda con actividades por día.
Las actividades se ingresan por teclado (título de la actividad + fecha)
Una fecha puede tener varias actividades
Al terminar el ingreso de actividades mostrar las actividades por fecha
 */

import java.util.*;

public class AppAgenda {

    private static final int SENTINEL = 0;

    public static void main(String[] args) {
        String fecha, actividad;
        Map<String, ArrayList<String>> agendaSemana = new TreeMap<String, ArrayList<String>>();

        Scanner scan = new Scanner(System.in);

        System.out.println("1- Ingresar actividades 2- Ver agenda 0- Salir");
        int accion = scan.nextInt();

        while (accion!=SENTINEL) {
            switch(accion){
                case 1: System.out.print("Ingrese día de la semana: ");
                    fecha = scan.next();
                    System.out.println("Ingrese actividad - 0 para terminar:");
                    actividad = scan.nextLine();
                    while  (!actividad.equals("0")) {
                        agendaSemana.put(fecha, new ArrayList<String>());
                        agendaSemana.get(fecha).add(actividad);
                        actividad = scan.nextLine();

                    }
                    System.out.println("1- Ingresar actividades 2- Ver agenda 0- Salir");
                    accion = scan.nextInt();
                    break;

                case 2: System.out.println(agendaSemana);
                    agendaSemana.forEach((k, v) -> System.out.println(k + ": " + v));
                    break;
            }
        }




    }
}
