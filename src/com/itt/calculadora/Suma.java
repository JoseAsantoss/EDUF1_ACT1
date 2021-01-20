package com.itt.calculadora;


/**
 * Clase Suma:
 * 	Esta clase estática realiza las operaciones básicas de una suma.
 * 	Implementa diferentes métodos en función de si trabajamos con números
 * 	reales o enteros.
 * 
 * @author jass
 * @category Funciones matemáticas
 * @version 1.0
 * @since 20/01/2021
 *
 */
public class Suma {
	
	
	public Suma() {
	
		
	}
	
	/**
	 * 
	 * @param num1
	 * 		Sumando que recibe un número real
	 * @param num2
	 * 		Sumando que recibe un número real
	 * @return
	 * 		El resultado de la suma en formato String, ya que se 
	 * 		devuelve formateado al sistema Español "." para los 
	 * 		millares "," para los decimales.
	 */
	public static double sumReales(double num1, double num2) {
		
		return 0.00d;
		
	}
	
	/**
	 * 
	 * @param num1
	 * 		Sumando que recibe un número entero
	 * @param num2
	 * 		Sumando que recibe un número entero
	 * @return
	 * 		El resultado de la suma en formato String, ya que se 
	 * 		devuelve formateado al sistema Español "." para los 
	 * 		millares "," para los decimales.
	 */
	public static int sumEntero(int num1, int num2) {
		 
		
		return  0;
		
	}
	
	/**
	 * 
	 * @param num1
	 * 		Sumando que recibe un número real
	 * @param num2
	 * 		Sumando que recibe un número real
	 * @param num3
	 * 		Sumando que recibe un número real
	 * @return
	 * 		El resultado de la suma en formato String, ya que se 
	 * 		devuelve formateado al sistema Español "." para los 
	 * 		millares "," para los decimales.
	 */
	public static double sumTresReales(double num1, double num2, double num3) {
		
		
		return 0.00d;
	}
	
	/**
	 * 
	 * @param num
	 * 		Parámetro que recibe un número real y que se va acumulando
	 * 		con el fin de tener una suma acumulada.
	 * 		No devuelve valor.
	 */
	public static void sumAcumulado(double num) {

		//TODO Aquí el código que tiene que ir acumulando la suma.
		
	}
	/**
	 * 
	 * @return
	 * 		Devuelve el valor acumulado de la suma.
	 */
	public static double getAcum() {
		
		return 0;
	}
	
}
