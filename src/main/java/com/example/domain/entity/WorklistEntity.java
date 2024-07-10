package com.example.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WORKLIST
 */
@TableName(value = "`worklist`")
public class WorklistEntity {
   /**
    * id 
    */
   @JsonProperty("id")
   @TableId(value = "`id`", type = IdType.AUTO)
   private Long id;
   /**
    * projectName 
    */
   @JsonProperty("project_name")
   @TableField(value = "`project_name`")
   private String projectName;
   /**
    * taskType 
    */
   @JsonProperty("task_type")
   @TableField(value = "`task_type`")
   private String taskType;
   /**
    * intentionFeidi 
    */
   @JsonProperty("intention_feidi")
   @TableField(value = "`intention_feidi`")
   private String intentionFeidi;
   /**
    * taskState 
    */
   @JsonProperty("task_state")
   @TableField(value = "`task_state`")
   private String taskState;
   /**
    * manager 
    */
   @JsonProperty("manager")
   @TableField(value = "`manager`")
   private String manager;
   /**
    * remark 
    */
   @JsonProperty("remark")
   @TableField(value = "`remark`")
   private String remark;
   /**
    * createTime 
    */
   @JsonProperty("create_time")
   @TableField(value = "`create_time`")
   private java.time.LocalDateTime createTime;
   /**
    * updateTime 
    */
   @JsonProperty("update_time")
   @TableField(value = "`update_time`")
   private java.time.LocalDateTime updateTime;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   public String getProjectName() {
      return projectName;
   }

   public void setProjectName(String projectName) {
      this.projectName = projectName;
   }
   public String getTaskType() {
      return taskType;
   }

   public void setTaskType(String taskType) {
      this.taskType = taskType;
   }
   public String getIntentionFeidi() {
      return intentionFeidi;
   }

   public void setIntentionFeidi(String intentionFeidi) {
      this.intentionFeidi = intentionFeidi;
   }
   public String getTaskState() {
      return taskState;
   }

   public void setTaskState(String taskState) {
      this.taskState = taskState;
   }
   public String getManager() {
      return manager;
   }

   public void setManager(String manager) {
      this.manager = manager;
   }
   public String getRemark() {
      return remark;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }
   public java.time.LocalDateTime getCreateTime() {
      return createTime;
   }

   public void setCreateTime(java.time.LocalDateTime createTime) {
      this.createTime = createTime;
   }
   public java.time.LocalDateTime getUpdateTime() {
      return updateTime;
   }

   public void setUpdateTime(java.time.LocalDateTime updateTime) {
      this.updateTime = updateTime;
   }
}
