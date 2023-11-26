package com.example.calculator.Fisica;


import org.springframework.stereotype.Service;

@Service
public class Tempo {
	public double itempo(double ds, double vm) {
		
		double dt;
		/*
		      dt=ds/vm
			  vm= velocidade media
			  ds=deslocamento
			  dt=intervalo de tempo'
	      */
		dt= ds / vm;
		return dt;
	}
}
