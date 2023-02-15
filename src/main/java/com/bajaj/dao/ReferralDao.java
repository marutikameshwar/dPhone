package com.bajaj.dao;

import com.bajaj.entity.ReferralEntity;
import com.bajaj.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReferralDao extends JpaRepository<ReferralEntity,Integer> {
    ReferralEntity findById(int referrerId);
}
