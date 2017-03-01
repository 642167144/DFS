package com.jkoss.action;

import com.jkoss.biz.ProductBiz;
import com.jkoss.pojo.Product;
import com.jkoss.pojo.ProductType;
import com.jkoss.tool.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by 642167144@qq.com on 2017/2/28.
 */
@Controller
@RequestMapping("/Product/")
public class ProductCtrl {

    @Autowired
    private ProductBiz pdtbiz;
    @ResponseBody
    @RequestMapping("show")
    public List show(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        pdtbiz.show_ProductType().replaceAll("typeId","id");
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        Map<String,Object> map;
        for (ProductType pt:pdtbiz.show_ProductType()){
            map=new HashMap<String,Object>();
            if (pt.getfTypeId().equals("0")){
                pt.setfTypeId("#");
            }
            map.put("id",pt.getTypeId());
            map.put("text",pt.getTypeName());
            map.put("parent",pt.getfTypeId());
            list.add(map) ;
        }
        for (Product p:pdtbiz.show_Product()){
            map=new HashMap<String,Object>();
            map.put("id",p.getProductId());
            map.put("text",p.getProductName());
            map.put("parent",p.getProductType());
            list.add(map) ;
        }
        return  list;
    }
    @ResponseBody
    @RequestMapping("find_product")
    public List find_product(HttpServletRequest request, HttpServletResponse response,Integer productId) throws IOException {
        return  pdtbiz.find_Product(productId);
    }

    @RequestMapping("listProduct")
    public String listProductAtPage(HttpServletRequest req,Page<Product> page){

        if(page==null){
            page = new Page<Product>();
        }

        page.setResults(pdtbiz.findProductsAtPage(page));
        page.setTotalRecord(pdtbiz.countAllUsers());
        req.setAttribute("page", page);
        req.setAttribute("page2", pdtbiz.show_ProductType());
        return "/mgr/listproduct.jsp";
    }
    ////准备更新
    @RequestMapping("updtProduct1.do")
    public String updateProduct1(HttpServletRequest req,int productId){
        System.out.println( pdtbiz.findProductById(productId));
        req.setAttribute("toUpdtProduct", pdtbiz.findProductById(productId));
        return "/mgr/mergeProduct.jsp";
    }

    @RequestMapping("updtProduct2.do")
    public String updateProduct2(HttpServletRequest req,int productId,@RequestParam MultipartFile headImage) throws IOException {
        if (headImage!=null){
            String picName=headImage.getOriginalFilename();
            String basePath="/imgs/";
            String picNewName=picName.substring(picName.lastIndexOf("."))+ UUID.randomUUID()+picName.substring(picName.lastIndexOf("."));

            headImage.transferTo(new File(basePath,picName));


        }
        return "/mgr/mergeUsr.jsp";
    }
}
