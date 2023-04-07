package com.cursed.Cursed.repository;

import com.cursed.Cursed.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}

