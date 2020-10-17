package inicio.Auto;
/*
Programar la clase auto que contenga:
5 velocidades. Para hacer un cambio debo tener la velocidad adecuada
0 Auto detenido
1-10 Cambio 1
11.20 Cambio 2
21-30 Cambio 3
31-40 Cambio 4
41 + Cambio 5

int numeroCambio
int velocidad

Programar getters y setter según sea necesario.
Métodos acelerar y frenar validando las velocidades.
Subir cambio y bajar cambio
 */

public class AppAuto {
    public static void main(String[] args) {
        if (args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }

            AutoEjemploClase a1 = new AutoEjemploClase();
            a1.subirCambio();
            a1.acelerar(9);
            a1.acelerar(40);
            a1.subirCambio();
            a1.acelerar(8);
            a1.bajarCambio();
            a1.frenar(8);
        }
    }
}
    /*public static void main(String[] args) {
    Auto auto1 = new Auto();
    auto1.setVelocidad(10);
    System.out.println("Velocidad actual:" + auto1.getVelocidad() + "kms/h");
    auto1.ingresarCambio(5);
    System.out.println("Velocidad actual:" + auto1.getVelocidad() + "kms/h");
    auto1.acelerar(10);
    System.out.println("Velocidad actual:" + auto1.getVelocidad() + "kms/h");
    auto1.frenar(5);
    System.out.println("Velocidad actual:" + auto1.getVelocidad() + "kms/h");
    auto1.ingresarCambio(2);
    System.out.println("Velocidad actual:" + auto1.getVelocidad() + "kms/h");

    }*/

