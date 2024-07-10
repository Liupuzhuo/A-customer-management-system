package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * excel数据模型_v1
 */
public class ExcelDataModelV1Spro {
   /**
    * 项目名称
    */
   @JsonProperty("entryNameYcnh")
   private String entryNameYcnh;
   
   /**
    * 任务类型
    */
   @JsonProperty("taskTypePxsp")
   private String taskTypePxsp;
   
   /**
    * 任务状态
    */
   @JsonProperty("taskStatusJwsj")
   private String taskStatusJwsj;
   
   /**
    * 意向飞地
    */
   @JsonProperty("intendedEnclaveGhkx")
   private String intendedEnclaveGhkx;
   
   /**
    * 项目经理
    */
   @JsonProperty("projectManagerUacx")
   private String projectManagerUacx;
   
   /**
    * 负责人
    */
   @JsonProperty("responsiblePersonPxrv")
   private String responsiblePersonPxrv;
   
   /**
    * 对接进展
    */
   @JsonProperty("dockingProgressEfrx")
   private String dockingProgressEfrx;
   
   /**
    * 追踪时间
    */
   @JsonProperty("trackingTimeXfex")
   private java.time.LocalDate trackingTimeXfex;
   
   public String getEntryNameYcnh() {
      return entryNameYcnh;
   }

   public void setEntryNameYcnh(String entryNameYcnh) {
      this.entryNameYcnh = entryNameYcnh;
   }
   public String getTaskTypePxsp() {
      return taskTypePxsp;
   }

   public void setTaskTypePxsp(String taskTypePxsp) {
      this.taskTypePxsp = taskTypePxsp;
   }
   public String getTaskStatusJwsj() {
      return taskStatusJwsj;
   }

   public void setTaskStatusJwsj(String taskStatusJwsj) {
      this.taskStatusJwsj = taskStatusJwsj;
   }
   public String getIntendedEnclaveGhkx() {
      return intendedEnclaveGhkx;
   }

   public void setIntendedEnclaveGhkx(String intendedEnclaveGhkx) {
      this.intendedEnclaveGhkx = intendedEnclaveGhkx;
   }
   public String getProjectManagerUacx() {
      return projectManagerUacx;
   }

   public void setProjectManagerUacx(String projectManagerUacx) {
      this.projectManagerUacx = projectManagerUacx;
   }
   public String getResponsiblePersonPxrv() {
      return responsiblePersonPxrv;
   }

   public void setResponsiblePersonPxrv(String responsiblePersonPxrv) {
      this.responsiblePersonPxrv = responsiblePersonPxrv;
   }
   public String getDockingProgressEfrx() {
      return dockingProgressEfrx;
   }

   public void setDockingProgressEfrx(String dockingProgressEfrx) {
      this.dockingProgressEfrx = dockingProgressEfrx;
   }
   public java.time.LocalDate getTrackingTimeXfex() {
      return trackingTimeXfex;
   }

   public void setTrackingTimeXfex(java.time.LocalDate trackingTimeXfex) {
      this.trackingTimeXfex = trackingTimeXfex;
   }
}
