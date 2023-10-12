package com.example.demo.diceGame;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/dice-game")
public class DiceGameController {

    @GetMapping("/roll-dice")
    public Integer rollDice () {
        return 0;
    }

    @GetMapping("/roll-n-computers")
    public void rollNComputers () {
        return;
    }

    @GetMapping("/check-winner")
    public String checkWinner () {
        return "winner";
    }
}
