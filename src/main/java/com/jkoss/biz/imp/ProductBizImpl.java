package com.jkoss.biz.imp;

import com.jkoss.biz.ProductBiz;
import com.jkoss.dao.ProductMapper;
import com.jkoss.dao.ProductTypeMapper;
import com.jkoss.pojo.Product;
import com.jkoss.pojo.ProductType;
import com.jkoss.tool.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 642167144@qq.com on 2017/2/28.
 */
@Component
public class ProductBizImpl implements ProductBiz {

    @Autowired
    private ProductMapper  pdm;
    @Autowired
    private ProductTypeMapper pdtm;

    @Override
    public List<ProductType> show_ProductType() {
        return pdtm.selectAll();
    }

    @Override
    public List<Product> show_Product() {
        return pdm.selectAll();
    }

    @Override
    public List<Product> find_Product(int productId) {
        return (List<Product>) pdm.selectByPrimaryKey(productId);
    }

    @Override
    public List<Product> findProductsAtPage(Page page) {
        return pdm.selectAtPage(page);
    }

    @Override
    public int countAllUsers() {
        return pdm.countAll();
    }

    @Override
    public Product findProductById(int productId) {
        return pdm.selectByPrimaryKey(productId);
    }

    @Override
    public void updateProduct(Product product) {
        pdm.updateByPrimaryKeySelective(product);
    }

    @Override
    public void delectProductById(int productId) {
        pdm.deleteByPrimaryKey(productId);
    }
}
