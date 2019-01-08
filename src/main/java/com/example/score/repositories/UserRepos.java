package com.example.score.repositories;

import com.example.score.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}