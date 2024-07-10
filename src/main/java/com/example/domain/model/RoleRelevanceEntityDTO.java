package com.example.domain.model;

import java.util.*;

/**
 * roleRelevance
 */
public class RoleRelevanceEntityDTO {
   /**
    * id 
    */
   private Long id;
   /**
    * userId 用户id
    */
   private Long userId;
   /**
    * roleId 角色id
    */
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
