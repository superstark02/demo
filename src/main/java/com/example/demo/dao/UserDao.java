package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserDao extends JpaRepository<User, String> {
    List<User> findByUserIdIn(List<String> userIds);
}
