package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 项目信息
 */
public class ProjectInformationOlkt {
   /**
    * 项目名称
    */
   @JsonProperty("entryNameVxwl")
   private String entryNameVxwl;
   
   /**
    * 任务类型
    */
   @JsonProperty("taskTypeSehy")
   private String taskTypeSehy;
   
   /**
    * 任务状态
    */
   @JsonProperty("taskStatusUbjn")
   private String taskStatusUbjn;
   
   /**
    * 意向飞地
    */
   @JsonProperty("intendedEnclaveWmwt")
   private String intendedEnclaveWmwt;
   
   /**
    * 项目经理
    */
   @JsonProperty("projectManagerZoza")
   private String projectManagerZoza;
   
   /**
    * 备注
    */
   @JsonProperty("remarksWyyb")
   private String remarksWyyb;
   
   /**
    * 项目id
    */
   @JsonProperty("projectIdFylv")
   private Long projectIdFylv;
   
   public String getEntryNameVxwl() {
      return entryNameVxwl;
   }

   public void setEntryNameVxwl(String entryNameVxwl) {
      this.entryNameVxwl = entryNameVxwl;
   }
   public String getTaskTypeSehy() {
      return taskTypeSehy;
   }

   public void setTaskTypeSehy(String taskTypeSehy) {
      this.taskTypeSehy = taskTypeSehy;
   }
   public String getTaskStatusUbjn() {
      return taskStatusUbjn;
   }

   public void setTaskStatusUbjn(String taskStatusUbjn) {
      this.taskStatusUbjn = taskStatusUbjn;
   }
   public String getIntendedEnclaveWmwt() {
      return intendedEnclaveWmwt;
   }

   public void setIntendedEnclaveWmwt(String intendedEnclaveWmwt) {
      this.intendedEnclaveWmwt = intendedEnclaveWmwt;
   }
   public String getProjectManagerZoza() {
      return projectManagerZoza;
   }

   public void setProjectManagerZoza(String projectManagerZoza) {
      this.projectManagerZoza = projectManagerZoza;
   }
   public String getRemarksWyyb() {
      return remarksWyyb;
   }

   public void setRemarksWyyb(String remarksWyyb) {
      this.remarksWyyb = remarksWyyb;
   }
   public Long getProjectIdFylv() {
      return projectIdFylv;
   }

   public void setProjectIdFylv(Long projectIdFylv) {
      this.projectIdFylv = projectIdFylv;
   }
}
