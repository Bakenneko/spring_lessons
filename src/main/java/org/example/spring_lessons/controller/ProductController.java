package org.example.spring_lessons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    private String testProductName;

    @GetMapping("/products")

    public ResponseEntity<List<String>> getProducts() {
        return ResponseEntity.ok(List.of(testProductName));

    }
    @Autowired
    public void setTestProductName(String testProductName) {
        this.testProductName = testProductName;
    }
}
