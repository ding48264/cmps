package com.example.gllg.isp.cmps.entity;

import java.io.Serializable;

/**
 * (TbWaterfee)实体类
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
public class TbWaterfee implements Serializable {
    private static final long serialVersionUID = -84341293179652484L;
    
    private Integer itemid;
    
    private String itemcode;
    /**
    * 水费表，关联房屋housecode
    */
    private String waterfeecode;
    /**
    * 上期水表度数
    */
    private Double lastdegree;
    /**
    * 本期水表度数
    */
    private Double currentdegree;
    /**
    * 上期抄表时间
    */
    private Object lastttime;
    /**
    * 本期抄表表时间
    */
    private Object currenttime;
    /**
    * 系数
    */
    private Double coefficient;
    /**
    * 抄表人的admincode
    */
    private String operater;
    /**
    * 水表费用
    */
    private String waterfee;
    /**
    * 备注
    */
    private String introduce;
    /**
    * 缴费状态，0为代缴费；1为已缴费
    */
    private String state;
    /**
    * 类型
    */
    private String type;


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

    public String getWaterfeecode() {
        return waterfeecode;
    }

    public void setWaterfeecode(String waterfeecode) {
        this.waterfeecode = waterfeecode;
    }

    public Double getLastdegree() {
        return lastdegree;
    }

    public void setLastdegree(Double lastdegree) {
        this.lastdegree = lastdegree;
    }

    public Double getCurrentdegree() {
        return currentdegree;
    }

    public void setCurrentdegree(Double currentdegree) {
        this.currentdegree = currentdegree;
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

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public String getWaterfee() {
        return waterfee;
    }

    public void setWaterfee(String waterfee) {
        this.waterfee = waterfee;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}