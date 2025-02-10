package com.rest.api.controller;

import com.rest.api.pojo.Product;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class RestApiExampleController {
    @GetMapping("/getTest")
    public String getTest(@RequestParam String s) {
        System.out.println("in controller...");
              s=s.concat("sravani");

        return s;
    }
    @PostMapping("/product")
    public String product(@RequestBody Product p) {
        // In a real-world application, you would save the user to the database
        return "Product" + p.getColour()+ " with size " + p.getSize() + " created successfully!";
    }


}
