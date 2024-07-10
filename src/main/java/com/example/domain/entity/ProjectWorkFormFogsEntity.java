package com.example.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 项目工作表单
 */
@TableName(value = "`worklist`")
public class ProjectWorkFormFogsEntity {
   /**
    * id 
    */
   @JsonProperty("id")
   @TableId("`id`")
   private Integer id;
   /**
    * 项目名称 
    */
   @JsonProperty("项目名称")
   @TableField(value = "`项目名称`")
   private String 项目名称;
   /**
    * 任务类型 
    */
   @JsonProperty("任务类型")
   @TableField(value = "`任务类型`")
   private String 任务类型;
   /**
    * 意向飞地 
    */
   @JsonProperty("意向飞地")
   @TableField(value = "`意向飞地`")
   private String 意向飞地;
   /**
    * 任务状态 
    */
   @JsonProperty("任务状态")
   @TableField(value = "`任务状态`")
   private String 任务状态;
   /**
    * 项目经理 
    */
   @JsonProperty("项目经理")
   @TableField(value = "`项目经理`")
   private String 项目经理;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }
   public String get项目名称() {
      return 项目名称;
   }

   public void set项目名称(String 项目名称) {
      this.项目名称 = 项目名称;
   }
   public String get任务类型() {
      return 任务类型;
   }

   public void set任务类型(String 任务类型) {
      this.任务类型 = 任务类型;
   }
   public String get意向飞地() {
      return 意向飞地;
   }

   public void set意向飞地(String 意向飞地) {
      this.意向飞地 = 意向飞地;
   }
   public String get任务状态() {
      return 任务状态;
   }

   public void set任务状态(String 任务状态) {
      this.任务状态 = 任务状态;
   }
   public String get项目经理() {
      return 项目经理;
   }

   public void set项目经理(String 项目经理) {
      this.项目经理 = 项目经理;
   }
}
