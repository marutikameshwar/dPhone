package com.bajaj.entity;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int userId;
    @Column(name="name")
    private String userName;
    @Column(name = "email")
    private String userEmail;
    @Column(name="password")
    private String userPassword;
    @Column(name = "referral_code")
    private String referralCode;
    @Column(name = "points")
    private int userPoints;
    @Column(name="created_at")
    @Temporal(TemporalType.DATE)
    private Date createdTime;
    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedTime;
    @Column(name = "ph_no")
    private String phoneNumber;

    @Override
    public String toString() {
        return "UserEntity{" +
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

    public UserEntity() {
    }
    public UserEntity(int userId, String userName, String userEmail, String userPassword, String referralCode,
            int userPoints, Date createdTime, Date updatedTime, String phoneNumber) {
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
    
}
