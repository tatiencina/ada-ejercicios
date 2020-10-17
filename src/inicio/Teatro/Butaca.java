package inicio.Teatro;

public class Butaca {
    /*
    atributos:
    -numero de fila
    -numero de asiento
    - libre u ocupado
     */

    private int numero;
    private int fila;
    private int col;
    private boolean ocupado;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public static Butaca crear(int posicion) {
        Butaca but = new Butaca();

        return but;
    }
}





