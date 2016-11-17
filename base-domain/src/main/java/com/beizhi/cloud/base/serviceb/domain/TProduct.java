package com.beizhi.cloud.base.serviceb.domain;

import java.sql.Timestamp;

/**
  * @author auto-tool
  */public class TProduct {
   /**
   * 产品id
   */
   Integer productId;

   /**
   * 
   */
   Integer projectId;

   /**
   * 产品名称(默认从选定的试卷拷贝)
   */
   String productPageName;

   /**
   * 引用试卷id
   */
   Integer productPageId;

   /**
   * 待评卷标志,0:不用评卷(UnMarkFlag);1:需要评卷(MarkFlag)
   */
   Integer toMarkFlag;

   /**
   * 考试开始时间
   */
   Timestamp startTime;

   /**
   * 考试结束时间
   */
   Timestamp endTime;

   /**
   * 产品状态,1:未开始(ToStart);2:进行中(OnGoing);3:已结束(End);4:已停用(Stop);5:已删除(Cancel)
   */
   Integer status;

   /**
   * 最迟参与考试时间;为空表示无限制
   */
   Timestamp joinTimeLimit;

   /**
   * 参考人次
   */
   Integer joinNum;

   /**
   * 已考完人数
   */
   Integer finishNum;

   /**
   * 待评卷人数
   */
   Integer toMarkNum;

   /**
   * 已评卷人数
   */
   Integer markedNum;

 public Integer getProductId() {
  return productId;
 }

 public void setProductId(Integer productId) {
  this.productId = productId;
 }

 public Integer getProjectId() {
  return projectId;
 }

 public void setProjectId(Integer projectId) {
  this.projectId = projectId;
 }

 public String getProductPageName() {
  return productPageName;
 }

 public void setProductPageName(String productPageName) {
  this.productPageName = productPageName;
 }

 public Integer getProductPageId() {
  return productPageId;
 }

 public void setProductPageId(Integer productPageId) {
  this.productPageId = productPageId;
 }

 public Integer getToMarkFlag() {
  return toMarkFlag;
 }

 public void setToMarkFlag(Integer toMarkFlag) {
  this.toMarkFlag = toMarkFlag;
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

 public Integer getStatus() {
  return status;
 }

 public void setStatus(Integer status) {
  this.status = status;
 }

 public Timestamp getJoinTimeLimit() {
  return joinTimeLimit;
 }

 public void setJoinTimeLimit(Timestamp joinTimeLimit) {
  this.joinTimeLimit = joinTimeLimit;
 }

 public Integer getJoinNum() {
  return joinNum;
 }

 public void setJoinNum(Integer joinNum) {
  this.joinNum = joinNum;
 }

 public Integer getFinishNum() {
  return finishNum;
 }

 public void setFinishNum(Integer finishNum) {
  this.finishNum = finishNum;
 }

 public Integer getToMarkNum() {
  return toMarkNum;
 }

 public void setToMarkNum(Integer toMarkNum) {
  this.toMarkNum = toMarkNum;
 }

 public Integer getMarkedNum() {
  return markedNum;
 }

 public void setMarkedNum(Integer markedNum) {
  this.markedNum = markedNum;
 }
}
