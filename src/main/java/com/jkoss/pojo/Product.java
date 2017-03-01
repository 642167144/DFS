package com.jkoss.pojo;

public class Product {
    private Integer productId;

    private String productName;

    private Integer productPrice;

    private Integer singlePrice;

    private String productRealPrice;

    private String productTitle;

    private Integer productType;

    private Integer productBrand;

    private String headImage;

    private Integer status;

    private String style;

    private String attribute_71;

    private String productDetail;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(Integer singlePrice) {
        this.singlePrice = singlePrice;
    }

    public String getProductRealPrice() {
        return productRealPrice;
    }

    public void setProductRealPrice(String productRealPrice) {
        this.productRealPrice = productRealPrice == null ? null : productRealPrice.trim();
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle == null ? null : productTitle.trim();
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(Integer productBrand) {
        this.productBrand = productBrand;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage == null ? null : headImage.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getAttribute_71() {
        return attribute_71;
    }

    public void setAttribute_71(String attribute_71) {
        this.attribute_71 = attribute_71 == null ? null : attribute_71.trim();
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail == null ? null : productDetail.trim();
    }
}