package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;


/**
 * excel表数据
 */
public class AnonymousModelDataQueryKbapExportExcel {
   /**
    * projectName
    */
   @JsonProperty("project_name")
   @ExcelProperty(value="projectName")
   private String projectName;
   
   /**
    * taskType
    */
   @JsonProperty("task_type")
   @ExcelProperty(value="taskType")
   private String taskType;
   
   /**
    * intentionFeidi
    */
   @JsonProperty("intention_feidi")
   @ExcelProperty(value="intentionFeidi")
   private String intentionFeidi;
   
   /**
    * taskState
    */
   @JsonProperty("task_state")
   @ExcelProperty(value="taskState")
   private String taskState;
   
   /**
    * manager
    */
   @JsonProperty("manager")
   @ExcelProperty(value="manager")
   private String manager;
   
   /**
    * director
    */
   @JsonProperty("director")
   @ExcelProperty(value="director")
   private String director;
   
   /**
    * progress
    */
   @JsonProperty("progress")
   @ExcelProperty(value="progress")
   private String progress;
   
   /**
    * trackingTime
    */
   @JsonProperty("tracking_time")
   @ExcelProperty(value="trackingTime")
   private java.time.LocalDate trackingTime;
   
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
   public String getDirector() {
      return director;
   }

   public void setDirector(String director) {
      this.director = director;
   }
   public String getProgress() {
      return progress;
   }

   public void setProgress(String progress) {
      this.progress = progress;
   }
   public java.time.LocalDate getTrackingTime() {
      return trackingTime;
   }

   public void setTrackingTime(java.time.LocalDate trackingTime) {
      this.trackingTime = trackingTime;
   }
}
