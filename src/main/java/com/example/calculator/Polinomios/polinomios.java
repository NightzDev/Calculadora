package com.example.calculator.Polinomios;

public class polinomios {
    private double[] coeficientes;

    public Polinomio(double[] coeficientes) {
        this.coeficientes = coeficientes;
    }

    public double calcular(double x) {
        double resultado = 0;
        for (int i = 0; i < coeficientes.length; i++) {
            resultado += coeficientes[i] * Math.pow(x, i);
        }
        return resultado;
    }

    public Polinomio somar(Polinomio outro) {
        int tamanhoMaior = Math.max(coeficientes.length, outro.coeficientes.length);
        double[] novoCoeficientes = new double[tamanhoMaior];
        for (int i = 0; i < coeficientes.length; i++) {
            novoCoeficientes[i] += coeficientes[i];
        }
        for (int i = 0; i < outro.coeficientes.length; i++) {
            novoCoeficientes[i] += outro.coeficientes[i];
        }
        return new Polinomio(novoCoeficientes);
    }

    public Polinomio multiplicar(Polinomio outro) {
        int novoTamanho = coeficientes.length + outro.coeficientes.length - 1;
        double[] novoCoeficientes = new double[novoTamanho];
        for (int i = 0; i < coeficientes.length; i++) {
            for (int j = 0; j < outro.coeficientes.length; j++) {
                novoCoeficientes[i + j] += coeficientes[i] * outro.coeficientes[j];
            }
        }
        return new Polinomio(novoCoeficientes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeficientes.length - 1; i >= 0; i--) {
            if (coeficientes[i] != 0) {
                if (coeficientes[i] > 0 && sb.length() > 0) {
                    sb.append("+");
                }
                sb.append(coeficientes[i]);
                if (i > 0) {
                    sb.append("x^").append(i);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Polinomio p1 = new Polinomio(new double[]{2, -3, 1});  // 2x^2 - 3x + 1
        Polinomio p2 = new Polinomio(new double[]{1, 2});     // x + 2

        Polinomio soma = p1.somar(p2);
        System.out.println("Soma: " + soma);

        Polinomio produto = p1.multiplicar(p2);
        System.out.println("Produto: " + produto);

        double resultado = p1.calcular(3);
        System.out.println("Resultado para x=3: " + resultado);
    }
}
