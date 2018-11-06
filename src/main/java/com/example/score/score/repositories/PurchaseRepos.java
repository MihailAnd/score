package com.example.score.score.repositories;

import com.example.score.score.domain.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepos extends CrudRepository<Purchase, Long> {
}
