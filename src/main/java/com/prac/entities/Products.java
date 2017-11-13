package com.prac.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by srikanth yadaram on 11/19/2016.
 */
@Entity
public class Products {

    @Id
    private int productId;

    private String productName;

    private String totalTestCases;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTotalTestCases() {
        return totalTestCases;
    }

    public void setTotalTestCases(String totalTestCases) {
        this.totalTestCases = totalTestCases;
    }
}
