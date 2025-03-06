package com.rest.api.controller;

import com.rest.api.entity.Product;
import com.rest.api.pojo.ProductPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.rest.api.service.ProductService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@RestController("/")
public class RestApiExampleController {
   @Autowired
    ProductService service;

    HashMap<String, ProductPojo> map = new HashMap<>();

    @GetMapping("/getTest")
    public String getTest(@RequestParam String s) {
        System.out.println("in controller...");
        s = s.concat("sravani");

        return s;
    }

    @PostMapping("/createProduct")
    public String createProduct(@RequestBody ProductPojo p) {

        service.createProduct(p);

        return "Product" + p.getColour() + " with size " + p.getSize() + " created successfully!";

    }

    @GetMapping("/getProduct")
    public ProductPojo getProduct(@RequestParam String id) {
         ProductPojo product=service.getProduct(id);

        return product;

    }

    @GetMapping("/getAllProduct")
    public List getAllProduct()
    {
        List<ProductPojo> productList=service.getAllProduct();
        return productList;
        }

    @DeleteMapping("/deleteProduct")
    public String deleteProduct(@RequestParam String id) {
        service.deleteProduct(id);
        return id;
    }
}

