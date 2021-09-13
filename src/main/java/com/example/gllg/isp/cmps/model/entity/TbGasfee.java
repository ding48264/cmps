package com.example.gllg.isp.cmps.model.entity;

import java.io.Serializable;

/**
 * (TbGasfee)实体类
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
public class TbGasfee implements Serializable {
    private static final long serialVersionUID = 568992636241905212L;
    
    private Integer itemid;
    
    private String itemcode;
    /**
    * 煤气费表，关联房屋housecode
    */
    private String gasfeecode;
    /**
    * 上期煤气表度数
    */
    private Double lastdegree;
    /**
    * 本期煤气表度数
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
    * 抄表人的admincode
    */
    private String operater;
    /**
    * 价格系数
    */
    private String coefficient;
    /**
    * 煤气表费用
    */
    private String gasfee;
    /**
    * 备注
    */
    private String introduce;
    /**
    * 缴费状态，0为代缴费；1为已缴费
    */
    private String state;
    
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

    public String getGasfeecode() {
        return gasfeecode;
    }

    public void setGasfeecode(String gasfeecode) {
        this.gasfeecode = gasfeecode;
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

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(String coefficient) {
        this.coefficient = coefficient;
    }

    public String getGasfee() {
        return gasfee;
    }

    public void setGasfee(String gasfee) {
        this.gasfee = gasfee;
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