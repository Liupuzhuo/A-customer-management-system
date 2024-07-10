package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据查询模型5
 */
public class AnonymousModelDataQueryDtrr {
   /**
    * roleId
    */
   @JsonProperty("roleId")
   private Long roleId;
   
   public Long getRoleId() {
      return roleId;
   }

   public void setRoleId(Long roleId) {
      this.roleId = roleId;
   }
}
