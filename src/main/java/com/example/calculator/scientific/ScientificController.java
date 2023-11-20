package com.example.calculator.scientific;

import static com.example.calculator.model.ResultBuilder.getResult;
import static com.example.calculator.model.ResultBuilder.getResultFromError;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.model.ApiResult;


@Controller
@RequestMapping("/scientific")
public class ScientificController {

   @Autowired
   private ScientificCalculatorService _scientificCalculator;

   public ScientificController( ScientificCalculatorService scientificCalculator) {
      _scientificCalculator = scientificCalculator;
   }

   @GetMapping("/square/{factor}")
   public ApiResult square(@PathVariable BigDecimal factor ) {
      return getResult(factor.multiply(factor));
   }

   @GetMapping("/factorial/{number}")
   public ApiResult factorial(@PathVariable int number ) {
      try {
         BigInteger factorial = _scientificCalculator.calculateFactorial(number);
         return getResult(factorial);
      }
      catch ( ArithmeticException e ) {
         return getResultFromError(e.getMessage());
      }
   }

   @GetMapping("/prime/{number}")
   public ApiResult prime(@PathVariable long number ) {
      return getResult(_scientificCalculator.isPrime(number));
   }
}
