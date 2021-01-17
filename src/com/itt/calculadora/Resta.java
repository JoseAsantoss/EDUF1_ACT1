package com.itt.calculadora;

import java.text.NumberFormat;
import java.util.Locale; 

public class Resta {
	
	
	private static double acum;
	private static double result;
	
	public Resta() {
		
		acum = 0;
		result = 0;
		
	}
	
	public static String resReales(double num1, double num2) {
		 
		result = num1 + num2;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(result);
		
	}
	
	public static String resEnteros(int num1, int num2) {
		 
		result = num1 + num2;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return  nf.format(result);
		
	}
	
	public static String resTresReales(double num1, double num2, double num3) {
		
		result = num1 + num2 + num3;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(result);
	}
	
	public void resAcumulado(double num) {
		
		acum = acum + num;
		
	}
	
}