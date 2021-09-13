package com.example.gllg.isp.cmps.model.entity;

import java.io.Serializable;

/**
 * (TbHouse)实体类
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
public class TbHouse implements Serializable {
    private static final long serialVersionUID = -31525561661940814L;
    
    private Integer itemid;
    
    private String itemcode;
    /**
    * 房屋编号
    */
    private String housecode;
    /**
    * 房屋所在栋
    */
    private String building;
    /**
    * 房屋所在单元
    */
    private String unit;
    /**
    * 房屋所在室
    */
    private String room;
    /**
    * 关联业主表的holdcode
    */
    private String holdcode;
    /**
    * 房屋面积
    */
    private Integer area;
    /**
    * 房屋类型
    */
    private String type;
    /**
    * 房屋状态
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

    public String getHousecode() {
        return housecode;
    }

    public void setHousecode(String housecode) {
        this.housecode = housecode;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getHoldcode() {
        return holdcode;
    }

    public void setHoldcode(String holdcode) {
        this.holdcode = holdcode;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}