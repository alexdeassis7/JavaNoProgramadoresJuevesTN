package com.educacionit;

public class AppPrincipal {

	public static void main(String[] args) {

		int diasAgosto = 31;

		// definimos e inicializamos un Array
		float[] temperaturasAgosto = new float[diasAgosto];

		System.out.println("cuanto elementos tiene mi vector ??" + temperaturasAgosto.length);

//		recorremos el vector
		for (int i = 0; i <= temperaturasAgosto.length; i++) {
			System.out.println("temperaturasAgosto[" + i + "]=" + temperaturasAgosto[i]);
		}

		// asignamos valores al vector

		temperaturasAgosto[2] = 45;

		temperaturasAgosto[5] = 4;
//		recorremos el vector
		for (int i = 0; i <= temperaturasAgosto.length; i++) {
			temperaturasAgosto[i] = 95;
			System.out.println("temperaturasAgosto[" + i + "]=" + temperaturasAgosto[i]);
		}
		
		
		
		
		
//
//		int[] edades; // defino
//
//		edades = new int[10]; // inicializo

	}

}
