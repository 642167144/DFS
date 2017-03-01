package com.jkoss.dao;

import com.jkoss.pojo.Product;
import com.jkoss.tool.Page;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);
    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKeyWithBLOBs(Product record);

    int updateByPrimaryKey(Product record);
    List<Product> selectAll();
    List<Product> selectAtPage(Page page);
    int countAll();
}