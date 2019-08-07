package com.rqy.controller;

import com.rqy.domain.User;
import com.rqy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;
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
    @ResponseBody
    public  User query(int id, Model model){
        User user = userService.selectByPrimaryKey(id);
        model.addAttribute("user",user.toString());
        return  user;
    }
    @RequestMapping("date")
    @ResponseBody
    public String helloDate(Date birthday){
        return birthday.toString();
    }
    //登录
    @RequestMapping("login")
    public String login(User user,Model model){
        User result = userService.selectByUserByUsernameAndPassword(user);
        if (result==null){
            model.addAttribute("error","用户信息不存在");
            return "error";
        }
        model.addAttribute("success","欢迎你"+result.getUsername());
        return  "success";
    }
    //登录
    @RequestMapping("register")
    public String register(User user,Model model){
        System.out.println(user);
        if (user==null || user.toString().length()==0){
            model.addAttribute("error","注册信息有误");
            return "error";
        }
        userService.insertUser(user);
        model.addAttribute("success","注册成功");
        return  "success";
    }
}
