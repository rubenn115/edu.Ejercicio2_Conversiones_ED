/***
 * Ruben Bernal Ramos, CSI1
 */

package edu.Ejercicio2_Conversiones_ED;

import java.util.Scanner;

/***
 * Clase principal de la aplicación
 * rbr - 051123
 */
public class principal {
/***
 * Método principal de la aplicación
 * rbr - 051123
 * @param args
 */
	public static void main(String[] args) {

		//Declaro las variables
		double numeroDecimal;
		int numeroEntero;
		String numDecimal, numEntero;
		double decimalPrimitivo;
		int enteroPrimitivo;
		
		//Solicito el número por consola
		System.out.println("Introduce un número decimal:");
		
		//Declaro la variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicito el número decimal
		numeroDecimal = sc.nextDouble();
		
		//Lo convierto a entero
		numeroEntero = (int)numeroDecimal;
		
		//Los convierto a tipo String
		numDecimal = Double.toString(numeroDecimal);
		numEntero = Integer.toString(numeroEntero);
		
		//Los vuelvo a convertir en sus tipos primitivos
		decimalPrimitivo = Double.parseDouble(numDecimal);
		enteroPrimitivo = Integer.parseInt(numEntero);
		
		//Los muestro por consola
		System.out.println(decimalPrimitivo);
		System.out.println(enteroPrimitivo);
	}

}
