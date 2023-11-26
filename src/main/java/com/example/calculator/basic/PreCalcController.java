package com.example.calculator.basic;

import com.example.calculator.Juros.JurosComp;
import com.example.calculator.Juros.JurosSimples;
import com.example.calculator.Polinomios.Polinomio;
import com.example.calculator.PreCalc.Equation2nd;
import com.example.calculator.Triangle.HeronFormula;
import com.example.calculator.model.ApiResult;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

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

   @Autowired
   private JurosComp jurosComp;

   @Autowired
   private JurosSimples jurosSimples;

   @Autowired
   private HeronFormula heronFormula;

   @Autowired
   private Polinomio polinomio;

   @GetMapping("/equation")
   public List<Double> equation(@RequestParam int a, @RequestParam int b, @RequestParam int c){
      return equation2nd.bhaskara(a,b,c);
   }

   @GetMapping("/juros")
   public List<Float> JurosSimples(@RequestParam float p, @RequestParam float r, @RequestParam float t){
      return jurosSimples.JurosSimples(p,r,t);
   }

   @GetMapping("/juroscomposto")
   public double JurosComposto(@RequestParam double p, @RequestParam double t, @RequestParam double r, @RequestParam double n){
      return jurosComp.JurosComposto(p,t,r,n);
   }

   @GetMapping("/heron")
   public double HeronFormula(@RequestParam double xA, @RequestParam double xB, @RequestParam double xC, @RequestParam double yA, @RequestParam double yB, @RequestParam double yC){
      return heronFormula.HeronFormula(xA, xB, xC, yA, yB, yC);
   }

   @GetMapping("/polinomios")
   public List<String> PolinomioEndpoint(@RequestParam double[] A, @RequestParam double[] B, int x){
      return polinomio.PolinomiosService(A,B,x);
   }
}
