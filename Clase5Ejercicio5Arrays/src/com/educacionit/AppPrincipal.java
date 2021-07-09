package com.educacionit;

import java.util.Iterator;

//5)	Almacenar 300 números en un vector, imprimir cuantos son ceros, 
//cuantos son negativos y cuantos positivos. 
//Imprimir además la suma de los negativos y la suma de los positivos 
public class AppPrincipal {
	public static void main(String[] args) {

		int vecOriginal[] = new int[300];
		int contadorNegativos = 0, contadorPositivos = 0, neutros = 0; // variables contadores
		int sumaNeg = 0, sumaPos = 0;// variables acumuladoras
		// int vectorHarcodeado[] = { 0, 5, 6, 9, 152, 15, 2 };

		// cargamos nuestro vector de manera aleatoria mediante
		// la funcion Ramdon de la libreria Math
		for (int indice = 0; indice < vecOriginal.length; indice++) {
			vecOriginal[indice] = (int) (Math.random() * (-100 - 100) + 100);
			System.out.println("vecOriginal[" + indice + "]=" + vecOriginal[indice]);
		}

		// recorremos el vector en busca de numeros positivos , negativos y neutros
		// tambien se acumulan en las variables sumaPos y sumaNeg
		for (int indice = 0; indice < vecOriginal.length; indice++) {
			if (vecOriginal[indice] > 0) {
				contadorPositivos++;
				sumaPos += vecOriginal[indice];
			} else if (vecOriginal[indice] < 0) {
				contadorNegativos++;
				sumaNeg += vecOriginal[indice];
			} else {
				neutros++;
			}
		}
		// mostramos los resultados por consola
		System.out.println("cantidad de numero positivos : " + contadorPositivos);
		System.out.println("cantidad de numero negativos : " + contadorNegativos);
		System.out.println("cantidad de numero neutros : " + neutros);
		System.out.println("Suamtoria positivos : " + sumaPos);
		System.out.println("Suamtoria negativos : " + sumaNeg);

	}

}
