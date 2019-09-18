package com.lgmn.umaservices.basic.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "customer", schema = "uma", catalog = "")
public class CustomerEntity implements Serializable {
    private int id;
    private String name;
    private String phone;
    private String fax;
    private String address;
    private String remark;
    private String createUserId;
    private String createUser;
    private Timestamp createTime;
    private String customerCode;
    private String contacts;
    private Integer orderReminder;
    private Integer hadReminded;
    private String logistics;
    private String logisticsPhone;
    private String logisticsAddress;
    private Integer delFlag;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 11)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "fax", nullable = true, length = 20)
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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
    @Column(name = "remark", nullable = true, length = 500)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
    @Column(name = "create_user", nullable = true, length = 20)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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
    @Column(name = "customer_code", nullable = true, length = 20)
    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Basic
    @Column(name = "contacts", nullable = true, length = 20)
    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    @Basic
    @Column(name = "order_reminder", nullable = true)
    public Integer getOrderReminder() {
        return orderReminder;
    }

    public void setOrderReminder(Integer orderReminder) {
        this.orderReminder = orderReminder;
    }

    @Basic
    @Column(name = "had_reminded", nullable = true)
    public Integer getHadReminded() {
        return hadReminded;
    }

    public void setHadReminded(Integer hadReminded) {
        this.hadReminded = hadReminded;
    }

    @Basic
    @Column(name = "logistics", nullable = true, length = 50)
    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }

    @Basic
    @Column(name = "logistics_phone", nullable = true, length = 20)
    public String getLogisticsPhone() {
        return logisticsPhone;
    }

    public void setLogisticsPhone(String logisticsPhone) {
        this.logisticsPhone = logisticsPhone;
    }

    @Basic
    @Column(name = "logistics_address", nullable = true, length = 200)
    public String getLogisticsAddress() {
        return logisticsAddress;
    }

    public void setLogisticsAddress(String logisticsAddress) {
        this.logisticsAddress = logisticsAddress;
    }

    @Basic
    @Column(name = "del_flag", nullable = true)
    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(address, that.address) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(customerCode, that.customerCode) &&
                Objects.equals(contacts, that.contacts) &&
                Objects.equals(orderReminder, that.orderReminder) &&
                Objects.equals(hadReminded, that.hadReminded) &&
                Objects.equals(logistics, that.logistics) &&
                Objects.equals(logisticsPhone, that.logisticsPhone) &&
                Objects.equals(logisticsAddress, that.logisticsAddress) &&
                Objects.equals(delFlag, that.delFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, fax, address, remark, createUserId, createUser, createTime, customerCode, contacts, orderReminder, hadReminded, logistics, logisticsPhone, logisticsAddress, delFlag);
    }
}