package com.itt.calculadora;

import java.text.NumberFormat;
import java.util.Locale; 

public class Suma {
	
	private double num1;
	private double num2;
	private double num3;
	private double acum;
	private double result;
	
	public Suma() {
		
		this.num1 = 0;
		this.num2 = 0;
		this.num3 = 0;
		this.acum = 0;
		this.result = 0;
		
	}
	
	public String sumReales(double num1, double num2) {
		 
		this.result = num1 + num2;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(this.result);
		
	}
	
	public String sumEntero(int num1, int num2) {
		 
		this.result = num1 + num2;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return  nf.format(this.result);
		
	}
	
	public String sumTresReales(double num1, double num2, double num3) {
		
		this.result = num1 + num2 + num3;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(this.result);
	}
	
	public void sumAcumulado(double num) {
		
		this.acum = acum + num;
	}
	
}
