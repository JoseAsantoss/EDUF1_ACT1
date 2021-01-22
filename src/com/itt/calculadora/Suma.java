package com.itt.calculadora;


/**
 * <h2>Clase Suma:</h2>
 * <br>
 * <p>Clase estática que realiza las operaciones básicas de suma en una calculadora: <br>
 * - suma de dos números <br>
 * - suma de tres números <br>
 * - suma con memoria</p>
 * <hr/>
 * <h3>Metodos que implementa:</h3>
 * <br>
 * <p>
 * 	<ol>
 * 			<li><h3><em>public.Suma():</em></h3>
 * 				<ul>
 * 					<li>
 * 						Constructor por defecto que no recibe argumentos.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>sumReales(double num1, double num2):</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para la suma de dos números reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>sumEnteros(int num1, int num2):</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para la suma de dos números enteros.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>sumReales(double num1, double num2, double num3):</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para la suma de tres números reales.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>void sumAcumulado(double num):</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para la suma con memoria.
 * 					</li>
 * 				</ul>
 * 			</li>
 * 			<li><h3><em>getAcum():</em></h3>
 * 				<ul>
 * 					<li>
 * 						Método para poder mostar el resultado de la suma acumulada
 * 					</li>
 *	 			</ul>
 * 			</li>
 *		</ol>
 *</p>
 *<hr/>
 *<h2>Casos especiales:</h2>
 *<ol>
 *	<li><p>Utilización de números negativos no permitidos:</p>
 * 		<dd>Si uno de los números pasados es negativo se lanzara una excepción
 *		ya que realiza operaciones básicas de suma de números positivos.</dd>
 * 	</li>
 * 	<li><p>Usar caracteres en vez de números:
 * 		<dd>Si en vez de números como argumentos se pasan caracteres, se lanzará
 * 		una excepción ya que lo único que están permitidos son números.</dd>
 * 	</li>
 *</ol>
 *
 * @category Funciones matemáticas
 * @version 1.0
 * @since 20/01/2021
 * @author jass
 */
public class Suma {
	
	private static double acum = 0;
	
	/**
	 * Constructor por defecto que no recibe ningún parámetro.
	 */
	public Suma() {
		
	}
	
	/**
	 * Método estático que recibe dos números reales como argumentos y devuelve la suma de ambos.
	 * @param num1
	 * 		Sumando que recibe un número real
	 * @param num2
	 * 		Sumando que recibe un número real
	 * @return
	 * 		Un número real que es el resultado de la suma de num1 + num2.
	 * @exception
	 * 		IOException Si en uno de los parámetros en vez de un número se pasa un carácter lanzará una excepción
	 * 		indicando el error
	 */
	public static double sumReales(double num1, double num2) {
		
		return num1+num2;
		
	}
	
	/**
	 * Método estático que recibe dos números enteros como argumentos y devuelve la suma de ambos.
	 * @param num1
	 * 		Sumando que recibe un número entero
	 * @param num2
	 * 		Sumando que recibe un número entero
	 * @return
	 * 		El resultado de la suma de num1 y num2.
	 * @exception
	 * 		IOException Si en uno de los parámetros en vez de un número se pasa un carácter lanzará una excepción
	 * 		indicando el error
	 */
	public static int sumEntero(int num1, int num2) {
		 
		return  num1+num2;
		
	}
	
	/**
	 * Método estático que recibe tres números reales como argumentos y devuelve la suma de ambos.
	 * @param num1
	 * 		Sumando que recibe un número real
	 * @param num2
	 * 		Sumando que recibe un número real
	 * @param num3
	 * 		Sumando que recibe un número real
	 * @return
	 * 		Un número real que es el resultado de la suma de num1, num2 y num3
	 * @exception
	 * 		IOException Si en uno de los parámetros en vez de un número se pasa un carácter lanzará una excepción
	 * 		indicando el error
	 */
	public static double sumTresReales(double num1, double num2, double num3) {
				
		return num1+num2+num3;
		
	}
	
	/**
	 * Método estático que acumula el número que se vaya pasando 
	 * como parámetro, con el fin de realizar una suma acumulada.
	 * @param num
	 * 		Número de tipo real 
	 * @exception
	 * 		IOException Si en uno de los parámetros en vez de un número se pasa un carácter lanzará una excepción
	 * 		indicando el error
	 */
	public static void sumAcumulado(double num) {

		//TODO Aquí el código que tiene que ir acumulando la suma.
		
	}
	/**
	 * Método estático que no recibe paŕametros y devuelve el valor acumulado de la suma.
	 * @return
	 * 		Devuelve el valor acumulado de la suma.
	 * @exception
	 * 		IOException Si en uno de los parámetros en vez de un número se pasa un carácter lanzará una excepción
	 * 		indicando el error
	 */
	public static double getAcum() {
		
		return acum;
	}
	
}
