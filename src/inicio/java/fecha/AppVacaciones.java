package inicio.java.fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
Cargar fecha de inicio de vacaciones de 5 empleados
Informar cuál de ellos se irá primero

Ingreso de fechas, las guardo en un array, comparo
 */
public class AppVacaciones {

    private static final int CANT_EMPLEADOS=5;
    protected static  Date[] fechaVacaciones = new Date[CANT_EMPLEADOS];

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        iniciarSistema();
        ingresarFechas(sc);

    }

    private static void ingresarFechas(Scanner sc) throws ParseException {
        System.out.println("Ingrese las fechas de inicio de vacaciones");
        SimpleDateFormat fechaVacacionesDate = new SimpleDateFormat("ddMMyyyy");
        for (int i = 0; i < fechaVacaciones.length; i++) {
            System.out.println("Inicio vacaciones empleado " + (i+1));
            String fechaVacacionesString = sc.next();

            fechaVacaciones[i] = fechaVacacionesDate.parse(fechaVacacionesString);

        }
        for (int i = 0; i < fechaVacaciones.length; i++) {
            System.out.println("Vacaciones empleado " + (i+1) + (": ")+ fechaVacaciones[i]);
        }
        int pos = compararFechas(fechaVacaciones);
        System.out.println("El primero en salir de vacaciones es = " + (pos+1));
    }

    private static int compararFechas(Date[] fechaVacaciones) {
        Date min = null;
        int pos =0;
        for (int i = 0; i < fechaVacaciones.length; i++) {
            if(min==null || min.after(fechaVacaciones[i])){
                min = fechaVacaciones[i];
                pos = i;
            }

        }
        return pos;

    }

    private static void iniciarSistema() {
        for (int i = 0; i < fechaVacaciones.length; i++) {
            fechaVacaciones[i] = new Date(); // inicializo con objetos vacíos

        }
    }
    private boolean esMayorEdad(Date fechaNacimiento){
        Calendar hoy = Calendar.getInstance();
        hoy.add(Calendar.YEAR, -18);
        return fechaNacimiento.before(hoy.getTime());

    }

}
