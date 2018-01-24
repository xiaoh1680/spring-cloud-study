package com.xiaohui.redis.converter;

import com.xiaohui.redis.dto.UserDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * @task
 * @description
 * @auth panda
 * @create 2017/4/1 9:23
 */
public class CustomerConverter {

    /**
     *key转换定义
     */
    public static class UserDtoToBytesConverter implements Converter<UserDto, byte[]>
    {
        private Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(UserDto.class);
        @Override
        public byte[] convert(UserDto source) {
            return serializer.serialize(source);
        }
    }

    /**
     *key转换定义
     */
    public static class UserDtoToStringConverter implements Converter<UserDto, String>
    {
        @Override
        public String convert(UserDto source) {
            return source.toString();
        }
    }

    /**
     *key转换定义
     */
    public static class BytesToUserDtoConverter implements Converter<byte[],UserDto>
    {
        private Jackson2JsonRedisSerializer  serializer = new Jackson2JsonRedisSerializer(UserDto.class);
        @Override
        public UserDto convert(byte[] source) {
           return (UserDto)serializer.deserialize(source);
        }
    }

}
