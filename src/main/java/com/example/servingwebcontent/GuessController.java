package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class GuessController {
    private Guess guess;

    @GetMapping("/guess")
    public String guessForm(Model model, int id) {

        model.addAttribute("guess", guess);
        return "guess";
    }

    @PostMapping("/guess")
    public String guessSubmit( int number, Model model) {

        System.out.println(guess.getNumber_real());
        if (guess.isCorrect(number)) {
            model.addAttribute("Win", guess.scoreEnd());
            return "victory";
        }
        guess.lose();
        model.addAttribute("guess", guess);

        return "guess";
    }
    @GetMapping("/guess-reset")
    public String reset(int id, Model model) {
        System.out.println("Id:" + id);
        guess = new Guess(id);

        model.addAttribute("guess", guess);
        return "guess.html";
    }
}
