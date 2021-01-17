package com.itt.calculadora;

import java.text.NumberFormat;
import java.util.Locale; 

public class Resta {
	
	private double num1, num2, num3;
	private double acum;
	private double result;
	
	public Resta() {
		
		this.num1 = 0;
		this.num2 = 0;
		this.num3 = 0;
		this.acum = 0;
		this.result = 0;
		
	}
	
	public String resReales(double num1, double num2) {
		 
		this.result = num1 + num2;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(this.result);
		
	}
	
	public String resEnteros(int num1, int num2) {
		 
		this.result = num1 + num2;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return  nf.format(this.result);
		
	}
	
	public String resTresReales(double num1, double num2, double num3) {
		
		this.result = num1 + num2 + num3;
		
		NumberFormat nf = NumberFormat.getInstance(new Locale("es", "ES"));
		
		return nf.format(this.result);
	}
	
	public void resAcumulado(double num) {
		
		this.acum = acum + num;
	}
	
}