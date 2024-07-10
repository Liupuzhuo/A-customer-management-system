package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据查询模型
 */
public class AnonymousModelDataQueryUuvb {
   /**
    * director
    */
   @JsonProperty("director")
   private String director;
   
   /**
    * id
    */
   @JsonProperty("id")
   private Long id;
   
   /**
    * progress
    */
   @JsonProperty("progress")
   private String progress;
   
   /**
    * workListId
    */
   @JsonProperty("work_list_id")
   private Long workListId;
   
   /**
    * trackingTime
    */
   @JsonProperty("tracking_time")
   private java.time.LocalDateTime trackingTime;
   
   /**
    * createTime
    */
   @JsonProperty("create_time")
   private java.time.LocalDateTime createTime;
   
   /**
    * taskStatus
    */
   @JsonProperty("task_status")
   private String taskStatus;
   
   /**
    * 任务状态名称
    */
   @JsonProperty("taskStatusNameJtmn")
   private String taskStatusNameJtmn;
   
   public String getDirector() {
      return director;
   }

   public void setDirector(String director) {
      this.director = director;
   }
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
   public String getProgress() {
      return progress;
   }

   public void setProgress(String progress) {
      this.progress = progress;
   }
   public Long getWorkListId() {
      return workListId;
   }

   public void setWorkListId(Long workListId) {
      this.workListId = workListId;
   }
   public java.time.LocalDateTime getTrackingTime() {
      return trackingTime;
   }

   public void setTrackingTime(java.time.LocalDateTime trackingTime) {
      this.trackingTime = trackingTime;
   }
   public java.time.LocalDateTime getCreateTime() {
      return createTime;
   }

   public void setCreateTime(java.time.LocalDateTime createTime) {
      this.createTime = createTime;
   }
   public String getTaskStatus() {
      return taskStatus;
   }

   public void setTaskStatus(String taskStatus) {
      this.taskStatus = taskStatus;
   }
   public String getTaskStatusNameJtmn() {
      return taskStatusNameJtmn;
   }

   public void setTaskStatusNameJtmn(String taskStatusNameJtmn) {
      this.taskStatusNameJtmn = taskStatusNameJtmn;
   }
}
