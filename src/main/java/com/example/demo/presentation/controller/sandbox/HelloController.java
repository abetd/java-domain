package com.example.demo.presentation.controller.sandbox;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String root(Model model) {
        model.addAttribute("message", "helloworld");
        return "sandbox/hello";
    }
}
