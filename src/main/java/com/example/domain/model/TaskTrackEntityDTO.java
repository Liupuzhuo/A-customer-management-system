package com.example.domain.model;

import java.util.*;

/**
 * taskTrack
 */
public class TaskTrackEntityDTO {
   /**
    * id 
    */
   private Long id;
   /**
    * director 负责人
    */
   private String director;
   /**
    * taskStatus 任务状态
    */
   private String taskStatus;
   /**
    * progress 对接进展
    */
   private String progress;
   /**
    * createTime 创建时间
    */
   private java.time.LocalDateTime createTime;
   /**
    * trackingTime 跟踪时间
    */
   private java.time.LocalDate trackingTime;
   /**
    * workListId 外键
    */
   private Long workListId;
   /**
    * updateTime 更新时间
    */
   private java.time.LocalDateTime updateTime;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   public String getDirector() {
      return director;
   }

   public void setDirector(String director) {
      this.director = director;
   }
   public String getTaskStatus() {
      return taskStatus;
   }

   public void setTaskStatus(String taskStatus) {
      this.taskStatus = taskStatus;
   }
   public String getProgress() {
      return progress;
   }

   public void setProgress(String progress) {
      this.progress = progress;
   }
   public java.time.LocalDateTime getCreateTime() {
      return createTime;
   }

   public void setCreateTime(java.time.LocalDateTime createTime) {
      this.createTime = createTime;
   }
   public java.time.LocalDate getTrackingTime() {
      return trackingTime;
   }

   public void setTrackingTime(java.time.LocalDate trackingTime) {
      this.trackingTime = trackingTime;
   }
   public Long getWorkListId() {
      return workListId;
   }

   public void setWorkListId(Long workListId) {
      this.workListId = workListId;
   }
   public java.time.LocalDateTime getUpdateTime() {
      return updateTime;
   }

   public void setUpdateTime(java.time.LocalDateTime updateTime) {
      this.updateTime = updateTime;
   }
}
