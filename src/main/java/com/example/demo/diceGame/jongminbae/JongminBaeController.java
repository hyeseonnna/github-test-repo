package com.example.demo.diceGame.jongminbae;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
// Frontend와 데이터를 주고 받기 위해 사용함
// 부가적으로 입력해야하는 번거로운 작업들을 최소화 할 수 있음
@RestController
@RequestMapping("/jongminbae")
public class JongminBaeController {

    @GetMapping("/test")
    public void justForTest(){
        System.out.println("justForTest");

        return;
    }
}
