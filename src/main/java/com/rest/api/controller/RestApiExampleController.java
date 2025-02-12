package com.rest.api.controller;

import com.rest.api.pojo.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@RestController("/")
public class RestApiExampleController {

    HashMap<String, Product> map = new HashMap<>();

    @GetMapping("/getTest")
    public String getTest(@RequestParam String s) {
        System.out.println("in controller...");
        s = s.concat("sravani");

        return s;
    }

    @PostMapping("/createProduct")
    public String createProduct(@RequestBody Product p) {


        // Adding key-value pairs
        map.put(p.getProductId(), p);


        return "Product" + p.getColour() + " with size " + p.getSize() + " created successfully!";
    }

    @GetMapping("/getProduct")
    public Product getProduct(@RequestParam String id) {
        Product product = map.get(id);
        return product;

    }
    @GetMapping("/getAllProduct")
    public Collection<Product> getAllProduct()
    {
        return map.values();
    }

    @DeleteMapping("/deleteProduct")
    public String deleteProduct(@RequestParam String id) {
        if (map.containsKey(id)) {
            Product p = map.remove(id);
            return "Product Id " + p.getProductId() + " deleted successfully.";
        } else {
            return "Product Id is Not available" ;
        }
    }
}

