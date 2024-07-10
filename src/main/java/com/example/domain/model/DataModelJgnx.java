package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据模型1
 */
public class DataModelJgnx {
   /**
    * 负责人
    */
   @JsonProperty("responsiblePersonVvjw")
   private String responsiblePersonVvjw;
   
   /**
    * 任务状态
    */
   @JsonProperty("taskStatusIdji")
   private String taskStatusIdji;
   
   /**
    * 对接进展
    */
   @JsonProperty("dockingProgressUelu")
   private String dockingProgressUelu;
   
   /**
    * 追踪时间
    */
   @JsonProperty("trackingTimeFdhe")
   private java.time.LocalDate trackingTimeFdhe;
   
   /**
    * 工作单id
    */
   @JsonProperty("workOrderIdDveu")
   private Long workOrderIdDveu;
   
   public String getResponsiblePersonVvjw() {
      return responsiblePersonVvjw;
   }

   public void setResponsiblePersonVvjw(String responsiblePersonVvjw) {
      this.responsiblePersonVvjw = responsiblePersonVvjw;
   }
   public String getTaskStatusIdji() {
      return taskStatusIdji;
   }

   public void setTaskStatusIdji(String taskStatusIdji) {
      this.taskStatusIdji = taskStatusIdji;
   }
   public String getDockingProgressUelu() {
      return dockingProgressUelu;
   }

   public void setDockingProgressUelu(String dockingProgressUelu) {
      this.dockingProgressUelu = dockingProgressUelu;
   }
   public java.time.LocalDate getTrackingTimeFdhe() {
      return trackingTimeFdhe;
   }

   public void setTrackingTimeFdhe(java.time.LocalDate trackingTimeFdhe) {
      this.trackingTimeFdhe = trackingTimeFdhe;
   }
   public Long getWorkOrderIdDveu() {
      return workOrderIdDveu;
   }

   public void setWorkOrderIdDveu(Long workOrderIdDveu) {
      this.workOrderIdDveu = workOrderIdDveu;
   }
}
