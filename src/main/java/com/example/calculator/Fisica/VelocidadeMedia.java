package com.example.calculator.Fisica;


import org.springframework.stereotype.Service;

@Service
public class VelocidadeMedia {

	public double Vmedia(double ds, double dt) {
	
		double vm;
	/*   
	      vm= ds/dt 
	      vm= velocidade media
	      ds=deslocamento
	      dt=intervalo de tempo
	      */
		vm= ds / dt;
		return vm;
	
	}
}
