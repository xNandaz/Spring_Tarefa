package br.edu.fatecrl.mvcdemo.controllers;
import br.edu.fatecrl.mvcdemo.models.JogadorLoL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/lol")
public class DadosController {
    private static final List<JogadorLoL> jogadores = new ArrayList<>();

    public DadosController() {
        jogadores.add(new JogadorLoL("Pedro", "Yasuo", 5, 10));
        jogadores.add(new JogadorLoL("Ana", "Ahri", 8, 15));
        jogadores.add(new JogadorLoL("Lucas", "Darius", 6, 12));
    }

    @GetMapping
    public List<JogadorLoL> getJogadores() {
        return jogadores;
    }
}
