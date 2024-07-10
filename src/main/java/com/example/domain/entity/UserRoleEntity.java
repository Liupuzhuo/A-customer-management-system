package com.example.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 角色实体
 */
@TableName(value = "`userRole`")
public class UserRoleEntity {
   /**
    * 主键 主键
    */
   @JsonProperty("id")
   @TableId(value = "`id`", type = IdType.AUTO)
   private Long id;
   /**
    * 角色名称 
    */
   @JsonProperty("roleName")
   @TableField(value = "`roleName`")
   private String roleName;
   /**
    * 权限字符 
    */
   @JsonProperty("permissionCharacters")
   @TableField(value = "`permissionCharacters`")
   private String permissionCharacters;
   /**
    * 状态 
    */
   @JsonProperty("rolestate")
   @TableField(value = "`rolestate`")
   private Integer rolestate;
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
