package com.example.score.repositories;

import com.example.score.domain.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepos extends CrudRepository <Purchase, Long> {
}
