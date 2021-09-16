package com.example.gllg.isp.cmps.entity;

import java.io.Serializable;

/**
 * (TbPropertyfee)实体类
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
public class TbPropertyfee implements Serializable {
    private static final long serialVersionUID = -89606215066794666L;
    
    private Integer itemid;
    
    private String itemcode;
    /**
    * 物业费表，关联房屋housecode
    */
    private String propertyfeecode;
    /**
    * 上期缴纳物业费时间
    */
    private Object lastttime;
    /**
    * 本期缴纳物业费时间
    */
    private Object currenttime;
    /**
    * 抄表人的admincode
    */
    private String operater;
    /**
    * 物业费用
    */
    private Double waterfee;
    /**
    * 备注
    */
    private String introduce;


    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getPropertyfeecode() {
        return propertyfeecode;
    }

    public void setPropertyfeecode(String propertyfeecode) {
        this.propertyfeecode = propertyfeecode;
    }

    public Object getLastttime() {
        return lastttime;
    }

    public void setLastttime(Object lastttime) {
        this.lastttime = lastttime;
    }

    public Object getCurrenttime() {
        return currenttime;
    }

    public void setCurrenttime(Object currenttime) {
        this.currenttime = currenttime;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public Double getWaterfee() {
        return waterfee;
    }

    public void setWaterfee(Double waterfee) {
        this.waterfee = waterfee;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

}