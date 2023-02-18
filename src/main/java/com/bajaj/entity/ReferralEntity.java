package com.bajaj.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    @Temporal(TemporalType.DATE)
    private Date referredDate;
}
