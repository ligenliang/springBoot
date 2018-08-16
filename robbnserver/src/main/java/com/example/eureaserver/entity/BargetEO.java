package com.example.eureaserver.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name="sys_barget")
public class BargetEO {
    @Id
    private Integer userId;
    @Column(name="barget")
    private Double barget;
    @Column(name="char_type")
    private Integer charType;
    @Column(name = "char_name")
    private String char_name;
    @Column(name = "total_barget")
    private Double totalBarget;
    @Column(name = "date")
    private Date date;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getBarget() {
        return barget;
    }

    public void setBarget(Double barget) {
        this.barget = barget;
    }

    public Integer getCharType() {
        return charType;
    }

    public void setCharType(Integer charType) {
        this.charType = charType;
    }

    public String getChar_name() {
        return char_name;
    }

    public void setChar_name(String char_name) {
        this.char_name = char_name;
    }

    public Double getTotalBarget() {
        return totalBarget;
    }

    public void setTotalBarget(Double totalBarget) {
        this.totalBarget = totalBarget;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
