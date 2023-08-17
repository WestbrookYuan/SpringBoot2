package com.yty.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author yty
 * @version 1.0
 * @since 1.0
 **/

@Configuration
public class RedisConfiguration {
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<String,Object>();
        template.setConnectionFactory(factory);


        //Json序列化配置
        Jackson2JsonRedisSerializer<Object> Jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
        ObjectMapper mp = new ObjectMapper();
        mp.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        mp.activateDefaultTyping(mp.getPolymorphicTypeValidator());
        Jackson2JsonRedisSerializer.serialize(mp);

        //Spring的序列化
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        //key采用String的序列化方式
        template.setKeySerializer(stringRedisSerializer);
        //hash的key也采用string的序列化方式
        template.setHashKeySerializer(stringRedisSerializer);
        //valye的序列化方式采用的是jackson
        template.setValueSerializer(Jackson2JsonRedisSerializer);
        //hash的value序列化方式采用jackson
        template.setHashKeySerializer(Jackson2JsonRedisSerializer);
        template.afterPropertiesSet();


        return template;
    }


}
