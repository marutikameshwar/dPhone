package com.bajaj.beans;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

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
    public UserBean(int userId, String userName, String userEmail, String userPassword, String referralCode, int userPoints, Date createdTime, Date updatedTime, String phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.referralCode = referralCode;
        this.userPoints = userPoints;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.phoneNumber = phoneNumber;
    }

    public UserBean() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public int getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(int userPoints) {
        this.userPoints = userPoints;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", referralCode='" + referralCode + '\'' +
                ", userPoints=" + userPoints +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
