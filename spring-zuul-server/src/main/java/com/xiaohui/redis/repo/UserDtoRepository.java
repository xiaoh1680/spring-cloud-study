package com.xiaohui.redis.repo;

import com.xiaohui.redis.dto.UserDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 辉 on 2017/3/19.
 */
@Repository
public interface UserDtoRepository extends CrudRepository<UserDto,String>{

}
