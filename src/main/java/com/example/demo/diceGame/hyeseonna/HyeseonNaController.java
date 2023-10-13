package com.example.demo.diceGame.hyeseonna;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//log/debug 혹은 log.info()로 디버깅 메세지 출력 지원
@Slf4j
@RestController
@RequestMapping("/hyeseonna")
public class HyeseonNaController {
    @GetMapping("/test")
    public void justForTest(){
        System.out.println("justForTest()");
        return;
    }
}
