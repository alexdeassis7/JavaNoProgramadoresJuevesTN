package com.educacionit;

//Calcular el promedio de 50 valores almacenados en un Vector. 
//Determinar además cuantos son mayores que el promedio, 
//imprimir el promedio, y una lista de valores mayores que el promedio 
public class AppPrincipal {

	public static void main(String[] args) {
		float[] arrayValores = new float[10];
		float[] arrayDeValoresMayoresAlPromedio;
		
		float sumatoria = 0, promedio = 0;
		int cantidadDeDatosMayoresAlPromedio = 0;

		// cargamos el vector de manera aleatoria
		for (int i = 0; i < arrayValores.length; i++) {
			arrayValores[i] = (float) Math.random() * 100 + 1;
			// acumulo todos los valores del array en la variable sumatoria
			sumatoria += arrayValores[i];
		}
		promedio = sumatoria / arrayValores.length; // calculo el promedio
		System.out.println("el promedio de todos los valores del array es : " + promedio);
		// recorremos el array y contamos cuantos datos son mayores al promedio
		for (int i = 0; i < arrayValores.length; i++) {
			if (arrayValores[i] > promedio) {
				cantidadDeDatosMayoresAlPromedio++;
			}
		}
		
		arrayDeValoresMayoresAlPromedio =  new float[cantidadDeDatosMayoresAlPromedio];
		int j = 0;
		for (int i = 0; i < arrayValores.length; i++) {
			if(arrayValores[i] > promedio) {
				arrayDeValoresMayoresAlPromedio[j] = arrayValores[i];
				j++;
			}
		}
		
		System.out.println("la cantidad de datos mayores al promedio es : "+ cantidadDeDatosMayoresAlPromedio);
		System.out.println("vector con los datos iniciales:");
		for (int i = 0; i < arrayValores.length; i++) {
			System.out.println(arrayValores[i]);
		}
		
		System.out.println("estos son los datos del vector que tiene lo valores mayores que el promedio ");
		for (int i = 0; i < arrayDeValoresMayoresAlPromedio.length; i++) {
			System.out.print(arrayDeValoresMayoresAlPromedio[i] + "  -  ");
		}
		
	}

}
