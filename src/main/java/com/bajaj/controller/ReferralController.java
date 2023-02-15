package com.bajaj.controller;

//import com.bajaj.beans.ReferralBean;
import com.bajaj.beans.ReferralBean;
import com.bajaj.service.ReferralServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
