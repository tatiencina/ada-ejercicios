package inicio.collection.clima;

import inicio.collection.clima.entities.Medicion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppClima {
    public static void main(String[] args) {
        Random randomSol = new Random();
        Random randomLluvia = new Random();

        List<Medicion> mediciones = new ArrayList<Medicion>();

        Medicion medicion;
        for (int i = 0; i < 360; i++) {
            int lluvia = randomLluvia.nextInt(10);
            int temperatura = randomSol.nextInt(30);
            medicion = new Medicion(temperatura, lluvia);
            mediciones.add(medicion);

        }
        for(Medicion itemMedicion: mediciones) {
            System.out.println(itemMedicion);
        }

    }
}
