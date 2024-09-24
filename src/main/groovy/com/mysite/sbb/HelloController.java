package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/jump") // 헬로 메서드가 실행된다.
    @ResponseBody // hello 메서드의 출력값을 그대로 리턴한다.
    public String jump(){
        return "점프 투 스프링 부트";
    }
}

