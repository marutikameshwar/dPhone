package com.bajaj.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReferralBean {
    private int referrerId;
    private String referralName;
    private String referralEmail;
    private String referralPhoneNumber;
    private LocalDateTime referredDate;


}
