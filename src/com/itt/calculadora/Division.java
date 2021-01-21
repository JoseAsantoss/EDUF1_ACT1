package com.itt.calculadora;

import java.text.NumberFormat;
import java.util.Locale;


/**
 * 
 * Esta clase está creada para realizar la división entre dos números.
 * 
 * El usuario introducirá dos números (enteros, reales) para realizar
 * las distintas operaciones solicitadas.
 * 
 * Se le advertirá que el segundo número debe ser distinto de cero,
 * de introducir cero le saldría un mensaje advirtiendo que no es correcto.
 * 
 * 
 * @author Miguel A. Lozano.
 * @since 20-01-2021.
 * @version 1.0
 */

public class Division {
	
	private static double result;
	
	public Division() { // constructor
		
		result = 0;
		
	}
	
	/**
	  * <b>Método para dividir dos números reales.</b>
	  * @param num1 recoge el primer número, que será el dividendo de la división.
	  * @param num2 recoge el segundo número, que será el divisor de la división,
	  * este número deberá ser <b>distinto de cero</b>. De poner un numero negativo
	  * 
	  * @return nos devuelve (retorna) el resultado de la división.
	  *  
	  * @throws ¿?
	  */
	
	public static Double divReales(double num1, double num2) {
		
		return (num1/num2);
		 
	}
	
	
	
	public static String divEnteros(int num1, int num2) {
		
		result = num1/num2;
		
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("es", "ES"));
		 
		return nf.format(result);
	}
	
	public static String inverso(double num) {
		
		result = 1/num;
		
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("es", "ES"));
		 
		return nf.format(result);
	}
	/**
	 * 
	 * 
	 * {@link Division#raiz()}
	 * 
	 * #
	 * 
	 * 
	 */
	
	/**
	 * #
	 * 
	 * @param num
	 * @return
	 */
	public static String raiz(int num) {
	
		result = Math.sqrt(num);
		
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("es", "ES"));
		
		return nf.format(result);
	}
	

}
