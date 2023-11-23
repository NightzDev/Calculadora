package com.example.calculator.juros;

import java.util.Scanner;
import java.math.BigDecimal;

public class JurosSimples {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float p, r, t, juroscalculado; /*p == valor inicial ; t == tempo; 
        r == taxa /* */
		
		System.out.println("Digite o valor principal");
		
		p = scanner.nextFloat();
		
		System.out.println("Digite a taxa de juros");
		
		r = scanner.nextFloat();
		
		System.out.println("Digite o período");
		
		t = scanner.nextFloat();
		
		juroscalculado = (p * r * t)/100;
		
		System.out.println("Valor juros calculado " + juroscalculado);
		
		System.out.println("Valor acrescido do juros " + (p+juroscalculado) );
		
	}
	
}