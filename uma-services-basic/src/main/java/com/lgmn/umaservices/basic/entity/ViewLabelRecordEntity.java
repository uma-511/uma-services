package com.lgmn.umaservices.basic.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "view_label_record", schema = "uma", catalog = "")
public class ViewLabelRecordEntity implements Serializable {
    private int id;
    private String labelNum;
    private Integer packId;
    private int orderId;
    private Integer prodId;
    private Integer modelId;
    private Integer status;
    private Timestamp prodTime;
    private Timestamp inTime;
    private Timestamp outTime;
    private Timestamp invalidTime;
    private Integer labelType;
    private BigDecimal netWeight;
    private BigDecimal grossWeight;
    private BigDecimal skinWeight;
    private String prodUser;
    private String inUser;
    private String outUser;
    private String invalidUser;
    private Integer recordType;
    private Integer quantity;
    private String machineNum;
    private String banci;
    private String deliveryNum;
    private String orderNo;
    private Integer clientId;
    private String clientName;
    private String requirement;
    private Timestamp deliveryDate;
    private Integer orderQuantity;
    private String floor;
    private Integer perPackQuantity;
    private String productName;
    private String modelName;
    private BigDecimal longs;
    private BigDecimal weight;
    private String width;
    private String materialQuality;
    private String lines;
    private String specs;
    private String yard;
    private String color;
    private String inAccount;
    private String outAccount;
    private String invalidAccount;
    private String prodAccount;
    private String customerName;

