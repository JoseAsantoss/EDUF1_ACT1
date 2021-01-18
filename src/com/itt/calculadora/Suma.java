package com.itt.calculadora;

import java.text.NumberFormat;
import java.util.Locale; 

public class Suma {
	
	private static double result;
	private static double acum;
	
	public Suma() {
	
		result = 0;
		acum = 0;
		
	}
	
	public static String sumReales(double num1, double num2) {
		 
		result = num1 + num2;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(result);
		
	}
	
	public static String sumEntero(int num1, int num2) {
		 
		result = num1 + num2;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return  nf.format(result);
		
	}
	
	public static String sumTresReales(double num1, double num2, double num3) {
		
		result= num1 + num2 + num3;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(result);
	}
	
	public void sumAcumulado(double num) {

		acum = acum + num;
		
	}
	
}
