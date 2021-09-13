package com.example.gllg.isp.cmps.model.entity;

import java.io.Serializable;

/**
 * (TbStall)实体类
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
public class TbStall implements Serializable {
    private static final long serialVersionUID = 695446350067232820L;
    
    private Integer itemid;
    
    private String itemcode;
    /**
    * 关联停车场code
    */
    private String parkingcode;
    /**
    * 关联业主code
    */
    private String holdcode;
    /**
    * 车位code
    */
    private Object stallcode;
    /**
    * 车位
    */
    private Integer stallno;
    /**
    * 车位状态；0空闲；1已售卖
    */
    private String state;
    /**
    * 车位类型；
    */
    private String type;
    /**
    * 占地面积
    */
    private Double area;


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

    public String getParkingcode() {
        return parkingcode;
    }

    public void setParkingcode(String parkingcode) {
        this.parkingcode = parkingcode;
    }

    public String getHoldcode() {
        return holdcode;
    }

    public void setHoldcode(String holdcode) {
        this.holdcode = holdcode;
    }

    public Object getStallcode() {
        return stallcode;
    }

    public void setStallcode(Object stallcode) {
        this.stallcode = stallcode;
    }

    public Integer getStallno() {
        return stallno;
    }

    public void setStallno(Integer stallno) {
        this.stallno = stallno;
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

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

}