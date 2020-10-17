package inicio.mediosdepago.entity;

public class TarjetaDeCredito extends MedioDePago{

    private String numero;
    private String vencimiento;
    private String titular;
    private String codigoSeguridad;
    private float porcentajeRecargo;
    private float importeRecargo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public float getPorcentajeRecargo() {
        return porcentajeRecargo;
    }

    public void setPorcentajeRecargo(float porcentajeRecargo) {
        this.porcentajeRecargo = porcentajeRecargo;
    }

    public float getImporteRecargo() {
        return importeRecargo;
    }

    public void setImporteRecargo(float importeRecargo) {
        this.importeRecargo = importeRecargo;
    }




    public TarjetaDeCredito(float importe, String moneda, String numero) {
        super(importe, moneda);
        this.numero = numero;

    }

    @Override
    public boolean validar() {
        boolean resultado = true;
        // validar numero
        // validar importe
        return resultado;
    }
}
