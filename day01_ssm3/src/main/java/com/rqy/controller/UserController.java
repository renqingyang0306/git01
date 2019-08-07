package com.rqy.controller;

import com.rqy.domain.User;
import com.rqy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 任清阳
 * @Email 1277409109@qq.com
 * @date 2019/8/6 17:50
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("user")
    public  @ResponseBody User query(int id){
        User user = userService.selectByPrimaryKey(id);
        System.out.println(user);
        return  user;
    }
}
