package com.cmh.jpa.pojo;

import com.cmh.jpa.service.impl.UserServiceimpl;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1369733252144115340L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//主键生成策略,IDENTITY代表主键自动递增策略
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @ManyToOne(cascade = CascadeType.PERSIST) //表示多方
    @JoinColumn(name ="role")	//维护一个外键，外键在User一侧
    private Role role;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
