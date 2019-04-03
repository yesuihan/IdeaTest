package com.itheima.controller;


import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/UserController")
public class Controller {


    @Autowired
    private UserService userService;


    @RequestMapping("/findAll")
    public void findAll() throws Exception {
        List<User> list = userService.findAll();
        for (User u :list){
            System.out.println(u);
        }
    }
}
