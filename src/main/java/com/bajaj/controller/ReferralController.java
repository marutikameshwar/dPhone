package com.bajaj.controller;

//import com.bajaj.beans.ReferralBean;
import com.bajaj.beans.ReferralBean;
import com.bajaj.entity.ReferralEntity;
import com.bajaj.service.ReferralServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/referal")
public class ReferralController {
    @Autowired
    private ReferralServiceImplementation referralServiceImplementation;
    @GetMapping("/add")
    public ResponseEntity<String> addReferral(@RequestBody ReferralBean referralBean)
    {
        return referralServiceImplementation.addReferral(referralBean);
    }
    @PostMapping("/edit")
    public ResponseEntity<ReferralBean> editReferral(@RequestBody ReferralBean referralBean)
    {
        return referralServiceImplementation.editReferral(referralBean);
    }
//    @PostMapping("/allreferral")
//    public ResponseEntity<ReferralBean> allReferral()
//    {
//        return referralServiceImplementation.allReferral();
//    }
}
