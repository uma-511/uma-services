package com.lgmn.umaservices.basic.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "yj_order", schema = "uma", catalog = "")
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate
public class YjOrderEntity implements Serializable {
    private int id;
    private String orderNum;
    private String number;
    private String name;
    private String specs;
    private String width;
    private String color;
    private Integer labelId;
    private String labelName;
    private String requirement;
    private Integer plannedQuantity;
    private Integer perPackQuantity;
    private String remark;
    private Timestamp deliveryDate;
    private Integer clientId;
    private String clientName;
    private String floor;
    private String createUserId;
    private String createUser;
    private Timestamp createTime;
    private Integer delFlag;

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
    @Column(name = "order_num", nullable = false, length = 20)
    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    @Basic
    @Column(name = "number", nullable = true, length = 20)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "specs", nullable = true, length = 10)
    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    @Basic
    @Column(name = "width", nullable = true, length = 10)
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Basic
    @Column(name = "color", nullable = true, length = 20)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "label_id", nullable = true)
    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    @Basic
    @Column(name = "label_name", nullable = true, length = 50)
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    @Basic
    @Column(name = "requirement", nullable = true, length = 500)
    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    @Basic
    @Column(name = "planned_quantity", nullable = true)
    public Integer getPlannedQuantity() {
        return plannedQuantity;
    }

    public void setPlannedQuantity(Integer plannedQuantity) {
        this.plannedQuantity = plannedQuantity;
    }

    @Basic
    @Column(name = "per_pack_quantity", nullable = true)
    public Integer getPerPackQuantity() {
        return perPackQuantity;
    }

    public void setPerPackQuantity(Integer perPackQuantity) {
        this.perPackQuantity = perPackQuantity;
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
    @Column(name = "delivery_date", nullable = true)
    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Basic
    @Column(name = "client_id", nullable = true)
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "client_name", nullable = true, length = 50)
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "floor", nullable = true, length = 10)
    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Basic
    @Column(name = "create_user_id", nullable = true, length = 50)
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
    @Column(name = "del_flag", nullable = true, length = 255)
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
        YjOrderEntity that = (YjOrderEntity) o;
        return id == that.id &&
                Objects.equals(orderNum, that.orderNum) &&
                Objects.equals(number, that.number) &&
                Objects.equals(name, that.name) &&
                Objects.equals(specs, that.specs) &&
                Objects.equals(width, that.width) &&
                Objects.equals(color, that.color) &&
                Objects.equals(labelId, that.labelId) &&
                Objects.equals(labelName, that.labelName) &&
                Objects.equals(requirement, that.requirement) &&
                Objects.equals(plannedQuantity, that.plannedQuantity) &&
                Objects.equals(perPackQuantity, that.perPackQuantity) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(deliveryDate, that.deliveryDate) &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(clientName, that.clientName) &&
                Objects.equals(floor, that.floor) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(delFlag, that.delFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNum, number, name, specs, width, color, labelId, labelName, requirement, plannedQuantity, perPackQuantity, remark, deliveryDate, clientId, clientName, floor, createUserId, createUser, createTime, delFlag);
    }
}