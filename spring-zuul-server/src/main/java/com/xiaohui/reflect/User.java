package com.xiaohui.reflect;

import lombok.Data;

/**
 * Created by 辉 on 2017/3/25.
 */
@Data
public class User {
    public static String level = "gaozhong";
    public String name;
    public String age;
    private String sex;

    public Integer judgeAge(Integer start, Integer age) {
        return start-age;
    }
}
