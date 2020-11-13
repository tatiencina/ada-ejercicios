package inicio.generics;

import inicio.mediosdepago.entity.TarjetaDeCredito;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AppBolsaGenerics {
    public static void main(String[] args) {
        /*Bolsa<String> bolsa = new Bolsa<String>(2);
        Bolsa<Integer> bolsaInt = new Bolsa<Integer>(2);

        bolsa.add("palabra");
        bolsaInt.add(new Integer(23));*/

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(213,"ARS","000123");
        Map<TarjetaDeCredito, String> tarjetas = new HashMap<TarjetaDeCredito, String>();
        tarjetas.put(tarjeta, "Dueño1");

        Map<String, String> capitales = new HashMap<String, String>();
        capitales.put("Argentina", "Buenos Aires");
        capitales.put("Chile", "Santiago de Chile");
        capitales.put("Bolivia", "La Paz");

        System.out.println(capitales.get("Chile"));
        System.out.println(capitales.get("Uruguay"));

        Set<String> claves = capitales.keySet();
        Iterator<String> iterador = claves.iterator();
        String clave, valor;
        while(iterador.hasNext()){
            clave = iterador.next();
            valor = capitales.get(clave);
            System.out.println(clave + ": " + valor);
            
        }

        Map <Integer, TarjetaDeCredito> mapaTarjetas = new HashMap<Integer, TarjetaDeCredito>();
        TarjetaDeCredito tarjetaX = new TarjetaDeCredito (3000, "ARS", "000001");
        TarjetaDeCredito tarjetaY = new TarjetaDeCredito (4000, "ARS", "000002");
        TarjetaDeCredito tarjetaZ = new TarjetaDeCredito (5000, "ARS", "000003");
        mapaTarjetas.put(22222, tarjetaX);
        mapaTarjetas.put(33333, tarjetaY);
        mapaTarjetas.put(44444, tarjetaZ);

        System.out.println(mapaTarjetas.get(55555));
        System.out.println(mapaTarjetas.get(22222));


    }
}
