package com.example.springtoyinf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/*
* 초기 패키지 설정 후 그냥 연습용. 프로젝트와 상관 없는 클래스
* */
@Controller
public class HelloController {

    @GetMapping("hello")
    //hello라는 url로 접속시 해당 컨트롤러로 접속
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!");
        return "webpage";
    }
}
