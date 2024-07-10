package com.example.domain.model;

import java.util.*;

/**
 * 用户实体
 */
public class UserinfoEntityDTO {
   /**
    * 主键 主键
    */
   private Long id;
   /**
    * 用户名称 
    */
   private String userName;
   /**
    * 用户昵称 
    */
   private String nickname;
   /**
    * 归属部门 
    */
   private String belongingDepartment;
   /**
    * 联系电话 
    */
   private String phoneNumber;
   /**
    * 状态 
    */
   private String stateBfuw;
   /**
    * 密码 
    */
   private String password;
   /**
    * 备注 
    */
   private String remarksDqdd;
   /**
    * 创建时间 创建时间
    */
   private java.time.LocalDateTime createdTime;
   /**
    * 更新时间 更新时间
    */
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
