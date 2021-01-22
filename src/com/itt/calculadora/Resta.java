package com.itt.calculadora;

/**
 * <h2>Clase Resta:</h2>
 * <p>Clase estática que realiza las operaciones básicas de resta o sustracción en una calculadora,
 * adicionalmente proporciona métodos para guardar y consultar el acumulado de las restas: <br>
 * - resta de dos números <br>
 * - resta de tres números <br>
 * - resta con memoria</br>
 * No está permitido usar números negativos en la resta.</br></p>
 * <hr/>
 * <h3>Métodos que implementa:</h3>
 * <p>
 * 	<ol>
 * 			<li><h3><em>{@link #Resta()}</em></h3>
 * 				<ul>
 * 					<li>
 * 						Constructor por defecto que no recibe argumentos.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resReales(double, double)}</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para la resta de dos números reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resEnteros(int, int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para la resta de dos números enteros.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resTresReales(double, double, double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para la resta de tres números reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resAcumulado(double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para la resta con memoria.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #getAcum()}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para poder mostar el resultado de la resta acumulada
 * 					</li>
 *	 			</ul>
 * 			</li>
 *		</ol>
 *</p>
 *<hr/>
 *<h2>Casos especiales:</h2>
 *<ol>
 *	<li><p>Utilización de números negativos no permitidos:</p>
 * 		Si uno de los números pasados es negativo se lanzará una excepción
 *		ya que realiza operaciones básicas de resta de números positivos.
 * 	</li>
 * 	<li><p>Usar caracteres en vez de números:</p>
 * 		Si en vez de números como argumentos se pasan caracteres, se lanzará
 * 		una excepción ya que lo único que está permitido son números.
 * 	</li>
 *</ol>
 *
 * @category Funciones matemáticas
 * @version 1.0
 * @since 20/01/2021
 * @author Raúl Ruiz Sanz
 */
public class Resta {

	/**
	 * acum: acumula resultado de diferentes restas
	 */
	private static double acum = 0;

	/**
	 * Constructor de la clase Resta por defecto, no recibe parámetros
	 */
	public Resta() {
	}

	/**
	 * Realiza la resta de dos números reales que recibe como argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el sustraendo de la resta
	 * @return devuelve la resta de num1 menos num2
	 * @exception IOException Si en uno de los parámetros en vez de un número se pasa un carácter 
	 * lanzará una excepción indicando el error 
	 * @exception IOException Si en uno de los parámetros en vez de un número se pasa un número negativo 
	 * lanzará una excepción indicando el error
	 */
	public static double resReales(double num1, double num2) {

		return (num1 - num2);
	}

	/**
	 * Realiza la resta de dos números enteros que recibe como argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el sustraendo de la resta
	 * @return devuelve la resta de num1 menos num2
	 * @exception IOException Si en uno de los parámetros en vez de un número se pasa un carácter 
	 * lanzará una excepción indicando el error 
	 * @exception IOException Si en uno de los parámetros en vez de un número se pasa un número negativo 
	 * lanzará una excepción indicando el error
	 */
	public static int resEnteros(int num1, int num2) {

		return (num1 - num2);

	}

	/**
	 * Realiza la resta del de tres números reales que recibe como argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el primer sustraendo de la resta
	 * @param num3 este es el segundo sustraendo de la resta
	 * @return devuelve el resultado de la resta de (num1 menos num2) menos num3
	 * @exception IOException Si en uno de los parámetros en vez de un número se pasa un carácter 
	 * lanzará una excepción indicando el error 
	 * @exception IOException Si en uno de los parámetros en vez de un número se pasa un número negativo 
	 * lanzará una excepción indicando el error
	 */
	public static double resTresReales(double num1, double num2, double num3) {

		return (num1 - num2 - num3);
	}

	/**
	 * Acumula el valor que pasamos como argumento, de esta forma podemos guardar el valor acumulado 
	 * de varias restas  <br>
	 * Para consultar el valor acumulado de las restas usamos: 
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