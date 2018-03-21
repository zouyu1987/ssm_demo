package com.zy.ssm.test;

import com.zy.ssm.service.TestUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author yu.zou
 * @description
 * @create 2018-03-21
 * @modify by
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/*.xml"})
public class TestUService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TestUserService testUserService;

    @Test
    public void getTN(){
        List<String> mm= testUserService.queryAllUserName();
        logger.info("AllName={}",mm.toString());
    }
}
