package com.example.springtoyinf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    //hello라는 url로 접속시 해당 컨트롤러로 접속
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!");
        return "webpage";
    }
}
