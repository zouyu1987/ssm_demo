package com.zy.ssm.controller;

import com.zy.ssm.entity.TestUser;
import com.zy.ssm.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yu.zou
 * @description
 * @create 2018-03-21
 * @modify by
 */
@Controller
@RequestMapping(value = "/user")
public class TestUserController {

    @Autowired
    private TestUserService testUserService;

    @RequestMapping(value="/list")
    public String getListPage(){
        return "list";
    }

    @RequestMapping(value="/userList")
    @ResponseBody
    public List<TestUser> getList(){
        return testUserService.queryUserList();
    }

    @RequestMapping(value="/addUser")
    @ResponseBody
    public String addUser(){
        TestUser t = new TestUser("qaz","wsx");
        testUserService.addUser(t);
        return "add a user";
    }
}
