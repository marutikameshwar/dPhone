package com.bajaj.controller;

import com.bajaj.beans.UserBean;
import com.bajaj.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bajaj.service.UserServiceImplementation;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserServiceImplementation userServiceImplementation;

    @PostMapping("addUsers")
    public ResponseEntity<UserBean> addUsers(@RequestBody UserBean userBean){
        return userServiceImplementation.addUsers(userBean);
    }
    @GetMapping("allUsers")
    public List<UserEntity> allRecords(){
        List<UserEntity> msg=userServiceImplementation.allRecords();
        return msg;
    }
    @RequestMapping("*")
    public String error(){
        return "ERROR";
    }
}
