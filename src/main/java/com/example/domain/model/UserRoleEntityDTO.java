package com.example.domain.model;

import java.util.*;

/**
 * 角色实体
 */
public class UserRoleEntityDTO {
   /**
    * 主键 主键
    */
   private Long id;
   /**
    * 角色名称 
    */
   private String roleName;
   /**
    * 权限字符 
    */
   private String permissionCharacters;
   /**
    * 状态 
    */
   private Integer rolestate;
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
   public String getRoleName() {
      return roleName;
   }

   public void setRoleName(String roleName) {
      this.roleName = roleName;
   }
   public String getPermissionCharacters() {
      return permissionCharacters;
   }

   public void setPermissionCharacters(String permissionCharacters) {
      this.permissionCharacters = permissionCharacters;
   }
   public Integer getRolestate() {
      return rolestate;
   }

   public void setRolestate(Integer rolestate) {
      this.rolestate = rolestate;
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
