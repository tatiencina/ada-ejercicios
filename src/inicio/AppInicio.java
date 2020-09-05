package inicio;

import inicio.clase1.Usuario;

public class AppInicio {
	/*
	 * método de visibilidad pública con retorno void (vacío) de nombre main con
	 * parámetros vacíos ()
	 */

	/**
	 * JAVA DOC Es una forma standard de escribir documentación para la clase o
	 * método
	 * 
	 * @param args
	 * @author tatiencina
	 */

	// El método main es donde se inicia la aplicación.
	public static void main(String[] args) { // firma del método
		HolaMundo holaMundo = new HolaMundo(); // crea un objeto de mi clase Hola
		// Mundo
		/*
		 * Creo un objeto de la clase Hola mundo con parametros hola, llama al método
		 * que tiene parámetros
		 */
		System.out.println(holaMundo.saludar("Hola Mundo!")); // hace referencia a la
		// clase System que es parte de la
		// librería de java

		/*
		 * Creo un objeto de la clase Hola mundo con parametros hola, llama al método
		 * que no tiene parámetros
		 */
		System.out.println(holaMundo.saludar());
		// out es un atributo de System
		// invoca al método println que imprime en una línea el parámetro que le pase
		/*
		 * declaro variable tipo de dato (usuario) + nombre (user1) + asignaciones a la
		 * variable user1 de tipo Usuario le asigno un nuevo objeto
		 */

		Usuario user1 = null;
		System.out.println("El valor del usuario es: " + user1);

		user1 = new Usuario(); // la vriable user 1 pasa de tener valor null a tener
		// el valor de un objeto que cree user1.test();

		System.out.println(user1);
	}
}
