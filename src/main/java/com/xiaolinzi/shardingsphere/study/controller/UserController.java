package com.xiaolinzi.shardingsphere.study.controller;

import com.xiaolinzi.shardingsphere.study.entity.TestUser02;
import com.xiaolinzi.shardingsphere.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：zhangshilin
 * @date ：2021-01-25 11:27
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/saveUser")
    public String saveUser() {
        userService.saveUser();
        return "success";
    }

    @GetMapping("/selectAll")
    public List<TestUser02> selectAll() {
        return userService.selectAll();
    }
    @GetMapping("/selectById")
    public TestUser02 selectById() {
        return userService.selectById();
    }
}
