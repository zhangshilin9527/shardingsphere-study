package com.xiaolinzi.shardingsphere.study.service;

import com.xiaolinzi.shardingsphere.study.entity.TestUser02;
import com.xiaolinzi.shardingsphere.study.mapper.TestUser02Mapper;
import com.xiaolinzi.shardingsphere.study.mapper.TestUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * @author ：zhangshilin
 * @date ：2021-01-25 11:05
 */
@Service
public class UserService {

    @Resource
    private TestUser02Mapper testUser02Mapper;
    @Resource
    private TestUserMapper testUserMapper;

    public int saveUser() {
        for (int i = 0; i<200 ;i++ ) {
            TestUser02 user02 = new TestUser02();
            user02.setId(Integer.parseInt(getRandomNumber(8)));
            user02.setUserName("小"+getRandomNumber(8));
            user02.setUserId("小"+getRandomNumber(8));
             testUser02Mapper.insert(user02);
        }
        return 1;
    }

    public List<TestUser02> selectAll(){
        List<TestUser02> testUser02s = testUserMapper.selectAll();
        return testUser02s;
    }
    public TestUser02 selectById(){
       TestUser02 testUser02 = testUserMapper.selectById(123);
        return testUser02;
    }
    public  String getRandomNumber(int count) {
        Random random = new Random();
        StringBuffer buff = new StringBuffer();
        while (count-- != 0) {
            buff.append(random.nextInt(9));
        }
        return buff.toString();
    }
}
