package com.educacionit;

public class AppPrincipal {

	public static void main(String[] args) {
		// Estructura MIENTRAS (While)
		int contador = 0;
		System.out.println("inicio de la app");

		while (contador <= 10) { // LOOP INFINITO!	
			// sentencia a ejecutar mientras la condicion sea TRUE
			System.out.println("contador : " + contador);
			contador ++ ; //contador = contador + 1; o tambien contador +=1 ;
		}
		System.out.println("fin de la app");

	}

}
