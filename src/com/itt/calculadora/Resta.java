package com.itt.calculadora;

/**
 * 
 * La clase <b>Resta</b> implementa los métodos que realizan la operación
 * matemática básica de resta o sustracción
 * 
 * @author Raúl Ruiz Sanz
 * @version 1.0
 * @since 20-01-2021
 *
 */
public class Resta {

	/**
	 * acum: acumula resultado de diferentes restas
	 */
	private static double acum = 0;

	/**
	 * Constructor de la clase Resta
	 */
	public Resta() {
	}

	/**
	 * Realiza la resta de dos números reales
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el sustraendo de la resta
	 * @return devuelve la resta de num1 menos num2
	 */
	public static double resReales(double num1, double num2) {

		return (num1 - num2);
	}

	/**
	 * Realiza la resta de dos números enteros
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el sustraendo de la resta
	 * @return devuelve la resta de num1 menos num2
	 * 
	 */
	public static int resEnteros(int num1, int num2) {

		return (num1 - num2);

	}

	/**
	 * Realiza la resta del de tres números reales
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el primer sustraendo de la resta
	 * @param num3 este es el segundo sustraendo de la resta
	 * @return devuelve el resultado de la resta de (num1 menos num2) menos num3
	 */
	public static double resTresReales(double num1, double num2, double num3) {

		return (num1 - num2 - num3);
	}

	/**
	 * Acumula el valor que pasamos como argumento</br>
	 * Para consultar el valor acumulado de las restas usamos
	 * {@link Resta#getAcum()}
	 * 
	 * @param num resultado de las restas que queremos ir acumulando
	 */
	public static void resAcumulado(double num) {

		acum = acum + num;

	}

	/**
	 * Devuelve el valor de las restas que hemos ido acumulando con el método
	 * {@link #resAcumulado(double)}
	 * 
	 * @return Devuelve valor acumulado
	 */
	public static double getAcum() {
		return acum;
	}

}