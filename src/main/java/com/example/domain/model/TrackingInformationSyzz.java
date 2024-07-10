package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 追踪情况信息
 */
public class TrackingInformationSyzz {
   /**
    * 负责人
    */
   @JsonProperty("responsiblePersonBixf")
   private String responsiblePersonBixf;
   
   /**
    * 任务状态
    */
   @JsonProperty("taskStatusVdal")
   private String taskStatusVdal;
   
   /**
    * 对接进展
    */
   @JsonProperty("dockingProgressQtuz")
   private String dockingProgressQtuz;
   
   /**
    * 追踪时间
    */
   @JsonProperty("trackingTimeBabb")
   private java.time.LocalDate trackingTimeBabb;
   
   /**
    * 追踪情况id
    */
   @JsonProperty("trackingSituationIdRsxs")
   private Long trackingSituationIdRsxs;
   
   /**
    * 项目id
    */
   @JsonProperty("projectIdTjdt")
   private Long projectIdTjdt;
   
   /**
    * 项目id
    */
   @JsonProperty("projectIdFaxb")
   private Long projectIdFaxb;
   
   public String getResponsiblePersonBixf() {
      return responsiblePersonBixf;
   }

   public void setResponsiblePersonBixf(String responsiblePersonBixf) {
      this.responsiblePersonBixf = responsiblePersonBixf;
   }
   public String getTaskStatusVdal() {
      return taskStatusVdal;
   }

   public void setTaskStatusVdal(String taskStatusVdal) {
      this.taskStatusVdal = taskStatusVdal;
   }
   public String getDockingProgressQtuz() {
      return dockingProgressQtuz;
   }

   public void setDockingProgressQtuz(String dockingProgressQtuz) {
      this.dockingProgressQtuz = dockingProgressQtuz;
   }
   public java.time.LocalDate getTrackingTimeBabb() {
      return trackingTimeBabb;
   }

   public void setTrackingTimeBabb(java.time.LocalDate trackingTimeBabb) {
      this.trackingTimeBabb = trackingTimeBabb;
   }
   public Long getTrackingSituationIdRsxs() {
      return trackingSituationIdRsxs;
   }

   public void setTrackingSituationIdRsxs(Long trackingSituationIdRsxs) {
      this.trackingSituationIdRsxs = trackingSituationIdRsxs;
   }
   public Long getProjectIdTjdt() {
      return projectIdTjdt;
   }

   public void setProjectIdTjdt(Long projectIdTjdt) {
      this.projectIdTjdt = projectIdTjdt;
   }
   public Long getProjectIdFaxb() {
      return projectIdFaxb;
   }

   public void setProjectIdFaxb(Long projectIdFaxb) {
      this.projectIdFaxb = projectIdFaxb;
   }
}
