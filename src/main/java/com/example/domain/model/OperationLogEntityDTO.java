package com.example.domain.model;

import java.util.*;

/**
 * 操作日志
 */
public class OperationLogEntityDTO {
   /**
    * 主键 主键
    */
   private Long id;
   /**
    * 用户ID 
    */
   private Long userId;
   /**
    * 用户名称 
    */
   private String userName;
   /**
    * 操作类型 
    */
   private String operationType;
   /**
    * IP地址 
    */
   private String ipAddress;
   /**
    * 操作描述 
    */
   private String operationDescription;
   /**
    * 创建时间 创建时间
    */
   private java.time.LocalDateTime createdTime;
   /**
    * 请求参数 
    */
   private String parameters;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   public Long getUserId() {
      return userId;
   }

   public void setUserId(Long userId) {
      this.userId = userId;
   }
   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }
   public String getOperationType() {
      return operationType;
   }

   public void setOperationType(String operationType) {
      this.operationType = operationType;
   }
   public String getIpAddress() {
      return ipAddress;
   }

   public void setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
   }
   public String getOperationDescription() {
      return operationDescription;
   }

   public void setOperationDescription(String operationDescription) {
      this.operationDescription = operationDescription;
   }
   public java.time.LocalDateTime getCreatedTime() {
      return createdTime;
   }

   public void setCreatedTime(java.time.LocalDateTime createdTime) {
      this.createdTime = createdTime;
   }
   public String getParameters() {
      return parameters;
   }

   public void setParameters(String parameters) {
      this.parameters = parameters;
   }
}
