package com.example.calculator.basic;

import com.example.calculator.Fisica.Deslocamento;
import com.example.calculator.Fisica.Relatividade;
import com.example.calculator.Fisica.Tempo;
import com.example.calculator.Fisica.VelocidadeMedia;
import com.example.calculator.Juros.JurosComp;
import com.example.calculator.Juros.JurosSimples;
import com.example.calculator.PreCalc.Equation2nd;
import com.example.calculator.Triangle.HeronFormula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/fisica")
public class FisicaController {

   @Autowired
   private Deslocamento deslocamento;

   @Autowired
   private Tempo tempo;

   @Autowired
   private VelocidadeMedia velocidadeMedia;

   @Autowired
   private Relatividade relatividade;


   @GetMapping("/deslocamento")
   public double desloc(@RequestParam double si, @RequestParam double v,@RequestParam double dt){
      return deslocamento.Desloc(si, v,dt);
   }

   @GetMapping("/tempoVelocidade")
   public double tempoVelocidade(@RequestParam double ds, @RequestParam double vm){
      return tempo.itempo(ds,vm);
   }

   @GetMapping("/Vmedia")
   public double vmedia(@RequestParam double ds, @RequestParam double vm){
      return velocidadeMedia.Vmedia(ds,vm);
   }

   @GetMapping("/relatividade")
   public double relatividade(@RequestParam double Mass, @RequestParam double Vlight){
      return relatividade.Relatividade(Mass, Vlight);
   }

}
