package inicio.clase1;

public class Usuario {

	// declaro atributos
	// visibilidad + tipo + nombre

	private String nombre;
	private int loginFallidos;
	protected int loginExitos; // visibilidad protected

	// metodos
	// visibilidad + retorno + nombre + (parametros)
	public String test() {
		nombre = "ABC";
		return nombre;
	}
}
