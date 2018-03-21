package com.zy.ssm.service.impl;

import com.zy.ssm.dao.TestUserDao;
import com.zy.ssm.entity.TestUser;
import com.zy.ssm.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yu.zou
 * @description
 * @create 2018-03-21
 * @modify by
 */
@Service
public class TestUserServiceImpl implements TestUserService {

    //注入依赖
    @Autowired
    private TestUserDao dao;


    public List<TestUser> userList() {
        return dao.getUsers();
    }

    /**
     * 使用注解控制事务方法的优点
     * 1：开发团队达成一致的约定，明确标注事务方法的编码规范
     * 2：保证事务方法的执行时间尽可能短，不要穿插其他网络操作 如HTTP操作或者剥离事务外部方法
     * 3：不是所有的方法都需要事务，如果有一条修改操作 只读操作 不需要事务控制
     */

    @Transactional
    public List<String> getAllUserName() {
        List<TestUser> t = dao.getUsers();

        List<String> allName = new ArrayList<String>();
        for (TestUser tt : t) {
            allName.add(tt.getUsername());
        }
        return allName;
    }
}
