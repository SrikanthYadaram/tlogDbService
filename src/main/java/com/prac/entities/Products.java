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

    private int totalTestCases;

    private int failedTc;

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

    public int getTotalTestCases() {
        return totalTestCases;
    }

    public void setTotalTestCases(int totalTestCases) {
        this.totalTestCases = totalTestCases;
    }

    public int getFailedTc() {
        return failedTc;
    }

    public void setFailedTc(int failedTc) {
        this.failedTc = failedTc;
    }
}
