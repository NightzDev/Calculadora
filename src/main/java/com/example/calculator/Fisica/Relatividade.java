package com.example.calculator.Fisica;


import org.springframework.stereotype.Service;

@Service
public class Relatividade {

	public double Relatividade(double Mass) {
		return Mass * Math.pow(299792458, 2);
	}
}
