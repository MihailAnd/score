package com.example.score.service;

import com.example.score.domain.CartItem;
import com.example.score.domain.User;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class CartService {

    public Integer getSum (User user){

        Iterable<CartItem> cartItems = user.getCart().getCartItems();

        Iterator<CartItem> itemIterator = cartItems.iterator();

        int totalPrice = 0;
        int Sum = 0;

        while (itemIterator.hasNext()){

            CartItem cartItem = itemIterator.next();
            totalPrice = (Sum + cartItem.getProduct().getPrice()) * cartItem.getProductAmount();


        }
        return totalPrice;
    }

}
