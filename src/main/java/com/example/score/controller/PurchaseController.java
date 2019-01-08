package com.example.score.controller;

import com.example.score.repositories.CartItemRepos;
import com.example.score.domain.Purchase;
import com.example.score.domain.User;
import com.example.score.repositories.PurchaseRepos;
import com.example.score.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class PurchaseController {

    @Autowired
    private CartItemRepos cartItemRepos;
    @Autowired
    private PurchaseRepos purchaseRepos;
    @Autowired
    private CartService cartService;

    @GetMapping("/purchase")
    public String pur(
            @AuthenticationPrincipal User user,
            Model model){
        model.addAttribute("user", user);
               return "/purchase";
    }

    @PostMapping("/purchase")


    public String order(
                                @AuthenticationPrincipal User user,
                                @RequestParam String address,
                                @RequestParam String city,
                                @RequestParam Integer phonenumber,
                                @RequestParam String delivery,
                                @RequestParam String fullname
                                         ){



        Purchase purchase = new Purchase();
        purchase.setAddress(address);
        purchase.setCity(city);
        purchase.setClient(user);
        purchase.setPay(cartService.getSum(user));
        purchase.setPosition(cartItems);
        purchase.setPhonenumber(phonenumber);
        purchase.setDelivery(delivery);
        purchase.setFullname(fullname);
        purchase.setDateTime(LocalDateTime.now());

        purchaseRepos.save(purchase);

        return "/purchase";
    }

}

