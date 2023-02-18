package com.bajaj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bajaj.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<UserEntity,Integer>{
    @Query("select q from UserEntity q where q.userEmail=:mail")
    public String findByEmail(String mail);
}