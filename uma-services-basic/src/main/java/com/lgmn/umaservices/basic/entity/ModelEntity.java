package com.lgmn.umaservices.basic.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "model", schema = "uma", catalog = "")
public class ModelEntity {
    private int id;
    private Integer pid;
    private String name;
    private BigDecimal longs;
    private BigDecimal width;
    private BigDecimal height;
    private BigDecimal weight;
    private String longUnit;
    private String widthUnit;
    private String heightUnit;
    private String weightUnit;
    private String color;
    private String remark;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "pid", nullable = true)
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 60)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "width", nullable = true, precision = 2)
    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    @Basic
    @Column(name = "height", nullable = true, precision = 2)
    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
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
    @Column(name = "long_unit", nullable = true, length = 10)
    public String getLongUnit() {
        return longUnit;
    }

    public void setLongUnit(String longUnit) {
        this.longUnit = longUnit;
    }

    @Basic
    @Column(name = "width_unit", nullable = true, length = 10)
    public String getWidthUnit() {
        return widthUnit;
    }

    public void setWidthUnit(String widthUnit) {
        this.widthUnit = widthUnit;
    }

    @Basic
    @Column(name = "height_unit", nullable = true, length = 10)
    public String getHeightUnit() {
        return heightUnit;
    }

    public void setHeightUnit(String heightUnit) {
        this.heightUnit = heightUnit;
    }

    @Basic
    @Column(name = "weight_unit", nullable = true, length = 10)
    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    @Basic
    @Column(name = "color", nullable = true, length = 10)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 500)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModelEntity that = (ModelEntity) o;
        return id == that.id &&
                Objects.equals(pid, that.pid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(longs, that.longs) &&
                Objects.equals(width, that.width) &&
                Objects.equals(height, that.height) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(longUnit, that.longUnit) &&
                Objects.equals(widthUnit, that.widthUnit) &&
                Objects.equals(heightUnit, that.heightUnit) &&
                Objects.equals(weightUnit, that.weightUnit) &&
                Objects.equals(color, that.color) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pid, name, longs, width, height, weight, longUnit, widthUnit, heightUnit, weightUnit, color, remark);
    }
}