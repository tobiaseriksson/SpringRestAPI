package com.tsoft.playground.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    public Names names;


    @GetMapping(value="")
    public String help() {
        return "Please use GET /api/names to get a list of the N first names, or a GET /api/names/idx to get a specific name";
    }

    @GetMapping(value = "/names")
    public List<String> list() {
        return names.all().stream().limit(20).collect(Collectors.toList());
    }

    @GetMapping(value = "/names/{id}")
    public String specificName(@PathVariable("id") Long id) {
        return names.byIndex(id);
    }
}
