package com.lgmn.umaservices.basic.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "label_record", schema = "uma", catalog = "")
@DynamicUpdate
@DynamicInsert
@SelectBeforeUpdate
public class LabelRecordEntity implements Serializable {
    private int id;
    private String labelNum;
    private Integer packId;
    private Integer orderId;
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
    private Byte recordType;
    private Integer quantity;
    private String machineNum;
    private String banci;
    private String specs;
    private String deliveryNum;

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
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
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
    public Byte getRecordType() {
        return recordType;
    }

    public void setRecordType(Byte recordType) {
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
    @Column(name = "specs", nullable = true, length = 20)
    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
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
    @Column(name = "delivery_num", nullable = true, length = 20)
    public String getDeliveryNum() {
        return deliveryNum;
    }

    public void setDeliveryNum(String deliveryNum) {
        this.deliveryNum = deliveryNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabelRecordEntity entity = (LabelRecordEntity) o;
        return id == entity.id &&
                Objects.equals(orderId, entity.orderId) &&
                Objects.equals(labelNum, entity.labelNum) &&
                Objects.equals(packId, entity.packId) &&
                Objects.equals(prodId, entity.prodId) &&
                Objects.equals(modelId, entity.modelId) &&
                Objects.equals(status, entity.status) &&
                Objects.equals(prodTime, entity.prodTime) &&
                Objects.equals(inTime, entity.inTime) &&
                Objects.equals(outTime, entity.outTime) &&
                Objects.equals(invalidTime, entity.invalidTime) &&
                Objects.equals(labelType, entity.labelType) &&
                Objects.equals(netWeight, entity.netWeight) &&
                Objects.equals(grossWeight, entity.grossWeight) &&
                Objects.equals(skinWeight, entity.skinWeight) &&
                Objects.equals(prodUser, entity.prodUser) &&
                Objects.equals(inUser, entity.inUser) &&
                Objects.equals(outUser, entity.outUser) &&
                Objects.equals(invalidUser, entity.invalidUser) &&
                Objects.equals(recordType, entity.recordType) &&
                Objects.equals(quantity, entity.quantity) &&
                Objects.equals(machineNum, entity.machineNum) &&
                Objects.equals(banci, entity.banci)&&
                Objects.equals(specs, entity.specs)&&
                Objects.equals(deliveryNum, entity.deliveryNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, labelNum, packId, orderId, prodId, modelId, status, prodTime, inTime, outTime, invalidTime, labelType, netWeight, grossWeight, skinWeight, prodUser, inUser, outUser, invalidUser, recordType, quantity, machineNum, banci,specs,deliveryNum);
    }
}