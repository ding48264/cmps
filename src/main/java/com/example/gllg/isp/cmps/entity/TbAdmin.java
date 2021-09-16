package com.example.gllg.isp.cmps.entity;

import java.io.Serializable;

/**
 * (TbAdmin)实体类
 *
 * @author makejava
 * @since 2021-09-14 16:18:50
 */
public class TbAdmin implements Serializable {
    private static final long serialVersionUID = -37219641716450926L;
    
    private Integer itemid;
    
    private String itemcode;
    /**
    * 管理员账号
    */
    private String adminid;
    /**
    * 登录密码
    */
    private String password;
    /**
    * 关联小区表的uptowncode
    */
    private String admincode;
    
    private String adminname;
    
    private String admintype;
    /**
    * 管理员类型，1为root，2为普通
    */
    private String email;
    
    private Integer phone;
    
    private String sex;


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

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmincode() {
        return admincode;
    }

    public void setAdmincode(String admincode) {
        this.admincode = admincode;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdmintype() {
        return admintype;
    }

    public void setAdmintype(String admintype) {
        this.admintype = admintype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}