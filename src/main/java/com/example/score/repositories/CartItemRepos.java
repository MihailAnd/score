package com.example.score.repositories;

import com.example.score.domain.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepos extends JpaRepository<CartItem, Long> {
//List<CartItem> findCartItemByUserAccount(User user);
}
