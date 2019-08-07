package com.rqy.mapper;

import com.rqy.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 任清阳
 * @Email 1277409109@qq.com
 * @date 2019/8/6 11:52
 */
@Component
public class UserMapperImpl implements UserMapper {
    @Autowired
    SqlSessionFactory sqlSessionFactory;
    public User selectByPrimaryKey(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectByPrimaryKey(id);
        return user;
    }
}
