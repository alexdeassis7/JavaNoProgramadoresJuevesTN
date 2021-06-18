package com.educacionit;

import java.util.Scanner;

//b)un maestro desea saber que porcentaje de hombres y que porcentaje de mujeres hay en un grupo de 
//estudiante de programacion mobile 
public class AppPrincipal {

	public static void main(String[] args) {
//		definimos las variables de trabajo 
		float numHombres = 0, numMujeres = 0, porcentajeHombres = 0, porcentajeMujeres = 0;
		float totalAlumnos = 0;
		Scanner teclado = new Scanner(System.in);

//		que entra ? ,solicitamos la cantidad  de hombres y de mujeres  
		System.out.println("Por favor ingrese el total de Mujeres");
		numMujeres = teclado.nextFloat();
		System.out.println("Por favor ingrese el total de Hombres");
		numHombres = teclado.nextFloat();

		// que se procesa ?
		totalAlumnos = numHombres + numMujeres;
		porcentajeHombres = numHombres * 100 / totalAlumnos;// 4*100/13= 30.76923
		porcentajeMujeres = numMujeres * 100 / totalAlumnos;// 9*6/13= 69.23077

//		que sale?
		System.out.println("el porcentaje de mujeres es : " + porcentajeMujeres);
		System.out.println("el porcentaje de hombres es : " + porcentajeHombres);

	}
}
