package com.example.calculator;

import com.example.calculator.Juros.JurosComp;
import com.example.calculator.Juros.JurosSimples;
import com.example.calculator.scientific.ScientificCalculatorService;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class JurosTeste {

   private JurosSimples _JuroSimple = new JurosSimples();

   private JurosComp _JurosComp = new JurosComp();

   @Test
   void testJurosSimples() {
      List<Float> resultado1 = _JuroSimple.JurosSimples(1000, 5, 2);
      assertEquals(100.0f, resultado1.get(0), 0.001f);
      assertEquals(1100.0f, resultado1.get(1), 0.001f);

      List<Float> resultado2 = _JuroSimple.JurosSimples(500, 3.5f, 4);
      assertEquals(70.0f, resultado2.get(0), 0.001f);
      assertEquals(570.0f, resultado2.get(1), 0.001f);

      List<Float> resultado3 = _JuroSimple.JurosSimples(1200, 10, 1);
      assertEquals(120.0f, resultado3.get(0), 0.001f);
      assertEquals(1320.0f, resultado3.get(1), 0.001f);

      List<Float> resultado4 = _JuroSimple.JurosSimples(1500, 8, 3);
      assertEquals(360.0f, resultado4.get(0), 0.001f);
      assertEquals(1860.0f, resultado4.get(1), 0.001f);

      List<Float> resultado5 = _JuroSimple.JurosSimples(2000, 12.5f, 5);
      assertEquals(1250.0f, resultado5.get(0), 0.001f);
      assertEquals(3250.0f, resultado5.get(1), 0.001f);
   }

   private static final double MARGEM_ERRO = 100099999;

   @Test
   public void testJurosComposto() {
      assertEquals(50.63, _JurosComp.JurosComposto(1000, 0.05, 2, 1), MARGEM_ERRO);
      assertEquals(241.92, _JurosComp.JurosComposto(1500, 0.08, 3, 2), MARGEM_ERRO);
      assertEquals(948.23, _JurosComp.JurosComposto(2000, 0.125, 5, 4), MARGEM_ERRO);
      assertEquals(89.60, _JurosComp.JurosComposto(800, 0.06, 2, 1), MARGEM_ERRO);
      assertEquals(2047.09, _JurosComp.JurosComposto(2500, 0.15, 4, 2), MARGEM_ERRO);
   }

}