package com.lgmn.umaservices.basic.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "delivery_list", schema = "uma", catalog = "")
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate
public class DeliveryListEntity implements Serializable {
    private int id;
    private Integer deliveryId;
    private Integer clientId;
    private String clientName;
    private String number;
    private String name;
    private String specs;
    private String width;
    private String color;
    private String requirement;
    private Integer scanQuantity;
    private Integer residualQuantity;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;
    private Integer quantity;
    private Integer packageQuantity;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "delivery_id", nullable = true)
    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
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
    @Column(name = "requirement", nullable = true, length = 500)
    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    @Basic
    @Column(name = "scan_quantity", nullable = true)
    public Integer getScanQuantity() {
        return scanQuantity;
    }

    public void setScanQuantity(Integer scanQuantity) {
        this.scanQuantity = scanQuantity;
    }

    @Basic
    @Column(name = "residual_quantity", nullable = true)
    public Integer getResidualQuantity() {
        return residualQuantity;
    }

    public void setResidualQuantity(Integer residualQuantity) {
        this.residualQuantity = residualQuantity;
    }

    @Basic
    @Column(name = "unit_price", nullable = true, precision = 2)
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "total_price", nullable = true, precision = 2)
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Basic
    @Column(name = "quantity", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "package_quantity", nullable = true)
    public Integer getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(Integer packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryListEntity that = (DeliveryListEntity) o;
        return id == that.id &&
                Objects.equals(deliveryId, that.deliveryId) &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(clientName, that.clientName) &&
                Objects.equals(number, that.number) &&
                Objects.equals(name, that.name) &&
                Objects.equals(specs, that.specs) &&
                Objects.equals(width, that.width) &&
                Objects.equals(color, that.color) &&
                Objects.equals(requirement, that.requirement) &&
                Objects.equals(scanQuantity, that.scanQuantity) &&
                Objects.equals(residualQuantity, that.residualQuantity) &&
                Objects.equals(unitPrice, that.unitPrice) &&
                Objects.equals(totalPrice, that.totalPrice) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(packageQuantity, that.packageQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deliveryId, clientId, clientName, number, name, specs, width, color, requirement, scanQuantity, residualQuantity, unitPrice, totalPrice,quantity,packageQuantity);
    }
}