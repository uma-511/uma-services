package com.lgmn.umaservices.basic.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "view_yj_stock", schema = "uma", catalog = "")
public class ViewYjStockEntity implements Serializable {
    private Integer id;
    private String name;
    private String specs;
    private String width;
    private String color;
    private Integer stock;
    private Integer drk;

    @Basic
    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "specs")
    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    @Basic
    @Column(name = "width")
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "stock")
    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "drk")
    public Integer getDrk() {
        return drk;
    }

    public void setDrk(Integer drk) {
        this.drk = drk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewYjStockEntity that = (ViewYjStockEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(specs, that.specs) &&
                Objects.equals(width, that.width) &&
                Objects.equals(color, that.color) &&
                Objects.equals(stock, that.stock) &&
                Objects.equals(drk, that.drk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, specs, width, color, stock, drk);
    }
}
