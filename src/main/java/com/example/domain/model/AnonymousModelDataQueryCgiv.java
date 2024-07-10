package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据查询模型2
 */
public class AnonymousModelDataQueryCgiv {
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
    * type
    */
   @JsonProperty("type")
   private Integer type;
   
   /**
    * id
    */
   @JsonProperty("id")
   private Long id;
   
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
   public Integer getType() {
      return type;
   }

   public void setType(Integer type) {
      this.type = type;
   }
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
}
