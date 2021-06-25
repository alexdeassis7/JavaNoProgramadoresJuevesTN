package com.educacionit;

import java.util.Scanner;

//1)	Calcular el promedio de un alumno que tiene 7 calificaciones en la materia
//de Diseño Estructurado de Algoritmos.
public class AppPrincipal {

	public static void main(String[] args) {
		// definimos variables y contantes
		Scanner teclado = new Scanner(System.in);
		float calificacion = 0, promedio = 0, sumaNotas = 0;
		int contador = 1;
		final int CANTCALIFICACIONES = 3;

		// solicitamos las 7 calificaciones con una estructura While
		while (contador <= CANTCALIFICACIONES) {
			System.out.println("ingrese la calificación " + contador);
			calificacion = teclado.nextFloat();
			sumaNotas += calificacion;//sumaNotas =sumaNotas + calificacion ;
			contador++;
		}

		// calculamos el promedio de las notas
		promedio = sumaNotas / CANTCALIFICACIONES;
		System.out.println("El promedio de las " + CANTCALIFICACIONES + " calificaciones es " + promedio);

	}

}
