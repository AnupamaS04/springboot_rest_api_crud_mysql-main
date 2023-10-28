package com.Bank.Rest.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bank.Rest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> 
{
    Optional<User> findByAccountNumber(String accountNumber);
}


