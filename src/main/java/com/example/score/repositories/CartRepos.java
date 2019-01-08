package com.example.score.repositories;

import com.example.score.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepos extends JpaRepository<Cart, Long> {
}
