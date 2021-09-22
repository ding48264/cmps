package com.example.gllg.isp.cmps.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TbElectfee)实体类
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
@Data
public class TbElectfee implements Serializable {
    private static final long serialVersionUID = -18741952576209888L;
    
    private Integer itemid;
    
    private String itemcode;
    /**
    * 电费表，关联房屋housecode
    */
    private String waterfeecode;
    /**
    * 上期电表度数
    */
    private Double lastdegree;
    /**
    * 本期电表度数
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
    private Double coefficient;
    /**
    * 水表费用
    */
    private String electfee;
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
    private TbHouse tbHouse;


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

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

    public String getElectfee() {
        return electfee;
    }

    public void setElectfee(String electfee) {
        this.electfee = electfee;
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