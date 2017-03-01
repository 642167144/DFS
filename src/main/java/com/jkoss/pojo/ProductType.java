package com.jkoss.pojo;

public class ProductType {
    private Integer typeId;

    private String typeName;

    private String fTypeId;

    private String sTypeId;

    private String attribute_70;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getfTypeId() {
        return fTypeId;
    }

    public void setfTypeId(String fTypeId) {
        this.fTypeId = fTypeId == null ? null : fTypeId.trim();
    }

    public String getsTypeId() {
        return sTypeId;
    }

    public void setsTypeId(String sTypeId) {
        this.sTypeId = sTypeId == null ? null : sTypeId.trim();
    }

    public String getAttribute_70() {
        return attribute_70;
    }

    public void setAttribute_70(String attribute_70) {
        this.attribute_70 = attribute_70 == null ? null : attribute_70.trim();
    }
}