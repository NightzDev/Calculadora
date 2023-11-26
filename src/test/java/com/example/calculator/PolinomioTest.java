package com.example.calculator;

import com.example.calculator.Juros.JurosSimples;
import com.example.calculator.Polinomios.Polinomio;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PolinomioTest {


   private static final double MARGEM_ERRO = 0.0001;

   @Test
   public void testPolinomio() {
      double[] coeficientesA = {1, 2, 3};
      double[] coeficientesB = {4, 5, 6};
      Polinomio polinomioA = new Polinomio(coeficientesA);
      Polinomio polinomioB = new Polinomio(coeficientesB);

      Polinomio resultadoSoma = polinomioA.somar(polinomioB);
      assertEquals("9.0x^2+7.0x^1+5.0", resultadoSoma.toString());

      Polinomio resultadoMultiplicacao = polinomioA.multiplicar(polinomioB);
      assertEquals("18.0x^4+27.0x^3+28.0x^2+13.0x^1+4.0", resultadoMultiplicacao.toString());

      double resultadoCalculo = polinomioA.calcular(2);
      assertEquals(17.0, resultadoCalculo, MARGEM_ERRO);
   }


}