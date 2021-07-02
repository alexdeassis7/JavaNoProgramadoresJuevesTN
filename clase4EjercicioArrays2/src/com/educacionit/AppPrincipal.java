package com.educacionit;

public class AppPrincipal {

	public static void main(String[] args) {
		// defino los 3 vectores
		final int CANTIDADELEMENTOS = 45;
		int[] vectorA = new int[CANTIDADELEMENTOS];
		int[] vectorB = new int[CANTIDADELEMENTOS];
		int[] vectorC = new int[CANTIDADELEMENTOS];

		// cargamos los vectores
		for (int i = 0; i < CANTIDADELEMENTOS; i++) {
			//con math.random() generamos numeros aleatorios doubles entre 0 y 1 
			vectorA[i] = (int) (Math.random() * 100) + 1;  
			vectorB[i] = (int) (Math.random() * 100) + 1;  
			// sumo vectorA +vectorB y guardo en Vector C
			vectorC[i] = vectorA[i] + vectorB[i];
			
		}

		for (int i = 0; i < CANTIDADELEMENTOS; i++) {
			System.out.println(vectorA[i] + "+" + vectorB[i] + "=" + vectorC[i]);
		}

	}

}
