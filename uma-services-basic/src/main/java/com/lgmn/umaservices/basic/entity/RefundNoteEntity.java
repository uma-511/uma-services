package com.lgmn.umaservices.basic.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "refund_note", schema = "uma", catalog = "")
public class RefundNoteEntity implements Serializable {
    private int id;
    private Integer customerId;
    private String customer;
    private String contact;
    private String address;
    private String phone;
    private String refundNum;
    private String driver;
    private String carNum;
    private Timestamp createTime;
    private String createUser;
    private String remark;
    private String store;
    private String revicer;
    private Integer delFlag;
    private Integer printed;
    private Integer hadPaid;
    private Timestamp paymentTime;
    private String payConfirmer;

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
    @Column(name = "refund_num", nullable = true, length = 32)
    public String getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(String refundNum) {
        this.refundNum = refundNum;
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
    @Column(name = "create_time", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "create_user", nullable = false, length = 20)
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
    @Column(name = "del_flag", nullable = true)
    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Basic
    @Column(name = "printed", nullable = true)
    public Integer getPrinted() {
        return printed;
    }

    public void setPrinted(Integer printed) {
        this.printed = printed;
    }

    @Basic
    @Column(name = "had_paid", nullable = true)
    public Integer getHadPaid() {
        return hadPaid;
    }

    public void setHadPaid(Integer hadPaid) {
        this.hadPaid = hadPaid;
    }

    @Basic
    @Column(name = "payment_time", nullable = true)
    public Timestamp getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Basic
    @Column(name = "pay_confirmer", nullable = true, length = 20)
    public String getPayConfirmer() {
        return payConfirmer;
    }

    public void setPayConfirmer(String payConfirmer) {
        this.payConfirmer = payConfirmer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RefundNoteEntity that = (RefundNoteEntity) o;
        return id == that.id &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(customer, that.customer) &&
                Objects.equals(contact, that.contact) &&
                Objects.equals(address, that.address) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(refundNum, that.refundNum) &&
                Objects.equals(driver, that.driver) &&
                Objects.equals(carNum, that.carNum) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(store, that.store) &&
                Objects.equals(revicer, that.revicer) &&
                Objects.equals(delFlag, that.delFlag) &&
                Objects.equals(printed, that.printed) &&
                Objects.equals(hadPaid, that.hadPaid) &&
                Objects.equals(paymentTime, that.paymentTime) &&
                Objects.equals(payConfirmer, that.payConfirmer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, customer, contact, address, phone, refundNum, driver, carNum, createTime, createUser, remark, store, revicer, delFlag, printed, hadPaid, paymentTime, payConfirmer);
    }
}