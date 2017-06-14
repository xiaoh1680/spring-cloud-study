package com.xiaohui.redis.repo;

import com.xiaohui.redis.Entity.TestStringE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 辉 on 2017/3/19.
 */
@Repository
public interface StringRepository extends CrudRepository<TestStringE,String>{

}
