package com.example.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * taskTrack
 */
@TableName(value = "`task_track`")
public class TaskTrackEntity {
   /**
    * id 
    */
   @JsonProperty("id")
   @TableId(value = "`id`", type = IdType.AUTO)
   private Long id;
   /**
    * director 负责人
    */
   @JsonProperty("director")
   @TableField(value = "`director`")
   private String director;
   /**
    * taskStatus 任务状态
    */
   @JsonProperty("task_status")
   @TableField(value = "`task_status`")
   private String taskStatus;
   /**
    * progress 对接进展
    */
   @JsonProperty("progress")
   @TableField(value = "`progress`")
   private String progress;
   /**
    * createTime 创建时间
    */
   @JsonProperty("create_time")
   @TableField(value = "`create_time`")
   private java.time.LocalDateTime createTime;
   /**
    * trackingTime 跟踪时间
    */
   @JsonProperty("tracking_time")
   @TableField(value = "`tracking_time`")
   private java.time.LocalDate trackingTime;
   /**
    * workListId 外键
    */
   @JsonProperty("work_list_id")
   @TableField(value = "`work_list_id`")
   private Long workListId;
   /**
    * updateTime 更新时间
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
