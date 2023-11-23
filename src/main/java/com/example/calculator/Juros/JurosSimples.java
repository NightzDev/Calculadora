package com.example.calculator.Juros;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;

@Service
public class JurosSimples {

	public List<Float> JurosSimples(float p, float r, float t) {

		LinkedList<Float> list = new LinkedList<>();
		float  juroscalculado; /*p == valor inicial ; t == tempo;
        r == taxa /* */
		
		juroscalculado = (p * r * t)/100;
		
		System.out.println("Valor juros calculado " + juroscalculado);
		list.add(juroscalculado);
		System.out.println("Valor acrescido do juros " + (p+juroscalculado) );
		list.add(p+juroscalculado);

		return list;
	}
	
}