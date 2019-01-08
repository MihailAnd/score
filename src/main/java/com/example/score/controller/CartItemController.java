package com.example.score.controller;

import com.example.score.domain.CartItem;
import com.example.score.repositories.CartItemRepos;
import com.example.score.repositories.ProductRrepos;
import com.example.score.domain.Product;
import com.example.score.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CartItemController {

    @Autowired
    ProductRrepos productRrepos;

    @Autowired
    CartItemRepos cartItemRepos;

    @GetMapping("/menu")
    public String menu(Model model){
        Iterable<Product> products = productRrepos.findAll();
        model.addAttribute("products", products);
                return "menu";
    }

    @PostMapping("/menu")
    public String prod (
            @RequestParam Integer productAmount,
            @RequestParam Long productId,
            @AuthenticationPrincipal User user,
            Model model
    ){
        Iterable<Product> products = productRrepos.findAll();
        Product p = productRrepos.getOne(productId);
        CartItem cartItem = new CartItem();



        cartItem.setCart(user.getCart());
        cartItem.setProduct(p);
        cartItem.setProductAmount(productAmount);


        model.addAttribute("products", products);

        cartItemRepos.save(cartItem);

        return "/menu";
    }
}
