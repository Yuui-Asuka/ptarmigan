package com.ptarmigan.datamiddleware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RedisCacheTest {

    private final StringRedisTemplate stringRedisTemplate;

    private final RedisTemplate<String, String> redisTemplate;

    @Autowired
    public RedisCacheTest(StringRedisTemplate stringRedisTemplate, RedisTemplate redisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
        this.redisTemplate = redisTemplate;
    }

    // 存储字符串到 Redis
    public void setValue(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    // 从 Redis 中获取字符串
    public String getValue(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
    //在redis列表当中存储数据
    public void saveList(String key, String value) {
        redisTemplate.opsForList().leftPush(key,value);
    }
    //在redis集合当中存储数据
    public void saveSet(String key, String value) {
        redisTemplate.opsForSet().add(key, value);
    }
    //在redis存储hash类型的值
    public void saveHash(String key, String dataKey, String dataValue){
        redisTemplate.opsForHash().put(key, dataKey, dataValue);
    }
}
