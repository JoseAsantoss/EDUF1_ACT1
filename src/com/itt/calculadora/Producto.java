package com.itt.calculadora;

/**
 * 
 * La clase <b>Producto</b> implementa 4 métodos propios de la multiplicación.
 * <p>Cada método retorna el resultado de la operación correspondiente.</p>
 * 
 * @author Álvaro Quiles Pomares
 * @version 1.0
 * @since 20-01-2021
 */
public class Producto {

	/**
	 * <b>Producto de dos números reales.</b>
	 * @param num1 Primer operando de tipo real.
	 * @param num2 Segundo operando de tipo real.
	 * @return Devuelve un double con el resultado de multiplicar 
	 * los dos números reales pasados al método como argumentos. 
	 * <br>
	 * <b>Casos especiales:</b>
	 * <br>
	 * <li>Si el primer y/o segundo argumento es 0, el resultado será 0.</li>
	 */
	public static double prodReales(double num1, double num2) {
		
		return num1 * num2;
		
	}
	
	/**
	 * <b>Producto de dos números enteros.</b>
	 * @param num1 Primer operando de tipo entero.
	 * @param num2 Segundo operando de tipo entero.
	 * @return Devuelve un int con el resultado de multiplicar 
	 * los dos números enteros pasados al método como argumentos. 
	 * <br>
	 * <b>Casos especiales:</b>
	 * <li>Si el primer y/o segundo argumento es 0, el resultado será 0.</li>
	 */
	public static int prodEnteros(int num1, int num2) {
		
		return num1 * num2;
		
	}
	
	/**
	 * <b>Producto de tres números reales.</b>
	 * @param num1 Primer operando de tipo real.
	 * @param num2 Segundo operando de tipo real.
	 * @param num3 Tercer operando de tipo real.
	 * @return Devuelve un double con el resultado de multiplicar 
	 * los tres números reales pasados al método como argumentos. 
	 * <br>
	 * <b>Casos especiales:</b>
	 * <br>
	 * <li>Si el primer y/o segundo y/o tercer argumento es 0, el resultado será 0.</li>
	 */
	public static double prodReales(double num1, double num2, double num3) {
		
		return num1 * num2 * num3;
		
	}
	
	/**
	 * <b>Potencia</b>
	 * @param base Número entero que será la base de la operación.
	 * @param expo Número entero que será el exponente de la operación.
	 * @return Devuelve un int con el resultado de elevar al argumento
	 * pasado como base el valor del argumento pasado como exponente.
	 * <br>
	 * <p>
	 * <b>Casos especiales:</b>
	 * <br>
	 * <li>Si el primer argumento es 0 y el segundo argumento es cualquier número distinto de 0,
	 * 	 el resultado será 0.</li>
	 * <li>Si el segundo argumento es 0, el resultado será 1.</li>
	 * <li>Si el segundo argumento es 1, el resultado será igual al primer argumento.</li>
	 * <li>Si el primer y segundo argumento es 0, se mostrará un mensaje de error 
	 *   para que el usuario introduzca operandos válidos.</li>
	 * <li>Si el segundo argumento es NaN, el resultado será NaN.</li>
	 * <li>Si el primer argumento es NaN y el segundo argumento es distinto de 0, el resultado será NaN.</li>
	 * <li>Si los argumentos pasados provocasen un desbordamiento, se mostrará un mensaje de error al usuario.</li>
	 */
	public static int potencia(int base, int expo) {
		
		return (int)(Math.pow(base, expo));
		
	}
	

}
