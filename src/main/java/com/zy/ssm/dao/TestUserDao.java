package com.zy.ssm.dao;

import com.zy.ssm.entity.TestUser;

import java.util.List;

/**
 * @author yu.zou
 * @description
 * @create 2018-03-21
 * @modify by
 */
public interface TestUserDao {

    List<TestUser> getUsers();

    Boolean addUser(TestUser user);

}
