package com.ptarmigan.payment.controller;

import com.ptarmigan.payment.service.VisaPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/visa")
@RestController
public class VisaCardController {

    @Autowired
    private VisaPayService visaPayService;

    @GetMapping("find_all")
    public Object findAll(@RequestParam("number") String cardNumber){
        System.out.println("adwfefefsewfwe0"+visaPayService.findAll(cardNumber));
        return visaPayService.findAll(cardNumber);
    }
}
