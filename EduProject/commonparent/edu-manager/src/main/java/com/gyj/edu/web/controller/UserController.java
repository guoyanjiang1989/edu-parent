package com.gyj.edu.web.controller;

import com.gyj.edu.bean.User;
import com.gyj.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){

        return "Default";
    }

    @RequestMapping("manage")
    public String manage(){

        return "user/UserManage";
    }

    @RequestMapping("info")
    public String info(){

        return "user/UserInfo";
    }

    @RequestMapping("edit")
    public String edit(){
        return "user/UserEdit";
    }
}
