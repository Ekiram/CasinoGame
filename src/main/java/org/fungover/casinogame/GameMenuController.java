package org.fungover.casinogame;

import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameMenuController {

    private final GameMenuController gameMenuRepository;

    public GameMenuController(GameMenuRepository gameMenuRepository) {
        this.gameMenuRepository = gameMenuRepository;
    }

    @GetMapping("/blackjack")
    public String getInfo(Model model) {
        model.addAttribute("activePage", "blackjack");
        return "blackjack";
    }

    @GetMapping("/highest score")
    public String getContavt(Model model) {

        model.addAttribute("activePage", "highest score");
        return "highest score";

    }
}








