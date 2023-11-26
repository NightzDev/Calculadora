package com.example.calculator;

import com.example.calculator.Juros.JurosComp;
import com.example.calculator.Juros.JurosSimples;
import com.example.calculator.Triangle.HeronFormula;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class HeronTeste {

   private HeronFormula _heronFormula = new HeronFormula();

   private static final double MARGEM_ERRO = 0.10;

   @Test
   void testHeron() {
      assertEquals(27.0, Math.ceil(_heronFormula.HeronFormula(3, 4, 5, 7, 8, 9)), MARGEM_ERRO);
      assertEquals(54.0, Math.ceil(_heronFormula.HeronFormula(5, 12, 13, 9, 12, 15)), MARGEM_ERRO);
      assertEquals(120.0, Math.ceil(_heronFormula.HeronFormula(8, 15, 17, 10, 24, 26)), MARGEM_ERRO);
      assertEquals(150.0, Math.ceil(_heronFormula.HeronFormula(7, 24, 25, 15, 20, 25)), MARGEM_ERRO);
   }


}