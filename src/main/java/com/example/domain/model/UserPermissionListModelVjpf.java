package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 用户权限列表模型
 */
public class UserPermissionListModelVjpf {
   /**
    * id
    */
   @JsonProperty("id")
   private Long id;
   
   /**
    * userName
    */
   @JsonProperty("userName")
   private String userName;
   
   /**
    * nickname
    */
   @JsonProperty("nickname")
   private String nickname;
   
   /**
    * code
    */
   @JsonProperty("code")
   private String code;
   
   /**
    * name
    */
   @JsonProperty("name")
   private String name;
   
   /**
    * roleName
    */
   @JsonProperty("roleName")
   private String roleName;
   
   /**
    * purviewRoleArr
    */
   @JsonProperty("purviewCodeArr")
   private String purviewCodeArr;
   
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }
   public String getNickname() {
      return nickname;
   }

   public void setNickname(String nickname) {
      this.nickname = nickname;
   }
   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   public String getRoleName() {
      return roleName;
   }

   public void setRoleName(String roleName) {
      this.roleName = roleName;
   }
   public String getPurviewCodeArr() {
      return purviewCodeArr;
   }

   public void setPurviewCodeArr(String purviewCodeArr) {
      this.purviewCodeArr = purviewCodeArr;
   }
}
