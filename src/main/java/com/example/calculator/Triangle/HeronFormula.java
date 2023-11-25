package com.example.calculator.Triangle;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
import java.util.Locale;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class HeronFormula {

    public Double HeronFormula (double xA, double xB, double xC, double yA, double yB, double yC) {
        //Calculo para achar o Perimetro do Triangulo X
        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle Y area: %.4f%n", areaY);
        System.out.printf("Triangle X area: %.4f%n", areaX);

        if(areaX > areaY) {
            return areaX;
        }
        else {
            return areaY;
        }
    }
}