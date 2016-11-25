package com.beizhi.cloud.ms.servicea.domain;

import java.util.Date;

/**
 * Created by eric on 16/11/26.
 */
public class TUser {
    String NameCn;
    String NameEn;
    Date BornAt;
    String userName;
    String password;

    public String getNameCn() {
        return NameCn;
    }

    public void setNameCn(String nameCn) {
        NameCn = nameCn;
    }

    public String getNameEn() {
        return NameEn;
    }

    public void setNameEn(String nameEn) {
        NameEn = nameEn;
    }

    public Date getBornAt() {
        return BornAt;
    }

    public void setBornAt(Date bornAt) {
        BornAt = bornAt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
