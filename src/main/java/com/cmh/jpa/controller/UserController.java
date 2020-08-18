package com.cmh.jpa.controller;

import com.cmh.jpa.pojo.Role;
import com.cmh.jpa.pojo.User;
import com.cmh.jpa.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("save")
    public String save()
    {
        Role role = new Role();
        role.setPermission("admin");
        role.setRname("管理员");
        User user = new User();
        user.setPassword("123456");
        user.setRole(role);
        user.setUsername("小明");
        User userrole =  userService.saveUser(user);
        System.out.println(userrole);
        return "hello";
    }
    @RequestMapping("findidusername")
    public String findidusername(){
        List<User> users = userService.findByIdAndUsername(3,"小明");
        for (User user:users) {
            System.out.println(user.toString());
        }
        return "hello";
    }

    @RequestMapping("findlikeusername")
    public String findlikeidusername(){
        List<User> users = userService.findByUsernameLike("小%");
        for (User user:users) {
            System.out.println(user.toString());
        }
        return "hello";
    }

    @RequestMapping("querybynameusehql")
    public String queryByNameUseHQL(){
        List<User> users = userService.queryByNameUseHQL("小明");
        for (User user:users) {
            System.out.println(user.toString());
        }
        return "hello";
    }
    @RequestMapping("queryByNameUseSQL")
    public String queryByNameUseSQL(){
        List<User> users = userService.queryByNameUseSQL("小明");
        for (User user:users) {
            System.out.println(user.toString());
        }
        return "hello";
    }
    @RequestMapping("updateUsersNameById")
    public String updateUsersNameById(){
        userService.updateUsersNameById("小均",4);
        return "hello";
    }
}
