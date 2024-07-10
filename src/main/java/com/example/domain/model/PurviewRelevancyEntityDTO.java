package com.example.domain.model;

import java.util.*;

/**
 * purviewRelevancy
 */
public class PurviewRelevancyEntityDTO {
   /**
    * id 
    */
   private Long id;
   /**
    * roleId 角色id
    */
   private Long roleId;
   /**
    * purviewId 权限id
    */
   private Long purviewId;
   /**
    * purviewCodeArr 权限组
    */
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
