package com.xiaoxin.springboot.controller;

import com.xiaoxin.springboot.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class MVCController {

    @RequestMapping(value = "/boot/getUser",method = RequestMethod.GET)
    public Object getUser(){
        User user = new User();
        user.setId(100);
        user.setName("小新新");
        return user;
    }

    /**
     * 只支持get请求 @GetMapping  = @RequestMapping + method = RequestMethod.GET
     * @return
     */
    @GetMapping(value = "/boot/getUser1")
    public Object getUser1(){
        User user = new User();
        user.setId(100);
        user.setName("小新新");
        return user;
    }
}
