package com.example.calculator.Juros;

import org.springframework.stereotype.Service;

import java.util.Scanner;
import java.math.BigDecimal;

@Service
public class JurosComp {

	public double JurosComposto(double p,double t, double r, double n) {
		
		double valorfinal;  /*p == valor inicial ; t == tempo;
        r == taxa ; n == período /* */
		
		valorfinal = p * Math.pow(1 + (r/n) , n*t);
		System.out.println("Valor apos " + t + " anos: " + valorfinal);
		
		double juroscalculado = valorfinal - p;
		return juroscalculado;
	}
}