package com.example.gllg.isp.cmps.entity;

import java.io.Serializable;

/**
 * (TbHoldcar)实体类
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
public class TbHoldcar implements Serializable {
    private static final long serialVersionUID = -82704290351214876L;
    
    private Integer itemid;
    
    private String itemcode;
    /**
    * 车辆品牌
    */
    private String cargrade;
    /**
    * 房屋号
    */
    private String housecode;
    /**
    * 车辆类型
    */
    private String cartype;
    /**
    * 业主code
    */
    private String holdcode;
    /**
    * 车位
    */
    private String stall;
    /**
    * 开始时间
    */
    private Object starttime;
    /**
    * 结束时间
    */
    private Object endtime;
    /**
    * 状态；0正常；1释放
    */
    private String state;


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

    public String getCargrade() {
        return cargrade;
    }

    public void setCargrade(String cargrade) {
        this.cargrade = cargrade;
    }

    public String getHousecode() {
        return housecode;
    }

    public void setHousecode(String housecode) {
        this.housecode = housecode;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getHoldcode() {
        return holdcode;
    }

    public void setHoldcode(String holdcode) {
        this.holdcode = holdcode;
    }

    public String getStall() {
        return stall;
    }

    public void setStall(String stall) {
        this.stall = stall;
    }

    public Object getStarttime() {
        return starttime;
    }

    public void setStarttime(Object starttime) {
        this.starttime = starttime;
    }

    public Object getEndtime() {
        return endtime;
    }

    public void setEndtime(Object endtime) {
        this.endtime = endtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}