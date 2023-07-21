package com.ptarmigan.datamiddleware.controller;

import com.ptarmigan.datamiddleware.service.RedisCacheTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/redis")
public class RedisController {

    private final RedisCacheTest redisCacheTest;

    @Autowired
    public RedisController(RedisCacheTest redisCacheTest) {
        this.redisCacheTest = redisCacheTest;
    }

    @GetMapping("/set")
    public String setRedisValue(@RequestParam String key, @RequestParam String value) {
        redisCacheTest.setValue(key, value);
        return "Data stored in Redis successfully.";
    }

    @GetMapping("/get")
    public String getRedisValue(@RequestParam String key) {
        String value = redisCacheTest.getValue(key);
        return "Value from Redis: " + value;
    }
}
