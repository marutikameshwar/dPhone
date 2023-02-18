package com.bajaj.dao;

import com.bajaj.entity.ReferralEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReferralDao extends JpaRepository<ReferralEntity,Integer> {
    ReferralEntity findById(int referrerId);

    @Query("Select r from ReferralEntity r where r.referrerId=:id")
    public List<ReferralEntity> allReferralById(int id);
    @Query("select r from ReferralEntity r where r.referralEmail=:mail")
    public String findByEmail(String mail);
}
