package inicio.java;

import inicio.mediosdepago.entity.TarjetaDeCredito;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AppJava {
    public static void main(String[] args) throws ParseException {

        String numeroTurno = "123";
        System.out.println("Numero original = " + numeroTurno);
        // convertir el valor String a numerico

        Integer numeroTurnoInteger = Integer.parseInt(numeroTurno);
        numeroTurnoInteger ++;
        // Esta es la forma correta de hacerlo, sin cast.

        int numeroTurnoInt = numeroTurnoInteger.intValue();


        String siguienteNumero = String.valueOf(numeroTurnoInt);

        System.out.println("Siguiente numero = " + siguienteNumero);

        Object objeto = new Object();
        // equals compara contenido (valor) de los objetos
        System.out.println(numeroTurno.equals(siguienteNumero));

        // metodo hascode
        System.out.println(siguienteNumero.hashCode());
        // son numeros internos que usa java para cada uno de los objetos
        // los usa para identificarlos internamente

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(100, "ARS","012345");
        System.out.println("tarjeta = " + tarjeta);
        System.out.println(String.format("Tarjeta: %s NumeroTurno: %s", tarjeta.toString(), numeroTurno));


        Date ahora = new Date();
        System.out.println("Fecha = " + ahora);
        System.out.println("Fecha con milisesegundos = " + ahora.getTime());//hora en milisegundos

        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
        String ahoraFormateado = simpleDate.format(ahora);
        System.out.println("Fecha = " + ahoraFormateado);

        Date fechaPasada = simpleDate.parse("2019-10-20" );
        System.out.println("fechaPasada = " + fechaPasada);

        fechaPasada.after(ahora); // boolean que compara fechas

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 1);
        calendar.setTime(fechaPasada);
        calendar.add(calendar.DATE, -1);
        String calendarFormatted = simpleDate.format(calendar.getTime());
        System.out.println("calendarFormatted = " + calendarFormatted);

    }
}
