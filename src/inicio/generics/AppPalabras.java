package inicio.generics;

/*
Seleccionar un párrafo.
Método split de Strin separa un string en un array de string dado un caracter.
Guardamos en una variable el texto seleccionado y lo separamos mediante el metodo split
Generar un mapa que contenga la palabra  y la cantidad de veces que se repitió esa
palabra en el texto.
Obtener la palabra de mayor repetición
Mapa:
la clave es la palabra
el valor es la cantidad

 */

import java.util.Map;
import java.util.TreeMap;

public class AppPalabras {
    public static void main(String[] args) {
        String parrafo = "Gay pride or LGBT pride is the promotion of the self-affirmation, dignity, equality, and increased visibility of lesbian, gay, bisexual, and transgender (LGBT) people as a social group. Pride, as opposed to shame and social stigma, is the predominant outlook that bolsters most LGBT rights movements. Pride has lent its name to LGBT-themed organizations, institutes, foundations, book titles, periodicals, a cable TV station, and the Pride Library.";
        /*parrafo = parrafo.replaceAll(","," ");
        parrafo = parrafo.replaceAll(":"," ");
        parrafo = parrafo.replaceAll(";"," ");
        parrafo = parrafo.replaceAll("-"," ");*/

        parrafo = parrafo.toLowerCase();
        String[] arrOfStr = parrafo.split("\\s+|(?=[,.])");

     /*   for (String a : arrOfStr)
            System.out.println(a);*/


        Map<String, Integer> palabrasMapa = new TreeMap<String, Integer>();


        for (String word : arrOfStr)
            if (palabrasMapa.containsKey(word)) {
                int value = palabrasMapa.get(word);
                palabrasMapa.put(word, ++value);

            } else {
                palabrasMapa.put(word, 1);
            }

          System.out.println("palabrasMapa = " + palabrasMapa);

        palabrasMapa.forEach((cualquier, cosa) -> System.out.println(cualquier + "-" + cosa));
                //.keySet().forEach(e -> System.out.println(e) );
    }




}
