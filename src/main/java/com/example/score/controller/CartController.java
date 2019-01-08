package com.example.score.controller;

import com.example.score.domain.CartItem;
import com.example.score.domain.Cart;
import com.example.score.domain.User;
import com.example.score.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
    @Autowired
    CartService cartService;

    @GetMapping("/cart")
    public String cart(
            @AuthenticationPrincipal User user,
            Model model){

        Cart c = user.getCart();
        Iterable<CartItem> cartItems = c.getCartItems();
        Integer sum = cartService.getSum(user);



        model.addAttribute("cartItems", cartItems);
        model.addAttribute("sum", sum);


        return "cart";
    }

}
