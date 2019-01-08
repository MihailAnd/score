package com.example.score.repositories;

import com.example.score.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRrepos extends JpaRepository<Product, Long> {
Product getOne (Long id);
}
