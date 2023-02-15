package com.bajaj.dao;

import com.bajaj.entity.ReferralEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReferralDao extends JpaRepository<ReferralEntity,Integer> {
}
