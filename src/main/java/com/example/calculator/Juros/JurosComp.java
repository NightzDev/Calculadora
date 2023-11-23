package com.example.calculator.juros;

import java.util.Scanner;
import java.math.BigDecimal;
public class JurosComp {

	public static void main(String[] args) {
		
		double valorfinal, p, t, r, n;  /*p == valor inicial ; t == tempo; 
        r == taxa ; n == período /* */
		
		valorfinal = p * Math.pow(1 + (r/n) , n*t);
		System.out.println("Valor apos " + t + " anos: " + valorfinal);
		
		double juroscalculado = valorfinal - p;
		System.out.println("Juros compostos " + juroscalculado);		
	}
	
}