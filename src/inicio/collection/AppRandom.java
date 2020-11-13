package inicio.collection;

import java.util.Random;

public class AppRandom {
    public static void main(String[] args) {
        Random randomNumbrer = new Random();
        for (int i = 0; i < 10; i++) {
            int number = randomNumbrer.nextInt(5);// num aleatorio entre 0 < 5
            System.out.println("Random Number = " + number);
        }
    }
}
