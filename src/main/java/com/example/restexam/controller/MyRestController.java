package com.example.restexam.controller;

import com.example.restexam.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyRestController {
    @GetMapping("/api/greeting")
    public Map<String, String> greet(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        Map<String, String> map = new HashMap<>();
        map.put("message","Hello" + name + "!");

        return map;
    }

    @GetMapping(value = "/productjson/{id}", produces = "application/json")
    public Product getProductAsJson(@PathVariable("id") Long id) {


        return new Product(id, "pen", 9.99);
    }

    @GetMapping(value = "/productxml/{id}", produces = "application/xml")
    public Product getProductAsXml(@PathVariable("id") Long id) {


        return new Product(id, "pen", 9.99);
    }
}
