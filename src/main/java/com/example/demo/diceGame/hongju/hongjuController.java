package com.example.demo.diceGame.hongju;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/hongju")
public class hongjuController {
    @GetMapping("/test")
    public void justForTest(){
        System.out.println("justForTest()");    

        return;
    }
}
