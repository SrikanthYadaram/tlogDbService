package com.prac.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by srikanth yadaram on 11/19/2016.
 */
@Entity
public class Product {

    @Id
    private int pId;

    private String pName;

    private String devTech;

    private int deptId;

    private String productDesc;

    private String qaTool;



    private String automationTech;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getdevTech() {
        return devTech;
    }

    public void setdevTech(String pTech) {
        this.devTech = devTech;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
    public String getQaTool() {
        return qaTool;
    }

    public void setQaTool(String qaTool) {
        this.qaTool = qaTool;
    }

    public String getAutomationTech() {
        return automationTech;
    }

    public void setAutomationTech(String automationTech) {
        this.automationTech = automationTech;
    }

}
