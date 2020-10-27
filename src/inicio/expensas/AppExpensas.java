package inicio.expensas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/*
El pago de expensas se realiza del 1 al 10 de cada mes
En caso de pagar luego se suma un recargo del 1% diario
Solicitar fecha de pago e importe
Calcular el total a pagar
 */

public class AppExpensas {

    /*
    si el día de pago es el día 25, debo caclular intereses del 10 al 25
    Serían 15 días y un recargo del 15%
     */
    public static void main(String[] args) throws ParseException {

        Date diaPago = ingresarFechaPago();

        float pago = ingresarPago();

        long diferencia = calcularDifDias(diaPago);

        calcularRecargo(diferencia,pago);



    }

    private static float ingresarPago() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el pago:");
        return scan.nextFloat();
    }

    private static Date ingresarFechaPago() throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        System.out.println("Ingrese fecha de pago ");
        return dateFormat.parse(scan.next());
    }

    private static void calcularRecargo(long diferencia, float pago) {
        System.out.println("Días de mora = " + diferencia);
        float interes = (diferencia*0.01f);
        System.out.println("Interés por mora = " + (interes*100) + "%");
        System.out.println("Recargo por mora = $" + (pago*interes));
        float pagoFinal = (pago * interes) + pago;
        System.out.println("Total a pagar = $" + pagoFinal);
    }

    private static long calcularDifDias(Date diaPago ) throws ParseException {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        Date diaCorteDate = dateFormat.parse("10102020");
        cal1.setTime((diaCorteDate));
        cal2.setTime(diaPago);

        return Duration.between(cal1.toInstant(), cal2.toInstant()).toDays();

     /*
        Duration es una clase con métodos estáticos
        between es el valor entre una fecha y otra
    */}

}
