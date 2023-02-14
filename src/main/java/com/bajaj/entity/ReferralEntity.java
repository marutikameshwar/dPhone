package com.bajaj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="referrals")
public class ReferralEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Generator")
    private int Id;
    @Column(name = "referrer_id")
    private int referrerId;
    @Column(name = "name")
    private String referralName;
    @Column(name = "email")
    private String referralEmail;
    @Column(name = "ph_no")
    private String referralPhoneNumber;
    @Column(name = "referred_date")
    private String referredDate;
    @Column(name = "referrer_code")
    private String referrerCode;
    
}
