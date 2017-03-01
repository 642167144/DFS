package com.jkoss.pojo;

public class ProductImage {
    private Integer productImageId;

    private Integer piProductId;

    private String image;

    private String imageType;

    private String attribute_75;

    public Integer getProductImageId() {
        return productImageId;
    }

    public void setProductImageId(Integer productImageId) {
        this.productImageId = productImageId;
    }

    public Integer getPiProductId() {
        return piProductId;
    }

    public void setPiProductId(Integer piProductId) {
        this.piProductId = piProductId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType == null ? null : imageType.trim();
    }

    public String getAttribute_75() {
        return attribute_75;
    }

    public void setAttribute_75(String attribute_75) {
        this.attribute_75 = attribute_75 == null ? null : attribute_75.trim();
    }
}