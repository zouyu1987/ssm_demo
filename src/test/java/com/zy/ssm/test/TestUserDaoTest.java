package com.zy.ssm.test;

import com.zy.ssm.dao.TestUserDao;
import com.zy.ssm.entity.TestUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author yu.zou
 * @description
 * @create 2018-03-21
 * @modify by
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TestUserDaoTest {

    @Resource
    private TestUserDao testUserDao;

    @Test
    public void tt(){
        System.out.println( testUserDao.getUsers() );
    }

    @Test
    public void tAdd(){
        TestUser t = new TestUser("sdsd","sdsd");
        testUserDao.addUser(t);
    }
}
