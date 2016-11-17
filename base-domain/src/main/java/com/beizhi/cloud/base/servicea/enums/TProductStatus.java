package com.beizhi.cloud.base.servicea.enums;
/**
*产品状态
**/
public enum TProductStatus{
   /**
   *未开始
   **/
   _TO_START(1),

   /**
   *进行中
   **/
   _ON_GOING(2),

   /**
   *已结束
   **/
   _END(3),

   /**
   *已停用
   **/
   _STOP(4),

   /**
   *已删除
   **/
   _CANCEL(5);
   private final int value;
   private TProductStatus(int value) {
     this.value = value;
   }
   public int getValue() {
      return value;
   }
}
