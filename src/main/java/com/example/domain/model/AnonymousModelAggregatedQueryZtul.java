package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 用户条件查询
 */
public class AnonymousModelAggregatedQueryZtul {
   /**
    * 用户名称
    */
   @JsonProperty("userName")
   private String userName;
   
   /**
    * 主键
    */
   @JsonProperty("id")
   private Long id;
   
   /**
    * 状态
    */
   @JsonProperty("stateBfuw")
   private String stateBfuw;
   
   /**
    * 备注
    */
   @JsonProperty("remarksDqdd")
   private String remarksDqdd;
   
   /**
    * 创建时间
    */
   @JsonProperty("createdTime")
   private java.time.LocalDateTime createdTime;
   
   /**
    * 密码
    */
   @JsonProperty("password")
   private String password;
   
   /**
    * 更新时间
    */
   @JsonProperty("updatedTime")
   private java.time.LocalDateTime updatedTime;
   
   /**
    * 归属部门
    */
   @JsonProperty("belongingDepartment")
   private String belongingDepartment;
   
   /**
    * 联系电话
    */
   @JsonProperty("phoneNumber")
   private String phoneNumber;
   
   /**
    * 用户昵称
    */
   @JsonProperty("nickname")
   private String nickname;
   
   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   public String getStateBfuw() {
      return stateBfuw;
   }

   public void setStateBfuw(String stateBfuw) {
      this.stateBfuw = stateBfuw;
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
   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }
   public java.time.LocalDateTime getUpdatedTime() {
      return updatedTime;
   }

   public void setUpdatedTime(java.time.LocalDateTime updatedTime) {
      this.updatedTime = updatedTime;
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
   public String getNickname() {
      return nickname;
   }

   public void setNickname(String nickname) {
      this.nickname = nickname;
   }
}
