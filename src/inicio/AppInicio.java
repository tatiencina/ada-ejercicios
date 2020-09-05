package inicio;

import inicio.clase1.Usuario;

public class AppInicio {
	/*
	 * m�todo de visibilidad p�blica con retorno void (vac�o) de nombre main con
	 * par�metros vac�os ()
	 */

	/**
	 * JAVA DOC Es una forma standard de escribir documentaci�n para la clase o
	 * m�todo
	 * 
	 * @param args
	 * @author tatiencina
	 */

	// El m�todo main es donde se inicia la aplicaci�n.
	public static void main(String[] args) { // firma del m�todo
		HolaMundo holaMundo = new HolaMundo(); // crea un objeto de mi clase Hola
		// Mundo
		/*
		 * Creo un objeto de la clase Hola mundo con parametros hola, llama al m�todo
		 * que tiene par�metros
		 */
		System.out.println(holaMundo.saludar("Hola Mundo!")); // hace referencia a la
		// clase System que es parte de la
		// librer�a de java

		/*
		 * Creo un objeto de la clase Hola mundo con parametros hola, llama al m�todo
		 * que no tiene par�metros
		 */
		System.out.println(holaMundo.saludar());
		// out es un atributo de System
		// invoca al m�todo println que imprime en una l�nea el par�metro que le pase
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
