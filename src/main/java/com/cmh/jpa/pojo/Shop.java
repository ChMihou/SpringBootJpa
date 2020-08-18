package com.cmh.jpa.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_shop")
public class Shop implements Serializable {

    private static final long serialVersionUID = 1369733252144115340L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)//主键生成策略,IDENTITY代表主键自动递增策略
    @Column(name = "id")
    private int id;

    @Column(name = "shopname")
    private String shopname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    @Override
    public String toString() {
        return "shop{" +
                "id=" + id +
                ", shopname='" + shopname + '\'' +
                '}';
    }
}
