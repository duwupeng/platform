package com.beizhi.cloud.base.servicea.enums;
/**
*待评卷标志
**/
public enum TProductToMarkFlag{
   /**
   *不用评卷
   **/
   _UN_MARK_FLAG(0),

   /**
   *需要评卷
   **/
   _MARK_FLAG(1);
   private final int value;
   private TProductToMarkFlag(int value) {
     this.value = value;
   }
   public int getValue() {
      return value;
   }
}
