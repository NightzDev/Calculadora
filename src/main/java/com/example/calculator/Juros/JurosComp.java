package com.example.calculator.Juros;

import org.springframework.stereotype.Service;

import java.util.Scanner;
import java.math.BigDecimal;

@Service
public class JurosComp {

	public double JurosComposto(double p,double t, double r, double n) {
		double valorFinal = p * Math.pow(1 + r / n, n * t);
		double jurosCalculado = valorFinal - p;
		return jurosCalculado;
	}
}