package inicio.clase1;

/* Generar la clase bicicleta con un atributo velocidad
 *  y un metodo acelerar
 * con prametro nuevaVelocidad que sea asignado al 
 * atributo velocidad
 */
public class Bicicleta {

	private double velocidad;

	private String color;

	/**
	 *
	 * Suma el valor dado a la velocidad actual y devuelve la nueva velocidad.
	 * @param aceleracion
	 * @return
	 */
	public double acelerar(double aceleracion) {
		velocidad += aceleracion	;
		return aceleracion;
	}

	/**
	 * Disminuye la velocidad en el valor dado siempre que ese valor
	 * no sea mayor a l velocidad actual.
	 * Devuelve la nueva velocidad.
	 * @param menosVelocidad
	 * @return
	 */
	public double frenar (double menosVelocidad){
		if (velocidad - menosVelocidad >=0) {
			velocidad -= menosVelocidad;
		}
		else {
			System.out.println("La velocidad actual no permite frenar con " + menosVelocidad	);
		}
		return menosVelocidad;
	}

	/**
	 * POne la velocidad a cero, siempre que la velocidad actual sea menor a 5.
	 */
	public void detener(){
		if (velocidad < 5){
			this.velocidad = 0;

		}
		else {
			System.out.println("Nose puede frenar a esta velocidad");
		}

	}


// getters y setters

	public String getColor() { // get + nombre del atributo
		return color; // get me da el valor del atributo
	}

	public void setColor(String color) {
		this.color = color; // set le asigna un valor a un atributo
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
}



