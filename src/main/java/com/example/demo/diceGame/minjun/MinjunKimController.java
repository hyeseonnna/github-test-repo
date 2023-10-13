package com.example.demo.diceGame.minjun;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/minjunkim")
public class MinjunKimController {

    @GetMapping("/test")
    public void justForTest(){
        //sout
        System.out.println("justForTest()");
        return;
    }
}
