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
import com.bajaj.util.ReferalCodeGenerator;

@Service
public class UserServiceImplementation {
    @Autowired
    private UserDao userDao;

    public UserServiceImplementation(UserDao userDao) {
        this.userDao = userDao;
    }

    public ResponseEntity<UserBean> addUsers(UserBean userBean) {
        UserEntity userEntity = new UserEntity();
        String referalCode = ReferalCodeGenerator.code(8);
        try {
            userBean.setReferralCode(referalCode);
            userBean.setUserPoints(0);
            BeanUtils.copyProperties(userBean , userEntity);
            userDao.save(userEntity);
            System.out.println("record Saved");
            return new ResponseEntity<UserBean>(userBean, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<UserBean>(userBean,HttpStatus.CONFLICT);
        }
    }

    public List<UserEntity> allRecords() {
        return userDao.findAll();
    }
}
