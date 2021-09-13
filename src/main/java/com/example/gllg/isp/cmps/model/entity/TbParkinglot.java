package com.example.gllg.isp.cmps.model.entity;

import java.io.Serializable;

/**
 * (TbParkinglot)实体类
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
public class TbParkinglot implements Serializable {
    private static final long serialVersionUID = -58166166833110561L;
    
    private Integer itemid;
    
    private String itemcode;
    /**
    * 停车场code
    */
    private String parkcode;
    /**
    * 停车场类型
    */
    private String parkingtype;
    /**
    * 创建时间
    */
    private Object createat;


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

    public String getParkcode() {
        return parkcode;
    }

    public void setParkcode(String parkcode) {
        this.parkcode = parkcode;
    }

    public String getParkingtype() {
        return parkingtype;
    }

    public void setParkingtype(String parkingtype) {
        this.parkingtype = parkingtype;
    }

    public Object getCreateat() {
        return createat;
    }

    public void setCreateat(Object createat) {
        this.createat = createat;
    }

}