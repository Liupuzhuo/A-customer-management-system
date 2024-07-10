package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据查询
 */
public class AnonymousModelDataQueryKblp {
   /**
    * id
    */
   @JsonProperty("id")
   private Long id;
   
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
    * name
    */
   @JsonProperty("name")
   private String name;
   
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
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
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
