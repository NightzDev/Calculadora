package com.example.calculator.basic;

import com.example.calculator.Fisica.Deslocamento;
import com.example.calculator.Fisica.Tempo;
import com.example.calculator.Fisica.VelocidadeMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/fisica")
public class FisicaController {

   @Autowired
   private Deslocamento deslocamento;

   @Autowired
   private Tempo tempo;

   @Autowired
   private VelocidadeMedia velocidadeMedia;

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

}
