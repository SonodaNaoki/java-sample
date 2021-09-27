package com.example.demo.phistory.repository;

import com.example.demo.phistory.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {}
