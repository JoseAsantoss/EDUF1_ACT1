package com.itt.calculadora;

/**
 * <h2>Clase Resta:</h2>
 * <p>Clase est�tica que realiza las operaciones b�sicas de resta o sustracci�n en una calculadora,
 * adicionalmente proporciona m�todos para guardar y consultar el acumulado de las restas: <br>
 * - resta de dos n�meros <br>
 * - resta de tres n�meros <br>
 * - resta con memoria</br>
 * No est� permitido usar n�meros negativos en la resta.</br></p>
 * <hr/>
 * <h3>M�todos que implementa:</h3>
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
 * 						M�todo para la resta de dos n�meros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resEnteros(int, int)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M�todo para la resta de dos n�meros enteros.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resTresReales(double, double, double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M�todo para la resta de tres n�meros reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #resAcumulado(double)}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M�todo para la resta con memoria.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>{@link #getAcum()}:</em></h3>
 * 				<ul>
 * 					<li>
 * 						M�todo para poder mostar el resultado de la resta acumulada
 * 					</li>
 *	 			</ul>
 * 			</li>
 *		</ol>
 *</p>
 *<hr/>
 *<h2>Casos especiales:</h2>
 *<ol>
 *	<li><p>Utilizaci�n de n�meros negativos no permitidos:</p>
 * 		Si uno de los n�meros pasados es negativo se lanzar� una excepci�n
 *		ya que realiza operaciones b�sicas de resta de n�meros positivos.
 * 	</li>
 * 	<li><p>Usar caracteres en vez de n�meros:</p>
 * 		Si en vez de n�meros como argumentos se pasan caracteres, se lanzar�
 * 		una excepci�n ya que lo �nico que est� permitido son n�meros.
 * 	</li>
 *</ol>
 *
 * @category Funciones matem�ticas
 * @version 1.0
 * @since 20/01/2021
 * @author Ra�l Ruiz Sanz
 */
public class Resta {

	/**
	 * acum: acumula resultado de diferentes restas
	 */
	private static double acum = 0;

	/**
	 * Constructor de la clase Resta por defecto, no recibe par�metros
	 */
	public Resta() {
	}

	/**
	 * Realiza la resta de dos n�meros reales que recibe como argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el sustraendo de la resta
	 * @return devuelve la resta de num1 menos num2
	 * @exception IOException Si en uno de los par�metros en vez de un n�mero se pasa un car�cter 
	 * lanzar� una excepci�n indicando el error 
	 * @exception IOException Si en uno de los par�metros en vez de un n�mero se pasa un n�mero negativo 
	 * lanzar� una excepci�n indicando el error
	 */
	public static double resReales(double num1, double num2) {

		return (num1 - num2);
	}

	/**
	 * Realiza la resta de dos n�meros enteros que recibe como argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el sustraendo de la resta
	 * @return devuelve la resta de num1 menos num2
	 * @exception IOException Si en uno de los par�metros en vez de un n�mero se pasa un car�cter 
	 * lanzar� una excepci�n indicando el error 
	 * @exception IOException Si en uno de los par�metros en vez de un n�mero se pasa un n�mero negativo 
	 * lanzar� una excepci�n indicando el error
	 */
	public static int resEnteros(int num1, int num2) {

		return (num1 - num2);

	}

	/**
	 * Realiza la resta del de tres n�meros reales que recibe como argumentos
	 * 
	 * @param num1 este es el minuendo de la resta
	 * @param num2 este es el primer sustraendo de la resta
	 * @param num3 este es el segundo sustraendo de la resta
	 * @return devuelve el resultado de la resta de (num1 menos num2) menos num3
	 * @exception IOException Si en uno de los par�metros en vez de un n�mero se pasa un car�cter 
	 * lanzar� una excepci�n indicando el error 
	 * @exception IOException Si en uno de los par�metros en vez de un n�mero se pasa un n�mero negativo 
	 * lanzar� una excepci�n indicando el error
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
	 * Devuelve el valor de las restas que hemos ido acumulando con el m�todo
	 * {@link #resAcumulado(double)}
	 * 
	 * @return Devuelve valor acumulado
	 */
	public static double getAcum() {
		return acum;
	}

}