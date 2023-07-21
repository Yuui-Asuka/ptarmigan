package com.ptarmigan.usermodule.controller;

import com.ptarmigan.payment.domain.VisaPay;
import com.ptarmigan.usermodule.domain.UserPay;
import com.ptarmigan.usermodule.service.VisaPayService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("api/v1/user_pay")
public class VisaPayController {
    @Autowired
    private VisaPayService2 visaPayService2;
    @RequestMapping("save")
    public Object save(String number){
        VisaPay visaPay = visaPayService2.findByNumber(number);
        String holderName = visaPay.getCardHolderName();
        String cardNumber = visaPay.getCardNumber();

        UserPay userPay = new UserPay();

        userPay.setCardHolderName(holderName);
        userPay.setCardNumber(cardNumber);
        return userPay;
    }
}
