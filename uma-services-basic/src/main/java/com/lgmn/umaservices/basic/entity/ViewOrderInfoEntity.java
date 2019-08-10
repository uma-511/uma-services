package com.lgmn.umaservices.basic.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "view_order_info", schema = "uma", catalog = "")
public class ViewOrderInfoEntity implements Serializable {
    private int orderId;
    private String orderNo;
    private String requirement;
    private Timestamp deliveryDate;
    private Integer orderQuantity;
    private String floor;
    private Integer perPackQuantity;
    private String productName;
    private String modelName;
    private String specs;
    private String color;
    private String width;
    private Integer labelId;
    private Integer clientId;
    private int prodId;
    private int modelId;
    private int longs;
    private int weight;
    private String yard;
    private String materialQuality;
    private String lines;
    private String cumulativeWeight;
    private String cumulativeQuantity;
    private String labelCount;
    private String labelNum;
    private int packNum;

    @Id
    @Basic
    @Column(name = "order_id", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_no", nullable = false, length = 20)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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
    @Column(name = "delivery_date", nullable = true)
    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Basic
    @Column(name = "order_quantity", nullable = true)
    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
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
    @Column(name = "per_pack_quantity", nullable = true)
    public Integer getPerPackQuantity() {
        return perPackQuantity;
    }

    public void setPerPackQuantity(Integer perPackQuantity) {
        this.perPackQuantity = perPackQuantity;
    }

    @Basic
    @Column(name = "product_name", nullable = true, length = 20)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "model_name", nullable = true, length = 20)
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
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
    @Column(name = "color", nullable = true, length = 20)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    @Column(name = "label_id", nullable = true)
    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
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
    @Column(name = "prod_id", nullable = false)
    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    @Basic
    @Column(name = "model_id", nullable = false)
    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    @Basic
    @Column(name = "longs", nullable = false)
    public int getLongs() {
        return longs;
    }

    public void setLongs(int longs) {
        this.longs = longs;
    }

    @Basic
    @Column(name = "weight", nullable = false)
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "yard", nullable = false, length = 0)
    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
    }

    @Basic
    @Column(name = "material_quality", nullable = false, length = 0)
    public String getMaterialQuality() {
        return materialQuality;
    }

    public void setMaterialQuality(String materialQuality) {
        this.materialQuality = materialQuality;
    }

    @Basic
    @Column(name = "lines", nullable = false, length = 0)
    public String getLines() {
        return lines;
    }

    public void setLines(String lines) {
        this.lines = lines;
    }

    @Basic
    @Column(name = "cumulative_weight", nullable = false, length = 32)
    public String getCumulativeWeight() {
        return cumulativeWeight;
    }

    public void setCumulativeWeight(String cumulativeWeight) {
        this.cumulativeWeight = cumulativeWeight;
    }

    @Basic
    @Column(name = "cumulative_quantity", nullable = false, length = 88)
    public String getCumulativeQuantity() {
        return cumulativeQuantity;
    }

    public void setCumulativeQuantity(String cumulativeQuantity) {
        this.cumulativeQuantity = cumulativeQuantity;
    }

    @Basic
    @Column(name = "label_count", nullable = false, length = 21)
    public String getLabelCount() {
        return labelCount;
    }

    public void setLabelCount(String labelCount) {
        this.labelCount = labelCount;
    }

    @Basic
    @Column(name = "label_num", nullable = false, length = 18)
    public String getLabelNum() {
        return labelNum;
    }

    public void setLabelNum(String labelNum) {
        this.labelNum = labelNum;
    }

    @Basic
    @Column(name = "pack_num", nullable = false)
    public int getPackNum() {
        return packNum;
    }

    public void setPackNum(int packNum) {
        this.packNum = packNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewOrderInfoEntity that = (ViewOrderInfoEntity) o;
        return orderId == that.orderId &&
                prodId == that.prodId &&
                modelId == that.modelId &&
                longs == that.longs &&
                weight == that.weight &&
                packNum == that.packNum &&
                labelNum == that.labelNum &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(requirement, that.requirement) &&
                Objects.equals(deliveryDate, that.deliveryDate) &&
                Objects.equals(orderQuantity, that.orderQuantity) &&
                Objects.equals(floor, that.floor) &&
                Objects.equals(perPackQuantity, that.perPackQuantity) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(modelName, that.modelName) &&
                Objects.equals(specs, that.specs) &&
                Objects.equals(color, that.color) &&
                Objects.equals(width, that.width) &&
                Objects.equals(labelId, that.labelId) &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(yard, that.yard) &&
                Objects.equals(materialQuality, that.materialQuality) &&
                Objects.equals(lines, that.lines) &&
                Objects.equals(cumulativeWeight, that.cumulativeWeight) &&
                Objects.equals(cumulativeQuantity, that.cumulativeQuantity) &&
                Objects.equals(labelCount, that.labelCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderNo, requirement, deliveryDate, orderQuantity, floor, perPackQuantity, productName, modelName, specs, color, width, labelId, clientId, prodId, modelId, longs, weight, yard, materialQuality, lines, cumulativeWeight, cumulativeQuantity, labelCount, labelNum, packNum);
    }
}