package com.itt.calculadora;

import java.text.NumberFormat;
import java.util.Locale; 
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
	
	private static double result;
	private static double acum;
	
	public Suma() {
	
		result = 0;
		acum = 0;
		
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
	public static String sumReales(double num1, double num2) {
		 
		result = num1 + num2;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(result);
		
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
	public static String sumEntero(int num1, int num2) {
		 
		result = num1 + num2;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return  nf.format(result);
		
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
	public static String sumTresReales(double num1, double num2, double num3) {
		
		result= num1 + num2 + num3;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(result);
	}
	
	/**
	 * 
	 * @param num
	 * 		Parámetro que recibe un número real y que se va acumulando
	 * 		con el fin de tener una suma acumulada.
	 * 		No devuelve valor.
	 */
	public static void sumAcumulado(double num) {

		acum = acum + num;
		
	}
	/**
	 * 
	 * @return
	 * 		Devuelve el valor acumulado de la suma.
	 */
	public static double getAcum() {
		return acum;
	}
	
}
