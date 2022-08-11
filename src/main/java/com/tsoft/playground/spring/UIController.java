package com.tsoft.playground.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UIController {

    @GetMapping("/ui")
    public String ui(Model model) {
        System.err.println("asking for index.html...");
        return "index"; // reads src/main/resources/templates/index.html
    }

    /**
     * Endpoint /help that provides som helpful text
     * NOTE! that this endpoint is made available to all / no security, through the SecurityConfig class
     * @return
     */
    @GetMapping(value="/help")
    @ResponseBody  // required to return a STRING as HTML, and not try to find a template HTML file
    public String help() {
        return "You can reach the web page here; <a href=\"http://localhost:8082/ui\">http://localhost:8082/ui</a>, or you can call the REST API directly e.g GET /api/names to get a list of the N first names, or a GET /api/names/-index- to get a specific name";
    }
}
