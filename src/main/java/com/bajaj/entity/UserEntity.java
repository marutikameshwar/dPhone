package com.bajaj.entity;

import java.sql.Date;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    
}
