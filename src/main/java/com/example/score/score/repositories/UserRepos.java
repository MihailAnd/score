package com.example.score.score.repositories;

import com.example.score.score.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}