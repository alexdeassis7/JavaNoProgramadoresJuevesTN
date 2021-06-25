package com.educacionit;
import java.util.Scanner;
//1)	Leer dos números: si son iguales que los multiplique, 
//si el primero es mayor que el segundo que los reste y si no que los sume.
public class AppPrincipal {
	public static void main(String[] args) {
		// defino mis variables de trabajo
		int numeroUno = 0, numeroDos = 0, resultado = 0;
		Scanner teclado = new Scanner(System.in);
		// solicito al usuario los dos numeros
		System.out.println("ingrese por favor el numero 1");
		numeroUno = teclado.nextInt();

		System.out.println("ingrese por favor el numero 2");
		numeroDos = teclado.nextInt();

		if (numeroUno > numeroDos) {
//			si el primero es mayor que el segundo que los reste
			System.out.println("n1 es mayor a n2");
			resultado = numeroUno - numeroDos;
		} else if (numeroUno == numeroDos) {
//			si son iguales que los multiplique
			System.out.println("n1 y n2 Son iguales");
			resultado = numeroUno * numeroDos;
		} else {
//			si no que los sume
			System.out.println(" el primer numero es menor que el segundo");
			resultado = numeroUno + numeroDos;
		}

		System.out.println("El resultado es : " + resultado);
	}
}
