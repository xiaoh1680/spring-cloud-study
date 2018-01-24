package com.xiaohui.redis.converter;

import com.xiaohui.redis.Entity.UserE;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * @task
 * @description
 * @auth panda
 * @create 2017/4/1 9:23
 */
public class ServiceConverter {

    /**
     *key转换定义
     */
    public static class UserEToBytesConverter implements Converter<String, byte[]>
    {
        private Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(UserE.class);
        @Override
        public byte[] convert(String source) {
            return serializer.serialize(source);
        }
    }

    /**
     *key转换定义
     */
    public static class UserEToStringConverter implements Converter<String, String>
    {
        @Override
        public String convert(String source) {
            return source.toString();
        }
    }

    /**
     *key转换定义
     */
    public static class BytesToUserEConverter implements Converter<byte[],String>
    {
        private Jackson2JsonRedisSerializer  serializer = new Jackson2JsonRedisSerializer(UserE.class);
        @Override
        public String convert(byte[] source) {
           return (String)serializer.deserialize(source);
        }
    }

}
