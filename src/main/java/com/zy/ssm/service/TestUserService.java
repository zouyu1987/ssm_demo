package com.zy.ssm.service;

import com.zy.ssm.entity.TestUser;

import java.util.List;

/**
 * @author yu.zou
 * @description
 * @create 2018-03-21
 * @modify by
 */
public interface TestUserService {

    List<String> queryAllUserName();

    List<TestUser> queryUserList();

    void addUser(TestUser t);
}
