package com.ptarmigan.usermodule.controller;

import com.ptarmigan.usermodule.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.cache.RedisCache;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user_cache")
public class CacheController {
    @Autowired
    private CacheService cacheService;


    @GetMapping("/set")
    public String setRedisValue(@RequestParam String key, @RequestParam String value) {
        cacheService.setRedisString(key, value);
        return "Data stored in Redis successfully.";
    }

    @GetMapping("/get")
    public String getRedisValue(@RequestParam String key) {
        String value = cacheService.getRedisString(key);
        return "Value from Redis: " + value;
    }

}
