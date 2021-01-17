package com.itt.calculadora;

import java.text.NumberFormat;
import java.util.Locale;

public class Division {
	
	private static double result;
	
	public Division() {
		
		result = 0;
		
	}
	
	public static String divReales(double num1, double num2) {
		
		result = num1/num2;
		
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("es", "ES"));
		 
		return nf.format(result);
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
	
	public static String raiz(int num) {
	
		result = Math.sqrt(num);
		
		NumberFormat nf = NumberFormat.getNumberInstance(new Locale("es", "ES"));
		
		return nf.format(result);
	}
	

}
