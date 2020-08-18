package com.cmh.jpa.service;

import com.cmh.jpa.pojo.User;

import java.util.List;

public interface UserService {

    public User saveUser(User user);

    public List<User> findByIdAndUsername(Integer id, String username);

    public List<User> findByUsernameLike(String username);

    List<User> queryByNameUseHQL(String username);

    List<User> queryByNameUseSQL(String username);

    void updateUsersNameById(String username,Integer id);
}
