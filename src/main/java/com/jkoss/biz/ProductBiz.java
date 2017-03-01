package com.jkoss.biz;

import com.jkoss.pojo.Product;
import com.jkoss.pojo.ProductType;
import com.jkoss.tool.Page;

import java.util.List;

/**
 * Created by 642167144@qq.com on 2017/2/28.
 */
public interface ProductBiz {

    List<ProductType> show_ProductType();
    List<Product> show_Product();
    List<Product> find_Product(int productId);
    List<Product> findProductsAtPage(Page page);
    int countAllUsers();
    Product findProductById(int productId);
    void updateProduct(Product product);
    void delectProductById(int productId);
}
