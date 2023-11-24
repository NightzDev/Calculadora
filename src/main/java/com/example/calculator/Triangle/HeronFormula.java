package com.example.calculator.Triangle;

import java.util.Scanner;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

@Service;

public class Heronformula {

    public Double HeronFormula (double xA, double xB, double xC, double yA, double yB, double yC) { 
        LinkedList<Double> list = new LinkedList<>();
        //Calculo das areas do trianguilo X e  triangulo Y

        System.out.println("Digite os dados do triangulo X: ");
        System.out.println("Digite os dados do triangulo Y: ");
        

        //Calculo para achar o Perimetro do Triangulo X
        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Area maior é X");
        }
        else {
            System.out.println("Area maior é Y");
        }
    }

    }
}