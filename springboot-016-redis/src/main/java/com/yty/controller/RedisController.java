package com.yty.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/
@RestController
public class RedisController {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @PostMapping("/redis/addstring")
    public String addToRedis(String field,String value){
        redisTemplate.opsForValue().set("wjs", "yty");
        return "Redis String added";
    }

    @GetMapping("/redis/getdata")
    public String getData(String k){
        ValueOperations<String, Object> stringObjectValueOperations = redisTemplate.opsForValue();
        String wjs = (String) stringObjectValueOperations.get("wjs");
        System.out.println(wjs);
        return wjs;
    }
}
