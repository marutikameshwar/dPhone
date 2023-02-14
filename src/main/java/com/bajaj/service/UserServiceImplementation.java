package com.bajaj.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bajaj.beans.UserBean;
import com.bajaj.dao.UserDao;
import com.bajaj.entity.UserEntity;

import java.util.List;

@Service
public class UserServiceImplementation {
    @Autowired
    private UserDao userDao;

    public UserServiceImplementation(UserDao userDao) {
        this.userDao = userDao;
    }

    public ResponseEntity<UserBean> addUsers(UserBean userBean) {
        UserEntity userEntity=new UserEntity();
        BeanUtils.copyProperties(userBean , userEntity);
        userDao.save(userEntity);
        System.out.println("record Saved");
        return new ResponseEntity<UserBean>(userBean, HttpStatus.OK);
    }

    public List<UserEntity> allRecords() {
        return userDao.findAll();
    }
}