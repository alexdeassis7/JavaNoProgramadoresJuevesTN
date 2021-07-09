package com.educacionit;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// el main es nuestro algoritmo principal
		System.out.println("Inicio del main ");
		// invocamos 4 veces a nuestro procedimiento para que ejecute su tarea
//		ejecutar(1, 5);
//		ejecutar(3, 6);
//		ejecutar(10, 22);
//		ejecutar(50, 56);

		// invocamos dos veces a nuestra funcion de calcular IVA
		System.out.println("ingrese el precio del producto 1");
		double precioUno = teclado.nextDouble(); // utilizo funcion nextDouble()
		double valorRetornado = iva(precioUno);
		System.out.println("el iva del producto 1 es: " + valorRetornado);
		
		System.out.println("ingrese el precio del producto 2");
		double precioDos = teclado.nextDouble(); // utilizo funcion nextDouble()
		System.out.println("el iva del producto 2 es: " + iva(precioDos));
		

		System.out.println("Fin del main ");
		teclado.close();
	}

	// definimos nuestro primer metodo de tipo "procedimiento"
	// este procedimiento cada vez que sea invocado muestra los
	// numeros del "inicio" al "fin"
	public static void ejecutar(int inicio, int fin) {
		// cuerpo de mi procedimiento
		for (int i = inicio; i <= fin; i++) {
			System.out.println(i);
		}
	}

	// definimos nuestra primera funcion
	public static double iva(double valor) {
		double porcentaje = 0.21;
		double resultado = valor * porcentaje;
		return resultado;// valor que sera retornado al punto en el cual sea invocada la funcion
	}

}
