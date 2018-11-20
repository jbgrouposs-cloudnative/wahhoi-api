package com.example.wahhoi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        return "\"" + name + "\" will be WAHHOI!";
    }
}
