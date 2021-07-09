package com.educacionit;

import java.util.Scanner;

public class AppPrincipal {
	// Defino atributos de clase ( Variable Globales)
	static float numero1 = 0, numero2 = 0;
	static Scanner teclado = new Scanner(System.in);
	static int opcionIngresada = 0;

	public static void main(String[] args) {
		System.out.println("Inicio de la App");
		// invocamos al procedimiento que nos muestra el menu de opciones

		mostrarMenuDeOpciones();

		switch (opcionIngresada) {
		case 1:
			System.out.println("Usted Selecciono la opcion SUMAR");
			solicitarNumerosAlUsuario();
			float valorRetornado = sumar();
			System.out.println("el resultado de la suma es " + valorRetornado);
			break;
		case 2:
			System.out.println("Usted Selecciono la opcion RESTAR");
			solicitarNumerosAlUsuario();
			break;
		case 3:
			System.out.println("Usted Selecciono la opcion MULTIPLICAR");
			solicitarNumerosAlUsuario();
			break;
		case 4:
			System.out.println("Usted Selecciono la opcion DIVIDIR");
			solicitarNumerosAlUsuario();
			break;
		default:
			System.out.println("La Opcion " + opcionIngresada + " No es una opcion Valida!");
		}
		System.out.println("Fin de la App");
	}

	// Procedimiento
	public static void mostrarMenuDeOpciones() {
		do {

			System.out.println("Ingrese la opcion de la operacion aritmetica que desea realizar");
			System.out.print("1.SUMAR \n2.RESTAR \n3.MULTIPLICAR \n4.DIVIDIR \n");
			opcionIngresada = teclado.nextInt();
		} while (!(opcionIngresada >= 1 && opcionIngresada <= 4));
	}

	// Procedimiento
	public static void solicitarNumerosAlUsuario() {
		System.out.println("Ingrese el Numero Uno");
		numero1 = teclado.nextFloat();
		System.out.println("Ingrese el Numero Dos");
		numero2 = teclado.nextFloat();
	}

	// Funcion
	public static float sumar() {
		float resultado = 0;
		resultado = numero1 + numero2;
		return resultado;
	}

}
