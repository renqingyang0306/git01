package com.rqy.service;

import com.rqy.domain.User;
import com.rqy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 任清阳
 * @Email 1277409109@qq.com
 * @date 2019/8/6 12:46
 */
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public User selectByPrimaryKey(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
