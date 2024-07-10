package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 项目模型
 */
public class ProjectModelPbqo {
   /**
    * projectName
    */
   @JsonProperty("projectName")
   private String projectName;
   
   /**
    * taskType
    */
   @JsonProperty("taskType")
   private String taskType;
   
   /**
    * intentionFeidi
    */
   @JsonProperty("intentionFeidi")
   private String intentionFeidi;
   
   /**
    * taskState
    */
   @JsonProperty("taskState")
   private String taskState;
   
   /**
    * manager
    */
   @JsonProperty("manager")
   private String manager;
   
   /**
    * remark
    */
   @JsonProperty("remark")
   private String remark;
   
   /**
    * createTime
    */
   @JsonProperty("createTime")
   private java.time.LocalDateTime createTime;
   
   /**
    * updateTime
    */
   @JsonProperty("updateTime")
   private java.time.LocalDateTime updateTime;
   
   /**
    * id
    */
   @JsonProperty("id")
   private Long id;
   
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
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
}
