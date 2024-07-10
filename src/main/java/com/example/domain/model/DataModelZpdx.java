package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据模型
 */
public class DataModelZpdx {
   /**
    * 项目名称
    */
   @JsonProperty("entryNameHvxp")
   private String entryNameHvxp;
   
   /**
    * 任务类型
    */
   @JsonProperty("taskTypeMxbe")
   private String taskTypeMxbe;
   
   /**
    * 任务状态
    */
   @JsonProperty("taskStatusDamg")
   private String taskStatusDamg;
   
   /**
    * 意向飞地
    */
   @JsonProperty("intendedEnclaveWehe")
   private String intendedEnclaveWehe;
   
   /**
    * 项目经理
    */
   @JsonProperty("projectManagerBpht")
   private String projectManagerBpht;
   
   /**
    * 备注
    */
   @JsonProperty("remarksMoea")
   private String remarksMoea;
   
   public String getEntryNameHvxp() {
      return entryNameHvxp;
   }

   public void setEntryNameHvxp(String entryNameHvxp) {
      this.entryNameHvxp = entryNameHvxp;
   }
   public String getTaskTypeMxbe() {
      return taskTypeMxbe;
   }

   public void setTaskTypeMxbe(String taskTypeMxbe) {
      this.taskTypeMxbe = taskTypeMxbe;
   }
   public String getTaskStatusDamg() {
      return taskStatusDamg;
   }

   public void setTaskStatusDamg(String taskStatusDamg) {
      this.taskStatusDamg = taskStatusDamg;
   }
   public String getIntendedEnclaveWehe() {
      return intendedEnclaveWehe;
   }

   public void setIntendedEnclaveWehe(String intendedEnclaveWehe) {
      this.intendedEnclaveWehe = intendedEnclaveWehe;
   }
   public String getProjectManagerBpht() {
      return projectManagerBpht;
   }

   public void setProjectManagerBpht(String projectManagerBpht) {
      this.projectManagerBpht = projectManagerBpht;
   }
   public String getRemarksMoea() {
      return remarksMoea;
   }

   public void setRemarksMoea(String remarksMoea) {
      this.remarksMoea = remarksMoea;
   }
}
