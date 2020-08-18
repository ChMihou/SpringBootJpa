package com.cmh.jpa.dao;

import com.cmh.jpa.pojo.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * 接口CrudRepository
 */
public interface RoleRepository extends CrudRepository<Role,Integer> {
}
