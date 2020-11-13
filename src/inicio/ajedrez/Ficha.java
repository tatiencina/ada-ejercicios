package inicio.ajedrez;

public class Ficha {
    private String color;
    private String nombre;
    private int num;

    public Ficha(String color, String nombre, int num) {
        this.color = color;
        this.nombre = nombre;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", num=" + num +
                '}';
    }
}
