package inicio.collection.clima.entities;

public class Medicion {

    private int temperatura, lluvia;

    public Medicion (int temperatura, int lluvia){
        this.temperatura = temperatura;
        this.lluvia = lluvia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getLluvia() {
        return lluvia;
    }

    public void setLluvia(int lluvia) {
        this.lluvia = lluvia;
    }

    @Override
    public String toString() {
        return "Medicion{" +
                "temperatura=" + temperatura +
                ", lluvia=" + lluvia +
                '}';
    }
}
