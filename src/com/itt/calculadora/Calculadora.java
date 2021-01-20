/**
 * 
 */
package com.itt.calculadora;

import java.lang.Double;

/**
 * @author jsant
 *
 */
public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sum = Suma.sumReales(4.85, 9.85);
		System.out.println(sum);
		sum = Suma.sumEntero(8, 10);
		System.out.println(sum);
		sum = Suma.sumTresReales(8.51, 9.54, 7.25);
		System.out.println(sum);
		sum = sum.replace(",", ".");
	
		Double sum1 = Double.parseDouble(sum);
		System.out.println(sum1);
		
		Suma.sumAcumulado(sum1);
		Suma.sumAcumulado(45.87);
		Suma.sumAcumulado(5);
		
		System.out.println(Suma.getAcum());
		
		sum = Suma.sumReales(13.83, Suma.getAcum());
		
		System.out.println(sum);
		
		
				
				
				
		
		
		
	}

}
