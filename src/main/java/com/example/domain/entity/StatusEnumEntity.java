package com.example.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * statusEnum
 */
@TableName(value = "`status_enum`")
public class StatusEnumEntity {
   /**
    * id 
    */
   @JsonProperty("id")
   @TableId(value = "`id`", type = IdType.AUTO)
   private Long id;
   /**
    * code 
    */
   @JsonProperty("code")
   @TableField(value = "`code`")
   private String code;
   /**
    * name 
    */
   @JsonProperty("name")
   @TableField(value = "`name`")
   private String name;
   /**
    * type 1:任务单类型；2：任务状态；3：意向落地盟市
    */
   @JsonProperty("type")
   @TableField(value = "`type`")
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
