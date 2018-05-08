package com.kelon.demo1.Repository;

import com.kelon.demo1.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iUserDao extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}