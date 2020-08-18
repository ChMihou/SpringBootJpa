package com.cmh.jpa.dao;

import com.cmh.jpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 接口JpaRepository
 */
public interface UserRepository  extends JpaRepository<User,Integer> {

    public  List<User> findByIdAndUsername(Integer id,String username);

    public List<User> findByUsernameLike(String username);

    //springboot旧版本不需要再？后加数字表示第几个参数，新的版本需要
    @Query(value = "from User where username = ?1")
    public List<User> queryByNameUseHQL(String username);

    //没有指定nativequery，直接写封装类名称代替数据库名，指定则正常写sql语句
    @Query(value = "select * from tb_user where username=?",nativeQuery = true)
    public List<User> queryByNameUseSQL(String username);

    @Query("update User set username=?1 where id=?2")
    @Modifying
    public void updateUsersNameById(String username,Integer id);
}
