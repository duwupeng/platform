package com.beizhi.cloud.ms.servicea.dto;

import java.sql.Date;

/**
  * @author auto-tool
  */public class DUser {
   /**
   * 自增长主键
   */
   Integer id;

   /**
   * 用户名
   */
   String userName;

   /**
   * 
   */
   java.sql.Date bornAt;

   /**
   * 
   */
   String password;

   /**
   * 中文名
   */
   String nameCn;

   /**
   * 英文名
   */
   String nameEn;

   /**
   * 枚举描述,1:男(male);2:女(female)
   */
   Integer sex;

   /**
   * 状态,1:关(close);2:开(open);3:追加(pending)
   */
   Integer statusY;

 public String getUserName() {
  return userName;
 }

 public void setUserName(String userName) {
  this.userName = userName;
 }

 public Date getBornAt() {
  return bornAt;
 }

 public void setBornAt(Date bornAt) {
  this.bornAt = bornAt;
 }

 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String getNameCn() {
  return nameCn;
 }

 public void setNameCn(String nameCn) {
  this.nameCn = nameCn;
 }

 public String getNameEn() {
  return nameEn;
 }

 public void setNameEn(String nameEn) {
  this.nameEn = nameEn;
 }

 public Integer getSex() {
  return sex;
 }

 public void setSex(Integer sex) {
  this.sex = sex;
 }

 public Integer getStatusY() {
  return statusY;
 }

 public void setStatusY(Integer statusY) {
  this.statusY = statusY;
 }
}
