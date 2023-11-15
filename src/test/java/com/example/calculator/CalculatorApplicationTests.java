package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorApplicationTests {

   @Test
   public void testAdd() {
      // Arrange
      BigInteger augend = new BigInteger("5");
      BigInteger addend = new BigInteger("3");

      // Act
      BigInteger result = augend.add(addend);

      // Assert
      assertEquals(new BigInteger("8"), result);
   }

   @Test
   public void testSubtract() {
      // Arrange
      BigInteger minuend = new BigInteger("8");
      BigInteger subtrahend = new BigInteger("3");

      // Act
      BigInteger result = minuend.subtract(subtrahend);

      // Assert
      assertEquals(new BigInteger("5"), result);
   }

   @Test
   public void testMultiply() {
      // Arrange
      BigInteger multiplicand = new BigInteger("4");
      BigInteger multiplier = new BigInteger("3");

      // Act
      BigInteger result = multiplicand.multiply(multiplier);

      // Assert
      assertEquals(new BigInteger("12"), result);
   }

   @Test
   public void testDivide() {
      // Arrange
      BigInteger dividend = new BigInteger("15");
      BigInteger divisor = new BigInteger("3");

      // Act
      BigInteger result = dividend.divide(divisor);

      // Assert
      assertEquals(new BigInteger("5"), result);
   }

}
