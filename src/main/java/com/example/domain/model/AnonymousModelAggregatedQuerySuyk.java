package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 角色权限查询
 */
public class AnonymousModelAggregatedQuerySuyk {
   /**
    * name
    */
   @JsonProperty("name")
   private String name;
   
   /**
    * code
    */
   @JsonProperty("code")
   private String code;
   
   /**
    * id
    */
   @JsonProperty("id")
   private Long id;
   
   /**
    * id
    */
   @JsonProperty("prid")
   private Long prid;
   
   /**
    * roleId
    */
   @JsonProperty("role_id")
   private Long roleId;
   
   /**
    * purviewId
    */
   @JsonProperty("purview_id")
   private Long purviewId;
   
   /**
    * purviewCodeArr
    */
   @JsonProperty("purview_code_arr")
   private String purviewCodeArr;
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   public Long getPrid() {
      return prid;
   }

   public void setPrid(Long prid) {
      this.prid = prid;
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
