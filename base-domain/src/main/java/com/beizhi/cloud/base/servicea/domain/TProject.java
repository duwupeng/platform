package com.beizhi.cloud.base.servicea.domain;

import java.sql.Timestamp;

/**
  * @author auto-tool
  */public class TProject {
   /**
   * 
   */
   Integer projectId;

   /**
   * 项目名称
   */
   String projectName;

   /**
   * 所属企业id
   */
   Integer companyId;

   /**
   * 所属企业名称
   */
   String companyName;

   /**
   * 创建人id
   */
   Integer creatorId;

   /**
   * 创建人
   */
   String creatorName;

   /**
   * 创建时间
   */
   Timestamp createdAt;

   /**
   * 最后修改人id
   */
   Integer updatorId;

   /**
   * 最后修改人
   */
   String updatorName;

   /**
   * 最后更新时间
   */
   String updatedAt;

   /**
   * 项目状态,1:启用中(OnUsing);2:已停用(Stop);3:已删除(Cancel)
   */
   Integer status;

   /**
   * 项目开始时间
   */
   Timestamp startTime;

   /**
   * 项目结束时间
   */
   Timestamp endTime;

   /**
   * 项目说明
   */
   String projectDesc;

   /**
   * 扫码人次上限
   */
   Integer scanTotal;

   /**
   * 扫码人次剩余
   */
   Integer scanRemain;

    TProduct product;

    public TProduct getProduct() {
        return product;
    }

    public void setProduct(TProduct product) {
        this.product = product;
    }

    public Integer getProjectId() {
  return projectId;
 }

 public void setProjectId(Integer projectId) {
  this.projectId = projectId;
 }

 public String getProjectName() {
  return projectName;
 }

 public void setProjectName(String projectName) {
  this.projectName = projectName;
 }

 public Integer getCompanyId() {
  return companyId;
 }

 public void setCompanyId(Integer companyId) {
  this.companyId = companyId;
 }

 public String getCompanyName() {
  return companyName;
 }

 public void setCompanyName(String companyName) {
  this.companyName = companyName;
 }

 public Integer getCreatorId() {
  return creatorId;
 }

 public void setCreatorId(Integer creatorId) {
  this.creatorId = creatorId;
 }

 public String getCreatorName() {
  return creatorName;
 }

 public void setCreatorName(String creatorName) {
  this.creatorName = creatorName;
 }

 public Timestamp getCreatedAt() {
  return createdAt;
 }

 public void setCreatedAt(Timestamp createdAt) {
  this.createdAt = createdAt;
 }

 public Integer getUpdatorId() {
  return updatorId;
 }

 public void setUpdatorId(Integer updatorId) {
  this.updatorId = updatorId;
 }

 public String getUpdatorName() {
  return updatorName;
 }

 public void setUpdatorName(String updatorName) {
  this.updatorName = updatorName;
 }

 public String getUpdatedAt() {
  return updatedAt;
 }

 public void setUpdatedAt(String updatedAt) {
  this.updatedAt = updatedAt;
 }

 public Integer getStatus() {
  return status;
 }

 public void setStatus(Integer status) {
  this.status = status;
 }

 public Timestamp getStartTime() {
  return startTime;
 }

 public void setStartTime(Timestamp startTime) {
  this.startTime = startTime;
 }

 public Timestamp getEndTime() {
  return endTime;
 }

 public void setEndTime(Timestamp endTime) {
  this.endTime = endTime;
 }

 public String getProjectDesc() {
  return projectDesc;
 }

 public void setProjectDesc(String projectDesc) {
  this.projectDesc = projectDesc;
 }

 public Integer getScanTotal() {
  return scanTotal;
 }

 public void setScanTotal(Integer scanTotal) {
  this.scanTotal = scanTotal;
 }

 public Integer getScanRemain() {
  return scanRemain;
 }

 public void setScanRemain(Integer scanRemain) {
  this.scanRemain = scanRemain;
 }
}
