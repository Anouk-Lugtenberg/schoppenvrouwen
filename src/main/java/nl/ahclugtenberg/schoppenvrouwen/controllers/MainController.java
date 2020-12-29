package nl.ahclugtenberg.schoppenvrouwen.controllers;

import nl.ahclugtenberg.schoppenvrouwen.model.Game;
import nl.ahclugtenberg.schoppenvrouwen.service.CardDeckService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/cards")
public class MainController {
    CardDeckService cardDeckService;

    @PostMapping(path="/createGame")
    public @ResponseBody
    String createGame() {
        Game game = new Game();
        game.setCardDeck(cardDeckService.createCardDeck52CardsAnd2Jokers());
        return "created";
    }
}
