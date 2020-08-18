package com.cmh.jpa.dao;

import com.cmh.jpa.pojo.Shop;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 分页排序接口PagingAndSortingRepository
 */
public interface ShopRepository extends PagingAndSortingRepository<Shop,Integer> {
}
