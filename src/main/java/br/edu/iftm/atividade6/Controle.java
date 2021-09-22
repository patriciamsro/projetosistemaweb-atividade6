package br.edu.iftm.atividade6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controle {

    @RequestMapping("/")
    public String home() {
        System.out.println("----> passei por aqui - home");
        return "pagina1";
    }

    @RequestMapping("/pagina1")
    public String paginaInicial() {
        System.out.println("----> passei por aqui - 1");
        return "pagina1";
    }
    @RequestMapping("/pagina2")
    public String paginaSecundaria() {
        System.out.println("----> passei por aqui - 2");
        return "pagina2";
    }
}