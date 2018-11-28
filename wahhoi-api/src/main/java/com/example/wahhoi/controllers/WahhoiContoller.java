package com.example.wahhoi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/wahhoi")
public class WahhoiContoller {

    @GetMapping()
    public String getWahhoiString() {
        return "WAHHOI!";
    }

    @GetMapping("{name}")
    public String getWahhoiString(@PathVariable("name") String name) {
        String n = name.substring(0, name.length() >= 20 ? 20 : name.length());
        return "\"" + n + "\" will be WAHHOI!";
    }
}
