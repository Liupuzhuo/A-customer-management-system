package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 用户角色信息
 */
public class UserRoleInformationJoez {
   /**
    * id
    */
   @JsonProperty("id")
   private Long id;
   
   /**
    * roleName
    */
   @JsonProperty("roleName")
   private String roleName;
   
   /**
    * userId
    */
   @JsonProperty("userId")
   private String userId;
   
   /**
    * state
    */
   @JsonProperty("state")
   private Boolean state;
   
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   public String getRoleName() {
      return roleName;
   }

   public void setRoleName(String roleName) {
      this.roleName = roleName;
   }
   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }
   public Boolean getState() {
      return state;
   }

   public void setState(Boolean state) {
      this.state = state;
   }
}
