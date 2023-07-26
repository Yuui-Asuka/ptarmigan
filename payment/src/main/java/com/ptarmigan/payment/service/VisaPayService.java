package com.ptarmigan.payment.service;

import com.ptarmigan.payment.domain.VisaPay;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface VisaPayService {

    VisaPay findAll(String cardNumber);

    void insertCreditCard(String cardNumber,
                          String cardHolderName,
                          Integer expirationMonth,
                          Integer expirationYear,
                          String cvv);
}
