package com.educacionit;

import java.util.Scanner;
//comentario : ctrl + shift + c

//a)suponga que un individuo desea invertir su capital en un banco y desea saber
//cuanto dinero ganara despues de un mes si el banco paga a razon de 2% mensual en dolares.

public class AppPrincipal {
	public static void main(String[] args) {
//		definimos las variables de trabajo 
		float capital = 0, ganancia = 0;// valor mutable
		final float PORCENTAJE = 0.02f; // valor inmutable
		Scanner teclado = new Scanner(System.in);

//		que entra ? 
		System.out.println("cual es el capital que desea invertir este mes en el banco ?");
		capital = teclado.nextFloat();

//		que se procesa ?
		ganancia = capital * PORCENTAJE; // calculamos la ganacia

//		que sale?
		System.out.println("su ganancia sera de : " + ganancia + " pesos");

	}
}
