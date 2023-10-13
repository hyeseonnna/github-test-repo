package com.example.demo.diceGame.ksb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/ksb")
public class ksbController {

    @GetMapping("/test")
    public void justForTest(){
        System.out.println("jusForTest()");
        return;
    }
}
