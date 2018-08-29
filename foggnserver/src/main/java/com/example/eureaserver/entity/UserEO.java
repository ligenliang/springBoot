package com.example.eureaserver.entity;

import io.swagger.models.auth.In;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="sys_user")
public class UserEO implements Cloneable, Serializable {
    @Id
    private Integer userId;
    @Column(name="user_name")
    private String userName;
    @Column(name="pass_word")
    private String passWorld;

    public String getPassWorld() {
        return passWorld;
    }

    public void setPassWorld(String passWorld) {
        this.passWorld = passWorld;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
