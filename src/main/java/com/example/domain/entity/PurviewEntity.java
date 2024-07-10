package com.example.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * purview
 */
@TableName(value = "`purview`")
public class PurviewEntity {
   /**
    * id 
    */
   @JsonProperty("id")
   @TableId(value = "`id`", type = IdType.AUTO)
   private Long id;
   /**
    * code 权限编码
    */
   @JsonProperty("code")
   @TableField(value = "`code`")
   private String code;
   /**
    * name 权限名称
    */
   @JsonProperty("name")
   @TableField(value = "`name`")
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
