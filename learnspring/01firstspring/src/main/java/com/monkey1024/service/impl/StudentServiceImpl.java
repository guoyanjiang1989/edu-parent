package com.monkey1024.service.impl;

import com.monkey1024.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void study() {
        System.out.println("好好学习天天向上");
    }

    public void unit(){
        System.out.println("初始化方法");
    }

    public void destroy(){
        System.out.println("销毁方法");
    }
}
