package com.statecapitals3.statecapitals3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "{^((?!api).)*$}")
    public String redirectIfNotApi() {
        return "forward:/";
    }

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
