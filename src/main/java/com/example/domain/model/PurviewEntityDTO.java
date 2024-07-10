package com.example.domain.model;

import java.util.*;

/**
 * purview
 */
public class PurviewEntityDTO {
   /**
    * id 
    */
   private Long id;
   /**
    * code 权限编码
    */
   private String code;
   /**
    * name 权限名称
    */
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
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
