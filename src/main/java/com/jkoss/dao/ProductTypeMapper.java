package com.jkoss.dao;

import com.jkoss.pojo.ProductType;
import com.jkoss.tool.Page;

import java.util.List;

public interface ProductTypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    ProductType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(ProductType record);

    int updateByPrimaryKey(ProductType record);

    List<ProductType> selectAll();
    List<ProductType> selectAtPage(Page page);
    int countAll();
}