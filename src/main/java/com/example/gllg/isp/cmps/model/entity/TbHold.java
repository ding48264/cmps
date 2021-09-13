package com.example.gllg.isp.cmps.model.entity;

import java.io.Serializable;

/**
 * (TbHold)实体类
 *
 * @author makejava
 * @since 2021-09-13 10:59:09
 */
public class TbHold implements Serializable {
    private static final long serialVersionUID = -77591635846205104L;
    
    private Integer itemid;
    
    private String itemcode;
    /**
    * 业主编号，关联house表的housecode
    */
    private String holdcode;
    /**
    * 姓名
    */
    private String holdname;
    /**
    * 与业主关系
    */
    private String holdrela;
    /**
    * 性别
    */
    private String sex;
    /**
    * 年龄
    */
    private Integer age;
    /**
    * 身份证
    */
    private String idcardno;
    /**
    * 联系方式
    */
    private String phone;
    /**
    * qq
    */
    private String qq;


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

    public String getHoldcode() {
        return holdcode;
    }

    public void setHoldcode(String holdcode) {
        this.holdcode = holdcode;
    }

    public String getHoldname() {
        return holdname;
    }

    public void setHoldname(String holdname) {
        this.holdname = holdname;
    }

    public String getHoldrela() {
        return holdrela;
    }

    public void setHoldrela(String holdrela) {
        this.holdrela = holdrela;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

}