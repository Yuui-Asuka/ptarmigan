package com.ptarmigan.usermodule.service;

import com.ptarmigan.payment.domain.VisaPay;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "payment")
public interface VisaPayService2 {
    @GetMapping("api/v1/visa/find_all")
    VisaPay findByNumber(@RequestParam("number") String number);
}
