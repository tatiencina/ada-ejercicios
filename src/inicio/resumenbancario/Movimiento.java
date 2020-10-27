package inicio.resumenbancario;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimiento {
   private Date fecha;

   public Movimiento(float importe, Date fecha){
       this.importe = importe;
       this.fecha = fecha;

   }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    private float importe;

   @Override
    public String toString(){
       SimpleDateFormat sp = new SimpleDateFormat("dd-MM-yyyy");
        return "Mov fecha: " + sp.format(fecha) + "Importe: " + importe;
    }
}
