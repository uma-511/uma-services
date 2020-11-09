package com.lgmn.umaservices.basic.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "view_look_board", schema = "uma", catalog = "")
public class ViewLookBoardEntity implements Serializable {
    private Integer id;
    private String number;
    private String name;
    private String specs;
    private String width;
    private String color;
    private Integer plannedQuantity;
    private String floor;
    private Integer finishedQuantity;
    private Timestamp deliveryDate;
    private String orderNum;
    private String customerCode;
    private Integer overDate;
    private Timestamp createTime;
    @Id
    @Column(name = "id", nullable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "planned_quantity", nullable = true)
    public Integer getPlannedQuantity() {
        return plannedQuantity;
    }

    public void setPlannedQuantity(Integer plannedQuantity) {
        this.plannedQuantity = plannedQuantity;
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
    @Column(name = "finished_quantity", nullable = true, precision = 0)
    public Integer getFinishedQuantity() {
        return finishedQuantity;
    }

    public void setFinishedQuantity(Integer finishedQuantity) {
        this.finishedQuantity = finishedQuantity;
    }

    @Basic
    @Column(name = "delivery_date", nullable = true)
    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewLookBoardEntity that = (ViewLookBoardEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(specs, that.specs) &&
                Objects.equals(width, that.width) &&
                Objects.equals(color, that.color) &&
                Objects.equals(plannedQuantity, that.plannedQuantity) &&
                Objects.equals(floor, that.floor) &&
                Objects.equals(finishedQuantity, that.finishedQuantity) &&
                Objects.equals(deliveryDate, that.deliveryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, specs, width, color, plannedQuantity, floor, finishedQuantity, deliveryDate);
    }

    @Basic
    @Column(name = "order_num", nullable = true, length = 20)
    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    @Basic
    @Column(name = "customer_code", nullable = true, length = 50)
    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Basic
    @Column(name = "over_date", nullable = true)
    public Integer getOverDate() {
        return overDate;
    }

    public void setOverDate(Integer overDate) {
        this.overDate = overDate;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}