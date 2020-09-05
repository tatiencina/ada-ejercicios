package inicio.clase1;

/* Generar la clase bicicleta con un atributo velocidad
 *  y un metodo acelerar
 * con prametro nuevaVelocidad que sea asignado al 
 * atributo velocidad
 */
public class Bicicleta {

	private double velocidad;

	public double acelerar(double nuevaVelocidad) {
		velocidad = nuevaVelocidad;
		return nuevaVelocidad;
	}

}
