package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 角色名称信息
 */
public class RoleNameInformationZbxo {
   /**
    * 角色名称
    */
   @JsonProperty("roleNameSitn")
   private String roleNameSitn;
   
   public String getRoleNameSitn() {
      return roleNameSitn;
   }

   public void setRoleNameSitn(String roleNameSitn) {
      this.roleNameSitn = roleNameSitn;
   }
}
