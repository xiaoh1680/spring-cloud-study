package com.xiaohui.redis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * @Author: xiaohui
 * @Description:
 * @Date: Created in 2018/1/17 14:46
 * @Modified By:
 */
@RedisHash("users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    @Id
    private String id;
    private String name;
}
