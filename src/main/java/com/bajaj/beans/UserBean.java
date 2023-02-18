package com.bajaj.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBean {
    private int userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String referralCode;
    private int userPoints;
    private Date createdTime;
    private Date updatedTime;
    private String phoneNumber;

}
