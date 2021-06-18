package com.educacionit;

import java.util.Scanner;

//3) Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
//Si trabaja 40 horas o menos se le paga $16 por cada hora.
//Si trabaja más de 40 horas  se le paga $16 por cada una de las primeras 40 horas
//y $20 por cada hora extra.

public class AppPrincipal {

	public static void main(String[] args) {
		// variables de trabajo
		int hsTrabajadas = 0, hsExtras = 0, salarioSemanal = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("ingrese por favor las horas trabajadas esta semana");
		hsTrabajadas = teclado.nextInt();

		if (hsTrabajadas > 40) {
			// calculamos el salario con hs extras
			hsExtras = hsTrabajadas - 40; // calculo cuantas son las hs extras
			salarioSemanal = hsExtras * 20 + 40 * 16;
		} else {
			// calculamos el salario sin hs extras
			// acciones a ejecutar cuando la condicion evalua es false
			salarioSemanal = hsTrabajadas * 16;
		}
	
		System.out.println("su salario de esta semana es de :" + salarioSemanal + " pesos");

	}

}
