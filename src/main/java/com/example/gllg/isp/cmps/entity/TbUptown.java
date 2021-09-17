package com.example.gllg.isp.cmps.entity;

import java.io.Serializable;

/**
 * (TbUptown)实体类
 *
 * @author makejava
 * @since 2021-09-14 16:05:26
 */
public class TbUptown implements Serializable {
    private static final long serialVersionUID = -71216452878191636L;
    
    private Integer itemid;
    
    private String itemcode;
    
    private String uptowncode;
    /**
    * 小区名称
    */
    private String name;
    /**
    * 省
    */
    private String pro;
    /**
    * 市
    */
    private String city;
    /**
     * 县
     */
    private String distinct;
    /**
     * 地址
     */
    private String addr;
    /**
    * 电话
    */
    private String phone;
    /**
    * 占地面积
    */
    private Integer area;


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

    public String getUptowncode() {
        return uptowncode;
    }

    public void setUptowncode(String uptowncode) {
        this.uptowncode = uptowncode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistinct() {
        return distinct;
    }

    public void setDistinct(String distinct) {
        this.distinct = distinct;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getAddr() {
        return addr;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

}