package com.cmh.jpa.controller;

import com.cmh.jpa.dao.ShopRepository;
import com.cmh.jpa.pojo.Shop;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ShopController {
    @Resource
    ShopRepository shopRepository;

    @RequestMapping("shop")
    public String testPagingAndSortingRepositorySort() {
        List<Shop> list= (List<Shop>) shopRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
        for (Shop shop:list){
            System.out.println(shop);
        }
        return "hello";
    }
}
