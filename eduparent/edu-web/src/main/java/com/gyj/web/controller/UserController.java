package com.gyj.web.controller;

import com.gyj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login.do")
    public String login(){
        return "default";
    }
    @RequestMapping("manage.do")
    public String manage(){
        return "User/UserManage";
    }

    @RequestMapping("info.do")
    public String info(){
        return "User/UserInfo";
    }

    @RequestMapping("add.do")
    public String add(){
        return "User/UserEdit";
    }

}
