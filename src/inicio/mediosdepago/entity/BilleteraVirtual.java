package inicio.mediosdepago.entity;

public class BilleteraVirtual extends MedioDePago {

    public BilleteraVirtual(float importe, String moneda) {
        super(importe, moneda);
    }

    @Override
    public boolean validar() {
        return false;
    }
}
