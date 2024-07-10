package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 角色权限信息模型
 */
public class RolePermissionInformationModelElho {
   /**
    * 权限ID
    */
   @JsonProperty("permissionIdHkdg")
   private Long permissionIdHkdg;
   
   /**
    * 权限code
    */
   @JsonProperty("permissionCodeSwzg")
   private String permissionCodeSwzg;
   
   /**
    * 权限name
    */
   @JsonProperty("permissionNameRcbv")
   private String permissionNameRcbv;
   
   /**
    * 角色ID
    */
   @JsonProperty("roleIdCmom")
   private Long roleIdCmom;
   
   /**
    * 角色权限表ID
    */
   @JsonProperty("rolePermissionTableIdMkah")
   private Long rolePermissionTableIdMkah;
   
   /**
    * 权限字符
    */
   @JsonProperty("permissionCharactersXlec")
   private String permissionCharactersXlec;
   
   public Long getPermissionIdHkdg() {
      return permissionIdHkdg;
   }

   public void setPermissionIdHkdg(Long permissionIdHkdg) {
      this.permissionIdHkdg = permissionIdHkdg;
   }
   public String getPermissionCodeSwzg() {
      return permissionCodeSwzg;
   }

   public void setPermissionCodeSwzg(String permissionCodeSwzg) {
      this.permissionCodeSwzg = permissionCodeSwzg;
   }
   public String getPermissionNameRcbv() {
      return permissionNameRcbv;
   }

   public void setPermissionNameRcbv(String permissionNameRcbv) {
      this.permissionNameRcbv = permissionNameRcbv;
   }
   public Long getRoleIdCmom() {
      return roleIdCmom;
   }

   public void setRoleIdCmom(Long roleIdCmom) {
      this.roleIdCmom = roleIdCmom;
   }
   public Long getRolePermissionTableIdMkah() {
      return rolePermissionTableIdMkah;
   }

   public void setRolePermissionTableIdMkah(Long rolePermissionTableIdMkah) {
      this.rolePermissionTableIdMkah = rolePermissionTableIdMkah;
   }
   public String getPermissionCharactersXlec() {
      return permissionCharactersXlec;
   }

   public void setPermissionCharactersXlec(String permissionCharactersXlec) {
      this.permissionCharactersXlec = permissionCharactersXlec;
   }
}
