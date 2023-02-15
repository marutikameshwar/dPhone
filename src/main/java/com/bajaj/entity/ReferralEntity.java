package com.bajaj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="referrals")
public class ReferralEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "referrer_id")
    private int referrerId;
    @Column(name = "referrer_code")
    private String referrerCode;
    @Column(name = "name")
    private String referralName;
    @Column(name = "email")
    private String referralEmail;
    @Column(name = "ph_no")
    private String referralPhoneNumber;
    @Column(name = "referred_date")
    private LocalDateTime referredDate;

    @Override
    public String toString() {
        return "ReferralEntity{" +
                "Id=" + Id +
                ", referrerId=" + referrerId +
                ", referralName='" + referralName + '\'' +
                ", referralEmail='" + referralEmail + '\'' +
                ", referralPhoneNumber='" + referralPhoneNumber + '\'' +
                ", referredDate='" + referredDate + '\'' +
                ", referrerCode='" + referrerCode + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getReferrerId() {
        return referrerId;
    }

    public void setReferrerId(int referrerId) {
        this.referrerId = referrerId;
    }

    public String getReferralName() {
        return referralName;
    }

    public void setReferralName(String referralName) {
        this.referralName = referralName;
    }

    public String getReferralEmail() {
        return referralEmail;
    }

    public void setReferralEmail(String referralEmail) {
        this.referralEmail = referralEmail;
    }

    public String getReferralPhoneNumber() {
        return referralPhoneNumber;
    }

    public void setReferralPhoneNumber(String referralPhoneNumber) {
        this.referralPhoneNumber = referralPhoneNumber;
    }

    public LocalDateTime getReferredDate() {
        return referredDate;
    }

    public void setReferredDate(LocalDateTime referredDate) {
        this.referredDate = referredDate;
    }

    public String getReferrerCode() {
        return referrerCode;
    }

    public void setReferrerCode(String referrerCode) {
        this.referrerCode = referrerCode;
    }

    public ReferralEntity(int id, int referrerId, String referralName, String referralEmail, String referralPhoneNumber, LocalDateTime referredDate, String referrerCode) {
        Id = id;
        this.referrerId = referrerId;
        this.referralName = referralName;
        this.referralEmail = referralEmail;
        this.referralPhoneNumber = referralPhoneNumber;
        this.referredDate = referredDate;
        this.referrerCode = referrerCode;
    }

    public ReferralEntity() {
    }
}