    @Basic
    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "label_num", nullable = true, length = 18)
    public String getLabelNum() {
        return labelNum;
    }

    public void setLabelNum(String labelNum) {
        this.labelNum = labelNum;
    }

    @Basic
    @Column(name = "pack_id", nullable = true)
    public Integer getPackId() {
        return packId;
    }

    public void setPackId(Integer packId) {
        this.packId = packId;
    }

    @Basic
    @Column(name = "order_id", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "prod_id", nullable = true)
    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    @Basic
    @Column(name = "model_id", nullable = true)
    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "prod_time", nullable = true)
    public Timestamp getProdTime() {
        return prodTime;
    }

    public void setProdTime(Timestamp prodTime) {
        this.prodTime = prodTime;
    }

    @Basic
    @Column(name = "in_time", nullable = true)
    public Timestamp getInTime() {
        return inTime;
    }

    public void setInTime(Timestamp inTime) {
        this.inTime = inTime;
    }

    @Basic
    @Column(name = "out_time", nullable = true)
    public Timestamp getOutTime() {
        return outTime;
    }

    public void setOutTime(Timestamp outTime) {
        this.outTime = outTime;
    }

    @Basic
    @Column(name = "invalid_time", nullable = true)
    public Timestamp getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(Timestamp invalidTime) {
        this.invalidTime = invalidTime;
    }

    @Basic
    @Column(name = "label_type", nullable = true)
    public Integer getLabelType() {
        return labelType;
    }

    public void setLabelType(Integer labelType) {
        this.labelType = labelType;
    }

    @Basic
    @Column(name = "net_weight", nullable = true, precision = 2)
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    @Basic
    @Column(name = "gross_weight", nullable = true, precision = 2)
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    @Basic
    @Column(name = "skin_weight", nullable = true, precision = 2)
    public BigDecimal getSkinWeight() {
        return skinWeight;
    }

    public void setSkinWeight(BigDecimal skinWeight) {
        this.skinWeight = skinWeight;
    }

    @Basic
    @Column(name = "prod_user", nullable = true, length = 32)
    public String getProdUser() {
        return prodUser;
    }

    public void setProdUser(String prodUser) {
        this.prodUser = prodUser;
    }

    @Basic
    @Column(name = "in_user", nullable = true, length = 32)
    public String getInUser() {
        return inUser;
    }

    public void setInUser(String inUser) {
        this.inUser = inUser;
    }

    @Basic
    @Column(name = "out_user", nullable = true, length = 32)
    public String getOutUser() {
        return outUser;
    }

    public void setOutUser(String outUser) {
        this.outUser = outUser;
    }

    @Basic
    @Column(name = "invalid_user", nullable = true, length = 32)
    public String getInvalidUser() {
        return invalidUser;
    }

    public void setInvalidUser(String invalidUser) {
        this.invalidUser = invalidUser;
    }

    @Basic
    @Column(name = "record_type", nullable = true)
    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
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
    @Column(name = "machine_num", nullable = true, length = 20)
    public String getMachineNum() {
        return machineNum;
    }

    public void setMachineNum(String machineNum) {
        this.machineNum = machineNum;
    }

    @Basic
    @Column(name = "banci", nullable = true, length = 20)
    public String getBanci() {
        return banci;
    }

    public void setBanci(String banci) {
        this.banci = banci;
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
    @Column(name = "order_no", nullable = true, length = 20)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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
    @Column(name = "client_name")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
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
    @Column(name = "product_name", nullable = true, length = 30)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "model_name", nullable = true, length = 30)
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Basic
    @Column(name = "longs", nullable = true, precision = 2)
    public BigDecimal getLongs() {
        return longs;
    }

    public void setLongs(BigDecimal longs) {
        this.longs = longs;
    }

    @Basic
    @Column(name = "weight", nullable = true, precision = 2)
    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
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
    @Column(name = "material_quality", nullable = true, length = 100)
    public String getMaterialQuality() {
        return materialQuality;
    }

    public void setMaterialQuality(String materialQuality) {
        this.materialQuality = materialQuality;
    }

    @Basic
    @Column(name = "lines", nullable = true, length = 100)
    public String getLines() {
        return lines;
    }

    public void setLines(String lines) {
        this.lines = lines;
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
    @Column(name = "yard", nullable = true, length = 100)
    public String getYard() {
        return yard;
    }

    public void setYard(String yard) {
        this.yard = yard;
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
    @Column(name = "in_account", nullable = true, length = 30)
    public String getInAccount() {
        return inAccount;
    }

    public void setInAccount(String inAccount) {
        this.inAccount = inAccount;
    }

    @Basic
    @Column(name = "out_account", nullable = true, length = 30)
    public String getOutAccount() {
        return outAccount;
    }

    public void setOutAccount(String outAccount) {
        this.outAccount = outAccount;
    }

    @Basic
    @Column(name = "invalid_account", nullable = true, length = 30)
    public String getInvalidAccount() {
        return invalidAccount;
    }

    public void setInvalidAccount(String invalidAccount) {
        this.invalidAccount = invalidAccount;
    }

    @Basic
    @Column(name = "prod_account", nullable = true, length = 30)
    public String getProdAccount() {
        return prodAccount;
    }

    public void setProdAccount(String prodAccount) {
        this.prodAccount = prodAccount;
    }

    @Basic
    @Column(name = "customer_name", nullable = true, length = 100)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewLabelRecordEntity that = (ViewLabelRecordEntity) o;
        return id == that.id &&
                orderId == that.orderId &&
                Objects.equals(labelNum, that.labelNum) &&
                Objects.equals(packId, that.packId) &&
                Objects.equals(prodId, that.prodId) &&
                Objects.equals(modelId, that.modelId) &&
                Objects.equals(status, that.status) &&
                Objects.equals(prodTime, that.prodTime) &&
                Objects.equals(inTime, that.inTime) &&
                Objects.equals(outTime, that.outTime) &&
                Objects.equals(invalidTime, that.invalidTime) &&
                Objects.equals(labelType, that.labelType) &&
                Objects.equals(netWeight, that.netWeight) &&
                Objects.equals(grossWeight, that.grossWeight) &&
                Objects.equals(skinWeight, that.skinWeight) &&
                Objects.equals(prodUser, that.prodUser) &&
                Objects.equals(inUser, that.inUser) &&
                Objects.equals(outUser, that.outUser) &&
                Objects.equals(invalidUser, that.invalidUser) &&
                Objects.equals(recordType, that.recordType) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(machineNum, that.machineNum) &&
                Objects.equals(banci, that.banci) &&
                Objects.equals(deliveryNum, that.deliveryNum) &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(clientName, that.clientName) &&
                Objects.equals(requirement, that.requirement) &&
                Objects.equals(deliveryDate, that.deliveryDate) &&
                Objects.equals(orderQuantity, that.orderQuantity) &&
                Objects.equals(floor, that.floor) &&
                Objects.equals(perPackQuantity, that.perPackQuantity) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(modelName, that.modelName) &&
                Objects.equals(longs, that.longs) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(width, that.width) &&
                Objects.equals(materialQuality, that.materialQuality) &&
                Objects.equals(lines, that.lines) &&
                Objects.equals(specs, that.specs) &&
                Objects.equals(yard, that.yard) &&
                Objects.equals(color, that.color) &&
                Objects.equals(inAccount, that.inAccount) &&
                Objects.equals(outAccount, that.outAccount) &&
                Objects.equals(invalidAccount, that.invalidAccount) &&
                Objects.equals(prodAccount, that.prodAccount) &&
                Objects.equals(customerName, that.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, labelNum, packId, orderId, prodId, modelId, status, prodTime, inTime, outTime, invalidTime, labelType, netWeight, grossWeight, skinWeight, prodUser, inUser, outUser, invalidUser, recordType, quantity, machineNum, banci, deliveryNum, orderNo, clientId, clientName, requirement, deliveryDate, orderQuantity, floor, perPackQuantity, productName, modelName, longs, weight, width, materialQuality, lines, specs, yard, color, inAccount, outAccount, invalidAccount, prodAccount, customerName);
    }
}