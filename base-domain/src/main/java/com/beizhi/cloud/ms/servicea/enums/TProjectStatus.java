package com.beizhi.cloud.ms.servicea.enums;
/**
*项目状态
**/
public enum TProjectStatus{
   /**
   *启用中
   **/
   _ON_USING(1),

   /**
   *已停用
   **/
   _STOP(2),

   /**
   *已删除
   **/
   _CANCEL(3);
   private final int value;
   private TProjectStatus(int value) {
     this.value = value;
   }
   public int getValue() {
      return value;
   }
}
