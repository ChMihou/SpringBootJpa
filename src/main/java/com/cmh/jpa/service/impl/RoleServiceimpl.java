package com.cmh.jpa.service.impl;

import com.cmh.jpa.dao.RoleRepository;
import com.cmh.jpa.pojo.Role;
import com.cmh.jpa.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleServiceimpl implements RoleService {

    @Resource
    RoleRepository roleRepository;

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }
}
