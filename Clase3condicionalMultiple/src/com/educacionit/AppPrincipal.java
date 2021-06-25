package com.educacionit;

import java.util.Scanner;

//1) Desarrollar un algoritmo que permita ingresar un número entero comprendido entre 1 y 7,
//y que muestre por pantalla el día de la semana al que se corresponde.
public class AppPrincipal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numeroIngresado = 0;

		System.out.println("ingrese por favor un numero comprendido entre el rango 1 y 7");
		numeroIngresado = teclado.nextInt();// capturamos el dato que ingresa el user

		switch (numeroIngresado) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("el numero Ingresado no se encuentra en el rango indicado");
		}
	}
}
