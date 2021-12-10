package com.hellokoding.account.repository;

import com.hellokoding.account.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    @Query("select u from User u where u.email = ?1")
    List<User> findByEmail(String email);
}
