package com.ptarmigan.payment.service.impl;

import com.ptarmigan.payment.domain.VisaPay;
import com.ptarmigan.payment.mapper.VisaCardMapper;
import com.ptarmigan.payment.service.VisaPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisaPayServiceImpl implements VisaPayService {

    @Autowired
    private VisaCardMapper visaCardMapper;
    @Override
    public VisaPay findAll(String cardNumber) {
        return visaCardMapper.findAll(cardNumber);
    }

    @Override
    public void insertCreditCard(String cardNumber, String cardHolderName, Integer expirationMonth, Integer expirationYear, String cvv) {
        visaCardMapper.insertCreditCard(cardNumber, cardHolderName, expirationMonth, expirationYear, cvv);
    }


}
