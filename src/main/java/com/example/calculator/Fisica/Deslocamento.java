package com.example.calculator.Fisica;

public class Deslocamento {
	
	public double Desloc(double si, double v, double t, double ti, double tf) {
		
		/*      S= Posição(deslocamento)
		        Si= posição inicial
				v= velocidade
				t= intervalo de tempo
				ti=tempo inicial
				tf=tempo final */
		double s;
		s= si + (v * (tf-ti));
		return s;
		
	}
}
