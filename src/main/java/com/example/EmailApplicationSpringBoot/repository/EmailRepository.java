package com.example.EmailApplicationSpringBoot.repository;

import com.example.EmailApplicationSpringBoot.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email,Long> {

    @Query(
            value = "select count(*) from Email where from_email_id = ?1",
            nativeQuery = true
    )
    Long countEmail(String email);
}
