package com.monkey1024.test;

import com.monkey1024.service.StudentService;
import com.monkey1024.service.UserService;
import com.monkey1024.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    public void oldType(){

        StudentService studentService = new StudentServiceImpl();
        studentService.study();
    }

    @Test
    public void springType(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        StudentService studentService = (StudentService)context.getBean("studentService");

        studentService.study();

        context.close();
    }

    @Test
    public void testDI(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService userService = (UserService)context.getBean("userService");
        userService.addUser();
    }


}
