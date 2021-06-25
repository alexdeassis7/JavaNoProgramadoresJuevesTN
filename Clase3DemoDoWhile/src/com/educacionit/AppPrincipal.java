package com.educacionit;

import java.util.Scanner;
//1) Desarrollar un algoritmo que permita ingresar 10 números enteros por
//teclado y que muestre por pantalla el promedio.

public class AppPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroIngresado = 0, contador = 1, acumuladorNumeros = 0;
		float promedio = 0;
		final int CANTNUMEROS = 10;

		do {
			System.out.println("Ingrese el numero " + contador);
			numeroIngresado = teclado.nextInt();
			acumuladorNumeros += numeroIngresado;
			contador++;
			
		} while (contador <= 10);

		promedio = acumuladorNumeros / CANTNUMEROS;
		System.out.println("el promedio de los diez numero que ingreso es  : " + promedio);
//	int numero = 0 ;
//	Scanner teclado = new Scanner(System.in); 
//
//		do{
//			System.out.println("ingrese un numero entre 1 y 10 ");
//			numero = teclado.nextInt();
//		}while (numero >= 1 && numero <= 10 );
//
//
//		while(numero >= 1 && numero <= 10 ) {
//			System.out.println("ingrese un numero entre 1 y 10 ");
//			numero = teclado.nextInt();
//		}
//		
//		System.out.println("fin de la app");

	}

}
