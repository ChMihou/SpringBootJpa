package com.cmh.jpa.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_role")
public class Role implements Serializable {
    private static final long serialVersionUID = -849895077737702490L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//主键生成策略,IDENTITY代表主键自动递增策略
    @Column(name = "rid")
    private Integer rid;

    @Column(name = "rname")
    private String rname;

    @Column(name = "permission")
    private String permission;


    @OneToMany
    public  List<User> users;

    public Integer getRid() {
        return rid;
    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", permission='" + permission + '\'' +
                ", users=" + users +
                '}';
    }
}
