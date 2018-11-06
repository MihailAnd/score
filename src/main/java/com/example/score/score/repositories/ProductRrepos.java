package com.example.score.score.repositories;

import com.example.score.score.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRrepos extends CrudRepository<Product, Long> {
List<Product> findByTitle(String title);
}
