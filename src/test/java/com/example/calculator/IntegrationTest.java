package com.example.calculator;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class IntegrationTest {

   @Test
   public void testAdditionEndpoint() throws Exception {
      // Valores a serem somados
      int addend = 213;
      int augend = 231;

      // URL do endpoint
      String url = "http://localhost:8080/calculator/basic/add?addend=" + addend + "&augend=" + augend;

      // Fazer a requisição e obter a resposta
      HttpResponse<JsonNode> response = Unirest.get(url)
              .header("accept", "application/json")
              .asJson();

      // Verificar o código de status e o resultado da soma
      assertEquals(200, response.getStatus());
      assertEquals("444", response.getBody().getObject().getString("result"));
   }


   @Test
   public void testDivisionEndpoint() throws Exception {
      // Valores para a operação de divisão
      int dividend = 231;
      int divisor = 32;

      // URL do endpoint
      String url = "http://localhost:8080/calculator/basic/divide?dividend=" + dividend + "&divisor=" + divisor;

      // Fazer a requisição e obter a resposta
      HttpResponse<JsonNode> response = Unirest.get(url)
              .header("accept", "application/json")
              .asJson();

      // Verificar o código de status e o resultado da divisão
      assertEquals(200, response.getStatus());
      assertEquals("7", response.getBody().getObject().getString("result"));
   }

   @Test
   public void testMultiplicationEndpoint() throws Exception {
      // Valores para a operação de multiplicação
      int multiplicand = 213;
      int multiplier = 123;

      // URL do endpoint
      String url = "http://localhost:8080/calculator/basic/multiply?multiplicand=" + multiplicand + "&multiplier=" + multiplier;

      // Fazer a requisição e obter a resposta
      HttpResponse<JsonNode> response = Unirest.get(url)
              .header("accept", "application/json")
              .asJson();

      // Verificar o código de status e o resultado da multiplicação
      assertEquals(200, response.getStatus());
      assertEquals("26199", response.getBody().getObject().getString("result"));
   }

   @Test
   public void testSubtractionEndpoint() throws Exception {
      // Valores para a operação de subtração
      int minuent = 231;
      int subtrahend = 213231;

      // URL do endpoint
      String url = "http://localhost:8080/calculator/basic/subtract?minuent=" + minuent + "&subtrahend=" + subtrahend;

      // Fazer a requisição e obter a resposta
      HttpResponse<JsonNode> response = Unirest.get(url)
              .header("accept", "application/json")
              .asJson();

      // Verificar o código de status e o resultado da subtração
      assertEquals(200, response.getStatus());
      assertEquals("-212000", response.getBody().getObject().getString("result"));
   }

}