package inicio.Envio;

import java.util.Scanner;

public abstract class Enviable {

    protected static final float COSTO_2 = 10.0f;
    protected static final float COSTO_3 = 12.0f;
    protected static final float COSTO_1 = 11.0f;
    protected static final float COSTO_4 = 24.0f;
    protected static final float COSTO_5 = 27.0f;
    protected boolean enviable;
    protected int zonaEnvio;

    private int prueba;

    public Enviable (int zona){
        zonaEnvio = zona;
        prueba=zona;
    }

    public Enviable (){ // constructor clase abstracta

    }

    public abstract void enviar();

    public boolean isEnviable() {
        return enviable;
    }

    public void setEnviable(boolean enviable) {
        this.enviable = enviable;
    }

    public int getZona() {
        return zonaEnvio;
    }

    public void setZona(int zonaEnvio) {
        this.zonaEnvio = zonaEnvio;
    }
    static int solicitudZona() {
        System.out.println("Ingrese zona del envio");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

}
