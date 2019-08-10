package com.lgmn.umaservices.basic.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "delivery_note", schema = "uma", catalog = "")
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate
public class DeliveryNoteEntity implements Serializable {
    private int id;
    private Integer customerId;
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
    private int printed;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "customer_id", nullable = true)
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer", nullable = true, length = 100)
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Basic
    @Column(name = "contact", nullable = true, length = 20)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "delivery_num", nullable = true, length = 32)
    public String getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(String deliveryNum) {
        this.deliveryNum = deliveryNum;
    }

    @Basic
    @Column(name = "driver", nullable = true, length = 20)
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Basic
    @Column(name = "car_num", nullable = true, length = 20)
    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
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
    @Column(name = "create_user", nullable = false, length = 32)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 500)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "store", nullable = true, length = 20)
    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    @Basic
    @Column(name = "revicer", nullable = true, length = 20)
    public String getRevicer() {
        return revicer;
    }

    public void setRevicer(String revicer) {
        this.revicer = revicer;
    }

    @Basic
    @Column(name = "del_flag", nullable = false)
    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }

    @Basic
    @Column(name = "printed", nullable = false)
    public int getPrinted() {
        return printed;
    }

    public void setPrinted(int printed) {
        this.printed = printed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryNoteEntity that = (DeliveryNoteEntity) o;
        return id == that.id &&
                delFlag == that.delFlag &&
                printed == that.printed &&
                Objects.equals(customerId, that.customerId) &&
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
        return Objects.hash(id, customerId, customer, contact, address, phone, deliveryNum, driver, carNum, createTime, createUser, remark, store, revicer, delFlag, printed);
    }
}