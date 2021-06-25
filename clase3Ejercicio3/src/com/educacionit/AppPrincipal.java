package com.educacionit;
//3)	Leer 10 números e imprimir solamente los positivos

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int contador = 1, numeroIngresado = 0;
		
		while (contador <= 10) {
			System.out.println("ingrese el numero " + contador);
			numeroIngresado = teclado.nextInt();

			if (numeroIngresado > 0) {
				System.out.println(numeroIngresado + " es positivo ");
			}
			contador++;
		}

		System.out.println("Fin de la app");
		
		teclado.close();
	}

}
