package com.cmh.jpa.controller;

import com.cmh.jpa.dao.RoleRepository;
import com.cmh.jpa.pojo.Role;
import com.cmh.jpa.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RoleController {
    @Resource
    RoleService roleService;

    @Resource
    RoleRepository roleRepository;

    @RequestMapping("saverole")
    public String save(){
        Role role = new Role();
        role.setRname("普通职员");
        role.setPermission("normal");
        role =  roleService.save(role);
        System.out.println(role);
        List<Role> roleList = (List<Role>) roleRepository.findAll();
        for (Role role1: roleList) {
            System.out.println(role1.toString());
        }
        return "hello";
    }

}
