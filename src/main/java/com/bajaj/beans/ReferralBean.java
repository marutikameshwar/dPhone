package com.bajaj.beans;

public class ReferralBean {
    private int referrerId;
    private String referralName;
    private String referralEmail;
    private String referralPhoneNumber;
    private String referredDate;
    public ReferralBean() {
    }
    public ReferralBean(int referrerId, String referralName, String referralEmail, String referralPhoneNumber,
            String referredDate) {
        this.referrerId = referrerId;
        this.referralName = referralName;
        this.referralEmail = referralEmail;
        this.referralPhoneNumber = referralPhoneNumber;
        this.referredDate = referredDate;
    }
    @Override
    public String toString() {
        return "ReferralBean [referrerId=" + referrerId + ", referralName=" + referralName + ", referralEmail="
                + referralEmail + ", referralPhoneNumber=" + referralPhoneNumber + ", referredDate=" + referredDate
                + "]";
    }
    public int getreferrerId() {
        return referrerId;
    }
    public void setreferrerId(int referrerId) {
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
    public String getreferredDate() {
        return referredDate;
    }
    public void setreferredDate(String referredDate) {
        this.referredDate = referredDate;
    }
    
}
