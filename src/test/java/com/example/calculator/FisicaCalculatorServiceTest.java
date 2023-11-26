package com.example.calculator;

import com.example.calculator.Fisica.Deslocamento;
import com.example.calculator.Fisica.Tempo;
import com.example.calculator.Fisica.VelocidadeMedia;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FisicaCalculatorServiceTest {

   private Deslocamento _deslocamento = new Deslocamento();

   private Tempo _tempo = new Tempo();

   private VelocidadeMedia _velocidademedia = new VelocidadeMedia();


   @Test
   void calculateDeslocamento() {
      assertEquals(65, _deslocamento.Desloc(5,20,3));
      assertEquals(350, _deslocamento.Desloc(50,30,10));
      assertEquals(50, _deslocamento.Desloc(10,5,8));
      assertEquals(8000, _deslocamento.Desloc(2000,300,20));
      assertEquals(850, _deslocamento.Desloc(100,50,15));
   }

   @Test
   void calculateTempo() {
      assertEquals(2, _tempo.itempo(120,60));
      assertEquals(5, _tempo.itempo(150,30));
      assertEquals(3, _tempo.itempo(300,100));
      assertEquals(4, _tempo.itempo(240,60));
      assertEquals(2, _tempo.itempo(160,80));
   }

   @Test
   void calculateVelocidadeMedia() {
      assertEquals(40, _velocidademedia.Vmedia(120,3));
      assertEquals(30, _velocidademedia.Vmedia(60,2));
      assertEquals(100, _velocidademedia.Vmedia(500,5));
      assertEquals(60, _velocidademedia.Vmedia(150,2.5));
      assertEquals(15, _velocidademedia.Vmedia(90,6));
   }

}