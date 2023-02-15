package com.bajaj.service;

import com.bajaj.beans.ReferralBean;
import com.bajaj.dao.ReferralDao;
import com.bajaj.entity.ReferralEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReferralServiceImplementation {
    @Autowired
    private ReferralDao referralDao;
    public ResponseEntity <String> addReferral(ReferralBean referralBean)
    {
        ReferralEntity referralEntity=new ReferralEntity();
        BeanUtils.copyProperties(referralBean,referralEntity);
        referralDao.save(referralEntity);
        return new ResponseEntity<String>("user added Successfully",HttpStatus.OK);

    }
    public ResponseEntity <ReferralBean> editReferral(ReferralBean referralBean)
    {
        ReferralEntity referralEntity = referralDao.findById(referralBean.getReferrerId());
        referralEntity.setReferralName(referralBean.getReferralName());
        referralEntity.setReferralEmail(referralBean.getReferralEmail());
        referralEntity.setReferralPhoneNumber(referralBean.getReferralPhoneNumber());
        ReferralBean bean=new ReferralBean();
        BeanUtils.copyProperties(referralEntity,bean);
        return new ResponseEntity<ReferralBean>(bean, HttpStatus.OK);

    }
//    public ResponseEntity<List<ReferralBean>> allReferral()
//    {
//
//    }
}
