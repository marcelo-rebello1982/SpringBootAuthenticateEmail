package com.hellokoding.account.repository;

import com.hellokoding.account.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, String> {

    @Query("select v from VerificationToken v where v.user.email = ?1")
    List<VerificationToken> findByUserEmail(String email);

    @Query("select v from VerificationToken v where v.token = ?1")
    List<VerificationToken> findByToken(String token);
}
