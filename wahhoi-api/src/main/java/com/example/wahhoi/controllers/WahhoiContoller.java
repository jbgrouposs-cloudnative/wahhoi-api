package com.example.wahhoi.controllers;

import java.util.Optional;

import com.example.wahhoi.entities.Wahhoi;
import com.example.wahhoi.repositories.WahhoiJpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/wahhoi")
public class WahhoiContoller {

    @Autowired
    private WahhoiJpaRepository repository;

    @GetMapping()
    public String getWahhoi() {
        System.out.println("[GET] /v1/wahhoi");
        return "WAHHOI!";
    }

    @GetMapping("{id}")
    public String getWahhoi(@PathVariable("id") int id) {
        System.out.println("[GET] /v1/wahhoi/" + id);
        Optional<Wahhoi> wahhoi = this.repository.findById(id);
        if (wahhoi.isPresent()) {
            Wahhoi wahhoiObj = wahhoi.get();
            return wahhoiObj.getId() + " is " + wahhoiObj.getName() + " the WAHHOI!";
        } else {
            return "id(" + id + ") is not a WAHHOI...";
        }
    }

    @PostMapping()
    public String postWahhoi(@RequestBody Wahhoi body) {
        System.out.println("[POST] /v1/wahhoi");
        Wahhoi newWahhoi = this.repository.save(body);
        return newWahhoi.getName() + " will be WAHHOI!";
    }

    @PutMapping("{id}")
    public String putWahhoi(@PathVariable("id") int id, @RequestBody Wahhoi body) {
        System.out.println("[PUT] /v1/wahhoi/" + id);
        Optional<Wahhoi> w = this.repository.findById(id);
        if (w.isPresent()) {
            Wahhoi newWahhoi = this.repository.save(body);
            return newWahhoi.getId() + " is now " + newWahhoi.getName() + " the WAHHOI!";
        } else {
            return "id(" + id + ") is not a WAHHOI...";
        }
    }

    @DeleteMapping("{id}")
    public String deleteWahhoi(@PathVariable("id") int id) {
        System.out.println("[DELETE] /v1/wahhoi/" + id);
        Optional<Wahhoi> w = this.repository.findById(id);
        if (w.isPresent()) {
            this.repository.deleteById(id);
            return w.get().getName() + " expired WAHHOI!";
        } else {
            return "id(" + id + ") is not a WAHHOI...";
        }
    }
}
