package com.cmh.jpa.service.impl;

import com.cmh.jpa.dao.UserRepository;
import com.cmh.jpa.pojo.User;
import com.cmh.jpa.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * 必须在Service层加入事务注解@Transactional
 * JPA固定不加事务没有办法进行数据库的增删改操作
 * @Transactional注解可以加在@Service层和Repository层
 */
@Service
@Transactional
public class UserServiceimpl implements UserService {

    @Resource
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findByIdAndUsername(Integer id, String username) {
        return userRepository.findByIdAndUsername(id,username);
    }

    @Override
    public List<User> findByUsernameLike(String username) {
        return userRepository.findByUsernameLike(username);
    }

    @Override
    public List<User> queryByNameUseHQL(String username) {
        return userRepository.queryByNameUseHQL(username);
    }

    @Override
    public List<User> queryByNameUseSQL(String username) {
        return userRepository.queryByNameUseSQL(username);
    }

    @Override
    public void updateUsersNameById(String username, Integer id) {
        userRepository.updateUsersNameById(username,id);
    }
}
