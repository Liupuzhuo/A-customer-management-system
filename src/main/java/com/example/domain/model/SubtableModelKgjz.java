package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 子表模型
 */
public class SubtableModelKgjz {
   /**
    * director
    */
   @JsonProperty("director")
   private String director;
   
   /**
    * taskStatus
    */
   @JsonProperty("taskStatus")
   private String taskStatus;
   
   /**
    * progress
    */
   @JsonProperty("progress")
   private String progress;
   
   /**
    * createTime
    */
   @JsonProperty("createTime")
   private java.time.LocalDateTime createTime;
   
   /**
    * trackingTime
    */
   @JsonProperty("trackingTime")
   private java.time.LocalDate trackingTime;
   
   /**
    * workListId
    */
   @JsonProperty("workListId")
   private Long workListId;
   
   /**
    * id
    */
   @JsonProperty("id")
   private Long id;
   
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
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
}
