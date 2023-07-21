package com.ptarmigan.usermodule.service;

import com.ptarmigan.payment.domain.VisaPay;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "middleware")
public interface CacheService {

    @GetMapping("api/v1/redis/set")
    void setRedisString(@RequestParam("key") String key, @RequestParam("value") String value);

    @GetMapping("api/v1/redis/get")
    String getRedisString(@RequestParam("key") String key);
}
