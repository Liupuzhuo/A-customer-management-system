package com.example.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 用户实体
 */
@TableName(value = "`userinfo`")
public class UserinfoEntity {
   /**
    * 主键 主键
    */
   @JsonProperty("id")
   @TableId(value = "`id`", type = IdType.AUTO)
   private Long id;
   /**
    * 用户名称 
    */
   @JsonProperty("userName")
   @TableField(value = "`userName`")
   private String userName;
   /**
    * 用户昵称 
    */
   @JsonProperty("nickname")
   @TableField(value = "`nickname`")
   private String nickname;
   /**
    * 归属部门 
    */
   @JsonProperty("belongingDepartment")
   @TableField(value = "`belongingDepartment`")
   private String belongingDepartment;
   /**
    * 联系电话 
    */
   @JsonProperty("phoneNumber")
   @TableField(value = "`phoneNumber`")
   private String phoneNumber;
   /**
    * 状态 
    */
   @JsonProperty("stateBfuw")
   @TableField(value = "`stateBfuw`")
   private String stateBfuw;
   /**
    * 密码 
    */
   @JsonProperty("password")
   @TableField(value = "`password`")
   private String password;
   /**
    * 备注 
    */
   @JsonProperty("remarksDqdd")
   @TableField(value = "`remarksDqdd`")
   private String remarksDqdd;
   /**
    * 创建时间 创建时间
    */
   @JsonProperty("createdTime")
   @TableField(value = "`createdTime`", fill = FieldFill.INSERT)
   private java.time.LocalDateTime createdTime;
   /**
    * 更新时间 更新时间
    */
   @JsonProperty("updatedTime")
   @TableField(value = "`updatedTime`", fill = FieldFill.INSERT_UPDATE)
   private java.time.LocalDateTime updatedTime;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }
   public String getNickname() {
      return nickname;
   }

   public void setNickname(String nickname) {
      this.nickname = nickname;
   }
   public String getBelongingDepartment() {
      return belongingDepartment;
   }

   public void setBelongingDepartment(String belongingDepartment) {
      this.belongingDepartment = belongingDepartment;
   }
   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }
   public String getStateBfuw() {
      return stateBfuw;
   }

   public void setStateBfuw(String stateBfuw) {
      this.stateBfuw = stateBfuw;
   }
   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }
   public String getRemarksDqdd() {
      return remarksDqdd;
   }

   public void setRemarksDqdd(String remarksDqdd) {
      this.remarksDqdd = remarksDqdd;
   }
   public java.time.LocalDateTime getCreatedTime() {
      return createdTime;
   }

   public void setCreatedTime(java.time.LocalDateTime createdTime) {
      this.createdTime = createdTime;
   }
   public java.time.LocalDateTime getUpdatedTime() {
      return updatedTime;
   }

   public void setUpdatedTime(java.time.LocalDateTime updatedTime) {
      this.updatedTime = updatedTime;
   }
}
