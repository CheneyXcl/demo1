package com.example.demo1.dao;

import com.example.demo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iUserDao extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}