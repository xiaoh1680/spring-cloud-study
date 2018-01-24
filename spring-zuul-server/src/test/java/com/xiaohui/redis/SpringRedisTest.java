package com.xiaohui.redis;

import com.xiaohui.redis.Entity.TestStringE;
import com.xiaohui.redis.Entity.UserE;
import com.xiaohui.redis.dto.UserDto;
import com.xiaohui.redis.repo.StringRepository;
import com.xiaohui.redis.repo.UserDtoRepository;
import com.xiaohui.redis.repo.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 辉 on 2017/3/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRedisTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private StringRepository stringRepository;
    @Autowired
    private UserDtoRepository userDtoRepository;

    @Test
    public void testRepositorySave() {
        List<UserE> list = new ArrayList<>();
        list.add(new UserE("1","xiaohui1"));
        list.add(new UserE("2","xiaohui2"));
        list.add(new UserE("3","xiaohui3"));
        list.add(new UserE("4","xiaohui4"));
        List<UserDto> list1 = new ArrayList<>();
        list1.add(new UserDto("5","xiaohui5"));
        list1.add(new UserDto("6","xiaohui6"));
        list1.add(new UserDto("7","xiaohui7"));
        userRepository.save(list);
        userDtoRepository.save(list1);
    }

    @Test
    public void stringRepositorySave() {
        List<TestStringE> list = new ArrayList<>();
        list.add(new TestStringE("test"));
        stringRepository.save(list);
    }

    @Test
    public void getUser() {
        List<UserE> list=(List<UserE>) userRepository.findOne("users");
         userDtoRepository.findAll();
    }

    @Test
    public void getRepository() {
        UserE list=userRepository.findOne("1");
        System.out.println(list.getName());
    }
}
