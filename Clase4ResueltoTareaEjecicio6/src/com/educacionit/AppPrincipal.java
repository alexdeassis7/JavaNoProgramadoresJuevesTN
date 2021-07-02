package com.educacionit;

import java.util.Scanner;

//6)Suponga que se tiene un conjunto de calificaciones de un grupo de 40 alumnos.
//Realizar un algoritmo para calcular la calificación media y la calificación
//más baja de todo el grupo
public class AppPrincipal {

	public static void main(String[] args) {
		int contador = 1;
		Scanner teclado = new Scanner(System.in);
		float calificacion = 0 , sumatoria = 0 , baja = 9999 , promedio = 0 ;
		final int CANTNOTAS = 5;
		
		while (contador <= CANTNOTAS) {
			System.out.println("Ingrese por favor la calificacion " + contador);
			calificacion = teclado.nextFloat();
			sumatoria += calificacion;
			if(calificacion < baja) {
				baja = calificacion;
			}
			contador++;
		}

		promedio = sumatoria / CANTNOTAS ;
		
		System.out.println("la calificacion mas baja es : " + baja);
		System.out.println("El promedio de las "+ CANTNOTAS + " calificaciones es : " + promedio);
		teclado.close();
	}

}
