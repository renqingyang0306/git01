package com.rqy.service;

import com.rqy.domain.User;
import com.rqy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 任清阳
 * @Email 1277409109@qq.com
 * @date 2019/8/6 12:44
 */
public interface UserService {
    public User selectByPrimaryKey(int id);
}
