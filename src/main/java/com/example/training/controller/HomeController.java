package com.example.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private static final String MEMBER_1 = "ここに名前を記入";
    private static final String MEMBER_2 = "ここに名前を記入";
    private static final String MEMBER_3 = "ここに名前を記入";

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("member1", MEMBER_1);
        model.addAttribute("member2", MEMBER_2);
        model.addAttribute("member3", MEMBER_3);
        return "index";
    }

    @GetMapping("/member1")
    public String member1() {
        return "kajimura";
    }

    @GetMapping("/member2")
    public String member2() {
        return "hamano";
    }

    @GetMapping("/member3")
    public String member3() {
        return "yoshimura";
    }
}
