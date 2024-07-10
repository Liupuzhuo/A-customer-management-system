package com.example.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * roleRelevance
 */
@TableName(value = "`role_relevance`")
public class RoleRelevanceEntity {
   /**
    * id 
    */
   @JsonProperty("id")
   @TableId(value = "`id`", type = IdType.AUTO)
   private Long id;
   /**
    * userId 用户id
    */
   @JsonProperty("user_id")
   @TableField(value = "`user_id`")
   private Long userId;
   /**
    * roleId 角色id
    */
   @JsonProperty("role_id")
   @TableField(value = "`role_id`")
   private Long roleId;

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
   public Long getRoleId() {
      return roleId;
   }

   public void setRoleId(Long roleId) {
      this.roleId = roleId;
   }
}
