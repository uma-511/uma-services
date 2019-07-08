package com.lgmn.umaservices.basic.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "order", schema = "uma", catalog = "")
public class OrderEntity {
    private int id;
    private String orderNo;
    private int prodId;
    private Integer modelId;
    private Integer clientId;
    private String requirement;
    private String remark;
    private Integer lableId;
    private Timestamp createTime;
    private String createUser;
    private Timestamp deliveryDate;
    private Integer quantity;
    private Integer int1;
    private Integer int2;
    private Integer int3;
    private Integer int4;
    private Integer int5;
    private String var501;
    private String var502;
    private String var503;
    private String var504;
    private String var505;
    private String var1001;
    private String var1002;
    private String var1003;
    private String var1004;
    private String var1005;
    private String var2001;
    private String var2002;
    private String var2003;
    private String var2004;
    private String var2005;
    private Timestamp datetime1;
    private Timestamp datetime2;
    private BigDecimal decimal1021;
    private BigDecimal decimal1022;
    private BigDecimal decimal1023;
    private BigDecimal decimal1024;
    private BigDecimal decimal1131;
    private BigDecimal decimal1132;
    private BigDecimal decimal1133;
    private BigDecimal decimal1134;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_no", nullable = false, length = 12)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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
    @Column(name = "model_id", nullable = true)
    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
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
    @Column(name = "requirement", nullable = true, length = 500)
    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
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
    @Column(name = "lable_id", nullable = true)
    public Integer getLableId() {
        return lableId;
    }

