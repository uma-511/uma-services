package com.lgmn.umaservices.basic.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "delivery_note", schema = "uma", catalog = "")
@EntityListeners(AuditingEntityListener.class)
public class DeliveryNoteEntity implements Serializable {
    private int id;
    private String customer;
    private String contact;
    private String address;
    private String phone;
    private String deliveryNum;
    private String driver;
    private String carNum;
    private Timestamp createTime;
    private String createUser;
    private String remark;
    private String store;
    private String revicer;
    private int delFlag;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "customer")
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Basic
    @Column(name = "contact")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "delivery_num")
    public String getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(String deliveryNum) {
        this.deliveryNum = deliveryNum;
    }

    @Basic
    @Column(name = "driver")
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Basic
    @Column(name = "car_num")
    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    @Basic
    @Column(name = "create_time")
    @CreatedDate
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "create_user")
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "store")
    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    @Basic
    @Column(name = "revicer")
    public String getRevicer() {
        return revicer;
    }

    public void setRevicer(String revicer) {
        this.revicer = revicer;
    }

    @Basic
    @Column(name = "del_flag")
    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryNoteEntity that = (DeliveryNoteEntity) o;
        return id == that.id &&
                delFlag == that.delFlag &&
                Objects.equals(customer, that.customer) &&
                Objects.equals(contact, that.contact) &&
                Objects.equals(address, that.address) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(deliveryNum, that.deliveryNum) &&
                Objects.equals(driver, that.driver) &&
                Objects.equals(carNum, that.carNum) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(store, that.store) &&
                Objects.equals(revicer, that.revicer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, contact, address, phone, deliveryNum, driver, carNum, createTime, createUser, remark, store, revicer, delFlag);
    }
}
