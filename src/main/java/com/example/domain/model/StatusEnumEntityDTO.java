package com.example.domain.model;

import java.util.*;

/**
 * statusEnum
 */
public class StatusEnumEntityDTO {
   /**
    * id 
    */
   private Long id;
   /**
    * code 
    */
   private String code;
   /**
    * name 
    */
   private String name;
   /**
    * type 1:任务单类型；2：任务状态；3：意向落地盟市
    */
   private Integer type;

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
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   public Integer getType() {
      return type;
   }

   public void setType(Integer type) {
      this.type = type;
   }
}
