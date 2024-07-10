package com.example.domain.model;

import java.util.*;

/**
 * WORKLIST
 */
public class WorklistEntityDTO {
   /**
    * id 
    */
   private Long id;
   /**
    * projectName 
    */
   private String projectName;
   /**
    * taskType 
    */
   private String taskType;
   /**
    * intentionFeidi 
    */
   private String intentionFeidi;
   /**
    * taskState 
    */
   private String taskState;
   /**
    * manager 
    */
   private String manager;
   /**
    * remark 
    */
   private String remark;
   /**
    * createTime 
    */
   private java.time.LocalDateTime createTime;
   /**
    * updateTime 
    */
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
