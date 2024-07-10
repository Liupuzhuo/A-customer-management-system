package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据查询模型6
 */
public class AnonymousModelDataQueryWktb {
   /**
    * 角色名称
    */
   @JsonProperty("roleName")
   private String roleName;
   
   /**
    * 主键
    */
   @JsonProperty("id")
   private Long id;
   
   public String getRoleName() {
      return roleName;
   }

   public void setRoleName(String roleName) {
      this.roleName = roleName;
   }
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
}
