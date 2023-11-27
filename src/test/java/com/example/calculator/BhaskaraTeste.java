package com.example.calculator;

import com.example.calculator.Juros.JurosComp;
import com.example.calculator.Juros.JurosSimples;
import com.example.calculator.PreCalc.Equation2nd;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class BhaskaraTeste {

   private Equation2nd _Equation2nd = new Equation2nd();

   @Test
   public void testBhaskara() {
      List<Double> roots1 = _Equation2nd.bhaskara(1, -3, 2);
      assertEquals(List.of(2.0, 1.0), roots1);
      List<Double> roots2 = _Equation2nd.bhaskara(1, 2, 5);
      assertTrue(roots2.get(1).isNaN());
      List<Double> roots3 = _Equation2nd.bhaskara(1, -2, 1);
      assertEquals(List.of(1.0, 1.0), roots3);
      List<Double> roots4 = _Equation2nd.bhaskara(0, 0, 0);
      assertTrue(roots4.get(1).isNaN());
      List<Double> roots5 = _Equation2nd.bhaskara(1, 2, 5);
      assertTrue(roots5.get(1).isNaN());
   }
}