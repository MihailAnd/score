package com.example.score.score.controller;

import com.example.score.score.domain.Product;
import com.example.score.score.repositories.ProductRrepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private ProductRrepos productRrepos;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {
        return "greeting";
    }

    @GetMapping("/hi")
    public String hi
            (Map<String, Object> model){
        Iterable<Product> products = productRrepos.findAll();

        model.put("products", products);
        return "hi";
    }

    @PostMapping("/hi")
    public String add(@RequestParam String title,
                      @RequestParam String description,
                              @RequestParam Integer price,
                              @RequestParam Integer amount,
                      Map<String, Object> model){
        Product p = new Product(title, description, price,amount);

        productRrepos.save(p);

        Iterable<Product> products = productRrepos.findAll();

        model.put("products", products);

        return "hi";

    }


}
