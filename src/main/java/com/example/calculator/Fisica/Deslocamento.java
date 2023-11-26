package com.example.calculator.Fisica;

public class Deslocamento {
	
	public double Desloc(double si, double v, double dt) {
		
		/*
		        S= Si+v.dt
		        S= Posição(deslocamento)
		        Si= posição inicial
				v= velocidade
				dt= intervalo de tempo
				 */
		double s;
		s= si + (v * dt);
		return s;
		
	}
}
