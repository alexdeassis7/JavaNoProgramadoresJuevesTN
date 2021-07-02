package com.educacionit;
//8)	Simular el comportamiento de un reloj digital, imprimiendo la hora,

//minutos y segundos de un día desde las 0:0:0 hasta las 23:59:59

public class AppPrincipal {

	public static void main(String[] args) {
		int contadorHs = 0, contadorMin = 0, contadorSeg = 0;
		// anidamos estructuras repetitivas
		while (contadorHs <= 23) {
			
			while (contadorMin <= 59) {
				
				while (contadorSeg <= 59) {
					System.out.println(contadorHs + ":" + contadorMin + ":" + contadorSeg);
					contadorSeg++;
				}
				contadorSeg = 0;
				contadorMin ++;
			}
			
			contadorSeg = 0;
			contadorMin = 0;
			contadorHs++;
		}
	}
}
