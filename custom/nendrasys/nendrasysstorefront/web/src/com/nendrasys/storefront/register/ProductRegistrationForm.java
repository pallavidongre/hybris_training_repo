package com.nendrasys.storefront.register;

public class ProductRegistrationForm {
    String companyName;

    int quantityNeeded;
    String  productId;

    public int getQuantityNeeded() { return quantityNeeded; }

    public void setQuantityNeeded(int quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }


}
