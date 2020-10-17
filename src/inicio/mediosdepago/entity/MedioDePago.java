package inicio.mediosdepago.entity;

public abstract class MedioDePago {
    public static int CODIGO_PAGO_EFECTIVO = 1;
    public static int CODIGO_PAGO_TARJETA = 2;
    public static int CODIGO_PAGO_CHEQUE = 3;
    private int id;
    private float importe;

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    private String moneda;

    public MedioDePago(float importe, String moneda){
        this.importe = importe;
        this.moneda = moneda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    // los metodos abstractos no tienen cuerpo, solo la firma
    public abstract boolean validar ();
}


