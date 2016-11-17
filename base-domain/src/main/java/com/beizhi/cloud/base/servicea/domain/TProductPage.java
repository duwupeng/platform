package com.beizhi.cloud.base.servicea.domain;
  /**
  * @author auto-tool
  */public class TProductPage {
   /**
   * 引用试卷id
   */
   Integer productPageId;

   /**
   * 引用试卷名称
   */
   String productPageName;

   /**
   * 试卷hash值
   */
   String hash;

   /**
   * 原试卷id
   */
   Integer oriPageId;

   public Integer getProductPageId() {
    return productPageId;
   }

   public void setProductPageId(Integer productPageId) {
    this.productPageId = productPageId;
   }

   public String getProductPageName() {
    return productPageName;
   }

   public void setProductPageName(String productPageName) {
    this.productPageName = productPageName;
   }

   public String getHash() {
    return hash;
   }

   public void setHash(String hash) {
    this.hash = hash;
   }

   public Integer getOriPageId() {
    return oriPageId;
   }

   public void setOriPageId(Integer oriPageId) {
    this.oriPageId = oriPageId;
   }
  }
