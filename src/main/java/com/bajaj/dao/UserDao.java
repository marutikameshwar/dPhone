package com.bajaj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bajaj.entity.UserEntity;

public interface UserDao extends JpaRepository<UserEntity,Integer>{

}