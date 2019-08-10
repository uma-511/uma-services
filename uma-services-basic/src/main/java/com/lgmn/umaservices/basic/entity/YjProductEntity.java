package com.lgmn.umaservices.basic.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "yj_product", schema = "uma", catalog = "")
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate
public class YjProductEntity implements Serializable {
    private int id;
    private String num;
    private String name;
    private String specs;
    private String width;
    private String str1;
    private String str2;
    private String str3;
    private String str4;
    private String str5;
    private String createUserId;
    private String createUserName;
    private Timestamp createTime;
    private Integer status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "num", nullable = true, length = 30)
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "specs", nullable = true, length = 30)
    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    @Basic
    @Column(name = "width", nullable = true, length = 30)
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Basic
    @Column(name = "str1", nullable = true, length = 50)
    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    @Basic
    @Column(name = "str2", nullable = true, length = 50)
    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    @Basic
    @Column(name = "str3", nullable = true, length = 50)
    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    @Basic
    @Column(name = "str4", nullable = true, length = 50)
    public String getStr4() {
        return str4;
    }

    public void setStr4(String str4) {
        this.str4 = str4;
    }

    @Basic
    @Column(name = "str5", nullable = true, length = 50)
    public String getStr5() {
        return str5;
    }

    public void setStr5(String str5) {
        this.str5 = str5;
    }

    @Basic
    @Column(name = "create_user_id", nullable = true, length = 32)
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "create_user_name", nullable = true, length = 30)
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YjProductEntity that = (YjProductEntity) o;
        return id == that.id &&
                Objects.equals(num, that.num) &&
                Objects.equals(name, that.name) &&
                Objects.equals(specs, that.specs) &&
                Objects.equals(width, that.width) &&
                Objects.equals(str1, that.str1) &&
                Objects.equals(str2, that.str2) &&
                Objects.equals(str3, that.str3) &&
                Objects.equals(str4, that.str4) &&
                Objects.equals(str5, that.str5) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(createUserName, that.createUserName) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num, name, specs, width, str1, str2, str3, str4, str5, createUserId, createUserName, createTime, status);
    }
}