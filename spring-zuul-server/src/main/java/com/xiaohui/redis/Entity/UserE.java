package com.xiaohui.redis.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * Created by 辉 on 2017/3/19.
 */
@RedisHash("users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserE {
    @Id
    private String id;
    private String name;
}
