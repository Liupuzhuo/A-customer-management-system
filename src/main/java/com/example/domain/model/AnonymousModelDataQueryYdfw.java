package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据查询模型3
 */
public class AnonymousModelDataQueryYdfw {
   /**
    * 用户昵称
    */
   @JsonProperty("nickname")
   private String nickname;
   
   /**
    * 主键
    */
   @JsonProperty("id")
   private Long id;
   
   /**
    * 用户名称
    */
   @JsonProperty("userName")
   private String userName;
   
   /**
    * purviewCodeArr
    */
   @JsonProperty("purviewCodeArr")
   private String purviewCodeArr;
   
   public String getNickname() {
      return nickname;
   }

   public void setNickname(String nickname) {
      this.nickname = nickname;
   }
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
   public String getPurviewCodeArr() {
      return purviewCodeArr;
   }

   public void setPurviewCodeArr(String purviewCodeArr) {
      this.purviewCodeArr = purviewCodeArr;
   }
}
