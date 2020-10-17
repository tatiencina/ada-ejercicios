package inicio.Auto;

public class Auto {

    private static final int MIN_CAMBIO_1= 1;
    private static final int MIN_CAMBIO_2= 11;
    private static final int MIN_CAMBIO_3= 21;
    private static final int MIN_CAMBIO_4= 31;
    private static final int MIN_CAMBIO_5= 45;

    // crear array para los 5 minimos de velocidad;


    private double velocidad;

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    private int numCambio;

    public int getNumCambio() {
        return numCambio;
    }

    public void setNumCambio(int numCambio) {
        this.numCambio = numCambio;
    }

    public double acelerar (double aceleracion){
        velocidad += aceleracion;
        return velocidad;
    }

    public double frenar (double frenado){
        velocidad -= frenado;
        return velocidad;
    }

    public void ingresarCambio(int numCambio){

        switch(numCambio){
            case 1: if (velocidad>=MIN_CAMBIO_1 && velocidad<MIN_CAMBIO_2){
                numCambio = 1;
                System.out.println("Cambio ingresado: " + numCambio);
                } else {
                System.out.println("No se puede ingresar el cambio a la velocidad actual");
                 }
                 break;

            case 2: if (velocidad>=MIN_CAMBIO_2 && velocidad<MIN_CAMBIO_3){
                numCambio = 2;
                System.out.println("Cambio ingresado: " + numCambio);
                } else {
                System.out.println("No se puede ingresar el cambio a la velocidad actual");
                }
                break;

            case 3: if (velocidad>=MIN_CAMBIO_3 && velocidad<MIN_CAMBIO_4){
                numCambio = 3;
                System.out.println("Cambio ingresado: " + numCambio);
                 } else {
                System.out.println("No se puede ingresar el cambio a la velocidad actual");
                }
                break;

            case 4: if (velocidad>=MIN_CAMBIO_4 && velocidad<MIN_CAMBIO_5){
                numCambio = 4;
                System.out.println("Cambio ingresado: " + numCambio);
                } else {
                System.out.println("No se puede ingresar el cambio a la velocidad actual");
                }
                break;

            case 5: if (velocidad>=MIN_CAMBIO_5) {
                numCambio = 5;
                System.out.println("Cambio ingresado: " + numCambio);
                } else {
                System.out.println("No se puede ingresar el cambio a la velocidad actual");
                }
                break;

        }

    }

}
