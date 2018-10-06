package com.company.workClass;

public abstract class Literature {
    private String name;
    private String type;
    private Boolean inStock;

    public Literature(String name, String type, Boolean inStock) {
        this.name = name;
        this.type = type;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }
}
