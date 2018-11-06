package com.example.score.score.controller;

import com.example.score.score.domain.Product;
import com.example.score.score.domain.Purchase;
import com.example.score.score.domain.User;
import com.example.score.score.repositories.ProductRrepos;
import com.example.score.score.repositories.PurchaseRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class PurchaseController {

    @Autowired
    ProductRrepos productRrepos;

    @Autowired
    PurchaseRepos purchaseRepos;

    @GetMapping("/menu")
    public String menu(Model model){
        Iterable<Product> products = productRrepos.findAll();
        model.addAttribute("products", products);
                return "menu";
    }

    @PostMapping("/menu")
    public String pur (
            Purchase purchase,
            @RequestParam Integer productAmount,
            @RequestParam Product product,
            @AuthenticationPrincipal User user,
            Model model
    ){
        purchase.setCoast(product.getPrice()*productAmount);
        purchase.setDateTime(new LocalDateTime());
        purchase.setProduct(product);
        purchase.setUser(user);
        purchase.setProductAmount(productAmount);



        purchaseRepos.save(purchase);

        return "";
    }
}