    public void setLableId(Integer lableId) {
        this.lableId = lableId;
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
    @Column(name = "create_user", nullable = true, length = 0)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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
    @Column(name = "quantity", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "int1", nullable = true)
    public Integer getInt1() {
        return int1;
    }

    public void setInt1(Integer int1) {
        this.int1 = int1;
    }

    @Basic
    @Column(name = "int2", nullable = true)
    public Integer getInt2() {
        return int2;
    }

    public void setInt2(Integer int2) {
        this.int2 = int2;
    }

    @Basic
    @Column(name = "int3", nullable = true)
    public Integer getInt3() {
        return int3;
    }

    public void setInt3(Integer int3) {
        this.int3 = int3;
    }

    @Basic
    @Column(name = "int4", nullable = true)
    public Integer getInt4() {
        return int4;
    }

    public void setInt4(Integer int4) {
        this.int4 = int4;
    }

    @Basic
    @Column(name = "int5", nullable = true)
    public Integer getInt5() {
        return int5;
    }

    public void setInt5(Integer int5) {
        this.int5 = int5;
    }

    @Basic
    @Column(name = "var501", nullable = true, length = 50)
    public String getVar501() {
        return var501;
    }

    public void setVar501(String var501) {
        this.var501 = var501;
    }

    @Basic
    @Column(name = "var502", nullable = true, length = 50)
    public String getVar502() {
        return var502;
    }

    public void setVar502(String var502) {
        this.var502 = var502;
    }

    @Basic
    @Column(name = "var503", nullable = true, length = 50)
    public String getVar503() {
        return var503;
    }

    public void setVar503(String var503) {
        this.var503 = var503;
    }

    @Basic
    @Column(name = "var504", nullable = true, length = 50)
    public String getVar504() {
        return var504;
    }

    public void setVar504(String var504) {
        this.var504 = var504;
    }

    @Basic
    @Column(name = "var505", nullable = true, length = 50)
    public String getVar505() {
        return var505;
    }

    public void setVar505(String var505) {
        this.var505 = var505;
    }

    @Basic
    @Column(name = "var1001", nullable = true, length = 100)
    public String getVar1001() {
        return var1001;
    }

    public void setVar1001(String var1001) {
        this.var1001 = var1001;
    }

    @Basic
    @Column(name = "var1002", nullable = true, length = 100)
    public String getVar1002() {
        return var1002;
    }

    public void setVar1002(String var1002) {
        this.var1002 = var1002;
    }

    @Basic
    @Column(name = "var1003", nullable = true, length = 100)
    public String getVar1003() {
        return var1003;
    }

    public void setVar1003(String var1003) {
        this.var1003 = var1003;
    }

    @Basic
    @Column(name = "var1004", nullable = true, length = 100)
    public String getVar1004() {
        return var1004;
    }

    public void setVar1004(String var1004) {
        this.var1004 = var1004;
    }

    @Basic
    @Column(name = "var1005", nullable = true, length = 100)
    public String getVar1005() {
        return var1005;
    }

    public void setVar1005(String var1005) {
        this.var1005 = var1005;
    }

    @Basic
    @Column(name = "var2001", nullable = true, length = 200)
    public String getVar2001() {
        return var2001;
    }

    public void setVar2001(String var2001) {
        this.var2001 = var2001;
    }

    @Basic
    @Column(name = "var2002", nullable = true, length = 200)
    public String getVar2002() {
        return var2002;
    }

    public void setVar2002(String var2002) {
        this.var2002 = var2002;
    }

    @Basic
    @Column(name = "var2003", nullable = true, length = 200)
    public String getVar2003() {
        return var2003;
    }

    public void setVar2003(String var2003) {
        this.var2003 = var2003;
    }

    @Basic
    @Column(name = "var2004", nullable = true, length = 200)
    public String getVar2004() {
        return var2004;
    }

    public void setVar2004(String var2004) {
        this.var2004 = var2004;
    }

    @Basic
    @Column(name = "var2005", nullable = true, length = 200)
    public String getVar2005() {
        return var2005;
    }

    public void setVar2005(String var2005) {
        this.var2005 = var2005;
    }

    @Basic
    @Column(name = "datetime1", nullable = true)
    public Timestamp getDatetime1() {
        return datetime1;
    }

    public void setDatetime1(Timestamp datetime1) {
        this.datetime1 = datetime1;
    }

    @Basic
    @Column(name = "datetime2", nullable = true)
    public Timestamp getDatetime2() {
        return datetime2;
    }

    public void setDatetime2(Timestamp datetime2) {
        this.datetime2 = datetime2;
    }

    @Basic
    @Column(name = "decimal1021", nullable = true, precision = 2)
    public BigDecimal getDecimal1021() {
        return decimal1021;
    }

    public void setDecimal1021(BigDecimal decimal1021) {
        this.decimal1021 = decimal1021;
    }

    @Basic
    @Column(name = "decimal1022", nullable = true, precision = 2)
    public BigDecimal getDecimal1022() {
        return decimal1022;
    }

    public void setDecimal1022(BigDecimal decimal1022) {
        this.decimal1022 = decimal1022;
    }

    @Basic
    @Column(name = "decimal1023", nullable = true, precision = 2)
    public BigDecimal getDecimal1023() {
        return decimal1023;
    }

    public void setDecimal1023(BigDecimal decimal1023) {
        this.decimal1023 = decimal1023;
    }

    @Basic
    @Column(name = "decimal1024", nullable = true, precision = 2)
    public BigDecimal getDecimal1024() {
        return decimal1024;
    }

    public void setDecimal1024(BigDecimal decimal1024) {
        this.decimal1024 = decimal1024;
    }

    @Basic
    @Column(name = "decimal1131", nullable = true, precision = 3)
    public BigDecimal getDecimal1131() {
        return decimal1131;
    }

    public void setDecimal1131(BigDecimal decimal1131) {
        this.decimal1131 = decimal1131;
    }

    @Basic
    @Column(name = "decimal1132", nullable = true, precision = 3)
    public BigDecimal getDecimal1132() {
        return decimal1132;
    }

    public void setDecimal1132(BigDecimal decimal1132) {
        this.decimal1132 = decimal1132;
    }

    @Basic
    @Column(name = "decimal1133", nullable = true, precision = 3)
    public BigDecimal getDecimal1133() {
        return decimal1133;
    }

    public void setDecimal1133(BigDecimal decimal1133) {
        this.decimal1133 = decimal1133;
    }

    @Basic
    @Column(name = "decimal1134", nullable = true, precision = 3)
    public BigDecimal getDecimal1134() {
        return decimal1134;
    }

    public void setDecimal1134(BigDecimal decimal1134) {
        this.decimal1134 = decimal1134;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return id == that.id &&
                prodId == that.prodId &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(modelId, that.modelId) &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(requirement, that.requirement) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(lableId, that.lableId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUser, that.createUser) &&
                Objects.equals(deliveryDate, that.deliveryDate) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(int1, that.int1) &&
                Objects.equals(int2, that.int2) &&
                Objects.equals(int3, that.int3) &&
                Objects.equals(int4, that.int4) &&
                Objects.equals(int5, that.int5) &&
                Objects.equals(var501, that.var501) &&
                Objects.equals(var502, that.var502) &&
                Objects.equals(var503, that.var503) &&
                Objects.equals(var504, that.var504) &&
                Objects.equals(var505, that.var505) &&
                Objects.equals(var1001, that.var1001) &&
                Objects.equals(var1002, that.var1002) &&
                Objects.equals(var1003, that.var1003) &&
                Objects.equals(var1004, that.var1004) &&
                Objects.equals(var1005, that.var1005) &&
                Objects.equals(var2001, that.var2001) &&
                Objects.equals(var2002, that.var2002) &&
                Objects.equals(var2003, that.var2003) &&
                Objects.equals(var2004, that.var2004) &&
                Objects.equals(var2005, that.var2005) &&
                Objects.equals(datetime1, that.datetime1) &&
                Objects.equals(datetime2, that.datetime2) &&
                Objects.equals(decimal1021, that.decimal1021) &&
                Objects.equals(decimal1022, that.decimal1022) &&
                Objects.equals(decimal1023, that.decimal1023) &&
                Objects.equals(decimal1024, that.decimal1024) &&
                Objects.equals(decimal1131, that.decimal1131) &&
                Objects.equals(decimal1132, that.decimal1132) &&
                Objects.equals(decimal1133, that.decimal1133) &&
                Objects.equals(decimal1134, that.decimal1134);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderNo, prodId, modelId, clientId, requirement, remark, lableId, createTime, createUser, deliveryDate, quantity, int1, int2, int3, int4, int5, var501, var502, var503, var504, var505, var1001, var1002, var1003, var1004, var1005, var2001, var2002, var2003, var2004, var2005, datetime1, datetime2, decimal1021, decimal1022, decimal1023, decimal1024, decimal1131, decimal1132, decimal1133, decimal1134);
    }
}