package com.itt.calculadora;

import java.text.NumberFormat;
import java.util.Locale;

public class Producto {
	
	private static double result;
	
	public Producto() {
		
		result = 0;
		
	}
	
	
	public static String prodReales(double num1, double num2) {
		
		result = num1 * num2;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(result);
		
	}
	
	public static String prodEnteros(int num1, int num2) {
	
			result = num1 * num2;
			
			NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
			
			return nf.format(result);
	
	}
	
	public static String prodReales(double num1, double num2, double num3) {
		
		result = num1 * num2;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(result);
		
	}
	
	public static String potencia(int base, int expo) {
		
		result = Math.pow(expo, expo);
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(result);
	}
	
	

}
