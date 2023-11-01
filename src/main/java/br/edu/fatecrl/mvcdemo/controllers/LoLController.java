package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.JogadorLoL;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/lol")
public class LoLController {
    private static final List<JogadorLoL> jogadores = new ArrayList<>();

    public LoLController() {
        jogadores.add(new JogadorLoL("Pedro", "Yasuo", 5, 10));
        jogadores.add(new JogadorLoL("Ana", "Ahri", 8, 15));
        jogadores.add(new JogadorLoL("Lucas", "Darius", 6, 12));
    }

    @GetMapping
    public String getJogadores(Model model) {
        model.addAttribute("jogadores", jogadores);
        return "jogadores_lol";
    }
}
