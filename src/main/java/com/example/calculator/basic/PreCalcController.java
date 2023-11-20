package com.example.calculator.basic;

import com.example.calculator.PreCalc.Equation2nd;
import com.example.calculator.model.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedList;
import java.util.List;

import static com.example.calculator.model.ResultBuilder.getResult;
import static com.example.calculator.model.ResultBuilder.getResultFromError;


@RestController
@RequestMapping("/Precalc")
public class PreCalcController {

   @Autowired
   private Equation2nd equation2nd;

   @GetMapping("/equation")
   public List<Double> equation(@RequestParam int a, @RequestParam int b, @RequestParam int c){
      return equation2nd.bhaskara(a,b,c);
   }

}
