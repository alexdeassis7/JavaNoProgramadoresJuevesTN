package com.educacionit;

import java.util.Scanner;

//3)	Determinar la cantidad de dinero que recibirá un trabajador por concepto 
//de las horas extras trabajadas en una empresa, sabiendo que cuando las
//horas de trabajo exceden de 40, el resto se consideran horas extras y que estas
//se pagan al doble de una hora normal cuando no exceden de 8 ; si las horas extras
//exceden de 8 se pagan las primeras 8 al doble de lo que se pagan las horas normales
//y el resto al triple
public class AppPrincipal {

	public static void main(String[] args) {
		float horasTrabajadas = 0, valorHora = 0, total_a_pagar = 0, horasExtras = 0;
		float cobra_extras = 0, paga_doble = 0, paga_triple = 0;
		Scanner teclado = new Scanner(System.in);

		// solicitamos los datos al usuario ,que entra ???
		System.out.println("Ingrese por favor las horas trabajadas");
		horasTrabajadas = teclado.nextFloat();
		System.out.println("Ingrese por favor el valor hora");
		valorHora = teclado.nextFloat();

		// que se procesa?
		if (horasTrabajadas <= 40) {
			total_a_pagar = horasTrabajadas * valorHora;
		} else {
			// calculamos cuantas horas extras se realizaron
			horasExtras = horasTrabajadas - 40;
			if (horasExtras <= 8) {
				cobra_extras = horasExtras * valorHora * 2;
			} else {
				paga_doble = 8 * valorHora * 2;
				paga_triple = (horasExtras - 8) * valorHora * 3;
				cobra_extras = paga_doble + paga_triple;
			}
			total_a_pagar = 40 * valorHora + cobra_extras;
		}

		System.out.println("el total a pagar es  : " + total_a_pagar);
		teclado.close();
	}
}
