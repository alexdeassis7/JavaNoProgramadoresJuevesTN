package com.educacionit;

import java.util.Scanner;

//Enunciado:
//1) Determinar si un alumno aprueba un curso de programación, 
//sabiendo que aprobara si su promedio de tres calificaciones es mayor o igual a 7;
//reprueba en caso contrario.
public class AppPrincipal {

	public static void main(String[] args) {
		float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
		final int CANTIDADDENOTAS = 3 ;
		Scanner teclado = new Scanner(System.in);
		//solicitamos las tres notas al usuario 
		System.out.println("ingrese la calificacion 1 ");
		nota1 = teclado.nextFloat();
		
		System.out.println("ingrese la calificacion 2 ");
		nota2 = teclado.nextFloat();
		
		System.out.println("ingrese la calificacion 3 ");
		nota3 = teclado.nextFloat();
		
		//calculamos el pormedio 
		promedio = ( nota1 + nota2 + nota3 ) / CANTIDADDENOTAS;
		
		//condicional doble = IF - ELSE
		if(promedio >= 7) {
			System.out.println("CONGRATULATIONS ");
		}else {
			System.out.println("LOSSER , Vuelvas pronto a recuperar ");	
		}

	    System.out.println("EL PROMEDIO ES : " + promedio);	
				
		System.out.println("fin de la app ");

	}

}
