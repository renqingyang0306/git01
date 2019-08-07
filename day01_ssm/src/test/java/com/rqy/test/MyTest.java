package com.rqy.test;

import com.rqy.domain.User;
import com.rqy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 任清阳
 * @Email 1277409109@qq.com
 * @date 2019/8/6 12:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class MyTest {
    @Autowired
    UserService userService;
    @Test
    public void  test(){
        User user = userService.selectByPrimaryKey(35);
        System.out.println(user);
    }
}
