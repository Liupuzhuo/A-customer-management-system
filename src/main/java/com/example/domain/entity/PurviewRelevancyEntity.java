package com.example.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * purviewRelevancy
 */
@TableName(value = "`purview_relevancy`")
public class PurviewRelevancyEntity {
   /**
    * id 
    */
   @JsonProperty("id")
   @TableId(value = "`id`", type = IdType.AUTO)
   private Long id;
   /**
    * roleId 角色id
    */
   @JsonProperty("role_id")
   @TableField(value = "`role_id`")
   private Long roleId;
   /**
    * purviewId 权限id
    */
   @JsonProperty("purview_id")
   @TableField(value = "`purview_id`")
   private Long purviewId;
   /**
    * purviewCodeArr 权限组
    */
   @JsonProperty("purview_code_arr")
   @TableField(value = "`purview_code_arr`")
   private String purviewCodeArr;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   public Long getRoleId() {
      return roleId;
   }

   public void setRoleId(Long roleId) {
      this.roleId = roleId;
   }
   public Long getPurviewId() {
      return purviewId;
   }

   public void setPurviewId(Long purviewId) {
      this.purviewId = purviewId;
   }
   public String getPurviewCodeArr() {
      return purviewCodeArr;
   }

   public void setPurviewCodeArr(String purviewCodeArr) {
      this.purviewCodeArr = purviewCodeArr;
   }
}
