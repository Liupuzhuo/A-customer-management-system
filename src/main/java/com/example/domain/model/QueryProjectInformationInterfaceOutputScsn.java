package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 查询项目信息接口输出
 */
public class QueryProjectInformationInterfaceOutputScsn {
   /**
    * idid
    */
   @JsonProperty("id")
   private Integer id;
   
   /**
    * technologyName项目名称
    */
   @JsonProperty("technologyName")
   private String technologyName;
   
   /**
    * intentionCity意向飞地/意向盟市
    */
   @JsonProperty("intentionCity")
   private String intentionCity;
   
   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }
   public String getTechnologyName() {
      return technologyName;
   }

   public void setTechnologyName(String technologyName) {
      this.technologyName = technologyName;
   }
   public String getIntentionCity() {
      return intentionCity;
   }

   public void setIntentionCity(String intentionCity) {
      this.intentionCity = intentionCity;
   }
}
