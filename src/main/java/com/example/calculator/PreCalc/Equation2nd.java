package com.example.calculator.PreCalc;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

@Service
public class Equation2nd {

    private double delta(int a, int b, int c){
        return ((Math.pow(b, 2)) - (4 * a * c));
    }

    public List<Double> bhaskara(int a, int b, int c){
        List<Double> list = new LinkedList<Double>();
        double x1 = (-b + (Math.sqrt(delta(a,b,c))))/(2*a);
        System.out.println(x1);
        double x2 = (-b - (Math.sqrt(delta(a,b,c))))/(2*a);
        list.add(x1);
        list.add(x2);
        return list;
    }
}
