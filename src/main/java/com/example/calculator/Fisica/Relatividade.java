package com.example.calculator.Fisica;


import org.springframework.stereotype.Service;

@Service
public class Relatividade {

	public double Relatividade(double Mass, double Vlight) {
		return Mass * Math.pow(Vlight, 2);
	}
}
