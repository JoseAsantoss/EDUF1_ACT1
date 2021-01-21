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
	private static double acum=0;

	/**
	 * Constructor de la clase Resta
	 */
	public Resta() {
	}

	/**
	 * Devuelve la resta de sus argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el sustraendo de la resta
	 * @return devuelve la resta de num1 menos num2.
	 */
	public static double resReales(double num1, double num2) {

		return (num1 - num2);
	}

	/**
	 * Devuelve la resta de sus argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el sustraendo de la resta
	 * @return devuelve la resta de num1 menos num2.
	 * 
	 */
	public static int resEnteros(int num1, int num2) {

		return (num1 - num2);

	}

	/**
	 * Devuelve el resultado de restar al primer parámetro los otros dos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el primer sustraendo de la resta
	 * @param num3 este es el segundo sustraendo de la resta
	 * @return devuelve la resta de (num1 menos num2) menos num3.
	 */
	public static double resTresReales(double num1, double num2, double num3) {

		return (num1 - num2 - num3);
	}

	/**
	 * 
	 * @param num parámetro con el resultado de la resta que queremos ir acumulando
	 */
	public void resAcumulado(double num) {

		acum = acum + num;

	}
	/**
	 * 
	 * @return
	 * 		Devuelve el valor de las restas que hemos ido acumulando con el método resAcumulado.
	 */
	public static double getAcum() {
		return acum;
	}
}