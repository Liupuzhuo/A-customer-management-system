package com.example.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 操作日志
 */
@TableName(value = "`operation_log`")
public class OperationLogEntity {
   /**
    * 主键 主键
    */
   @JsonProperty("id")
   @TableId(value = "`id`", type = IdType.AUTO)
   private Long id;
   /**
    * 用户ID 
    */
   @JsonProperty("userId")
   @TableField(value = "`userId`")
   private Long userId;
   /**
    * 用户名称 
    */
   @JsonProperty("userName")
   @TableField(value = "`userName`")
   private String userName;
   /**
    * 操作类型 
    */
   @JsonProperty("operationType")
   @TableField(value = "`operationType`")
   private String operationType;
   /**
    * IP地址 
    */
   @JsonProperty("ipAddress")
   @TableField(value = "`ipAddress`")
   private String ipAddress;
   /**
    * 操作描述 
    */
   @JsonProperty("operationDescription")
   @TableField(value = "`operationDescription`")
   private String operationDescription;
   /**
    * 创建时间 创建时间
    */
   @JsonProperty("createdTime")
   @TableField(value = "`createdTime`", fill = FieldFill.INSERT)
   private java.time.LocalDateTime createdTime;
   /**
    * 请求参数 
    */
   @JsonProperty("parameters")
   @TableField(value = "`parameters`")
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
