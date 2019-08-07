package com.rqy.controller;

import com.rqy.domain.User;
import com.rqy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public   String query(int id, Model model){
        User user = userService.selectByPrimaryKey(id);
        System.out.println(user);
        model.addAttribute("user",user.toString());
        return  "success";
    }
}
