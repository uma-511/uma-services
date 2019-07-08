package com.lgmn.umaservices.basic.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "label_record", schema = "uma", catalog = "")
public class LabelRecordEntity {
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
    private Byte recordType;

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
    public Byte getRecordType() {
        return recordType;
    }

    public void setRecordType(Byte recordType) {
        this.recordType = recordType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabelRecordEntity that = (LabelRecordEntity) o;
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
                Objects.equals(recordType, that.recordType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, labelNum, packId, orderId, prodId, modelId, status, prodTime, inTime, outTime, invalidTime, labelType, netWeight, grossWeight, skinWeight, prodUser, inUser, outUser, invalidUser, recordType);
    }
}