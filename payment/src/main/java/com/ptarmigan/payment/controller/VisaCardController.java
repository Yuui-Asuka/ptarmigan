package com.ptarmigan.payment.controller;

import com.ptarmigan.payment.service.VisaPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/visa")
@RestController
public class VisaCardController{

    @Autowired
    private VisaPayService visaPayService;


    @GetMapping("insert")
    public void insertCreditCard(@RequestParam("number") String cardNumber,
                                 @RequestParam("holder_number") String cardHolderName,
                                 @RequestParam("month") Integer expirationMonth,
                                 @RequestParam("year") Integer expirationYear,
                                 @RequestParam("cvv") String cvv){
        visaPayService.insertCreditCard(cardNumber, cardHolderName, expirationMonth, expirationYear, cvv);

    }

    @GetMapping("find_all")
    public Object findAll(@RequestParam("number") String cardNumber){
        System.out.println("adwfefefsewfwe0"+visaPayService.findAll(cardNumber));
        return visaPayService.findAll(cardNumber);
    }
}
