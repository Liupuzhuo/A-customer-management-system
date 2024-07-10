package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 项目列表返回结构
 */
public class ProjectListReturnStructureMfhd {
   /**
    * 项目名称
    */
   @JsonProperty("entryNameSrqx")
   private String entryNameSrqx;
   
   /**
    * 项目id
    */
   @JsonProperty("projectIdEavm")
   private Long projectIdEavm;
   
   /**
    * 项目经理
    */
   @JsonProperty("projectManagerLmpw")
   private String projectManagerLmpw;
   
   /**
    * 任务类型
    */
   @JsonProperty("taskTypeYxxs")
   private String taskTypeYxxs;
   
   /**
    * 任务类型名称
    */
   @JsonProperty("taskTypeNameAyvc")
   private String taskTypeNameAyvc;
   
   /**
    * 任务状态
    */
   @JsonProperty("taskStatusWbiy")
   private String taskStatusWbiy;
   
   /**
    * 任务状态名称
    */
   @JsonProperty("taskStatusNameZofe")
   private String taskStatusNameZofe;
   
   /**
    * 意向飞地
    */
   @JsonProperty("intendedEnclavePtgv")
   private String intendedEnclavePtgv;
   
   /**
    * 意向飞地名称
    */
   @JsonProperty("intendedEnclaveNameGvne")
   private String intendedEnclaveNameGvne;
   
   /**
    * 备注
    */
   @JsonProperty("remarksJnls")
   private String remarksJnls;
   
   public String getEntryNameSrqx() {
      return entryNameSrqx;
   }

   public void setEntryNameSrqx(String entryNameSrqx) {
      this.entryNameSrqx = entryNameSrqx;
   }
   public Long getProjectIdEavm() {
      return projectIdEavm;
   }

   public void setProjectIdEavm(Long projectIdEavm) {
      this.projectIdEavm = projectIdEavm;
   }
   public String getProjectManagerLmpw() {
      return projectManagerLmpw;
   }

   public void setProjectManagerLmpw(String projectManagerLmpw) {
      this.projectManagerLmpw = projectManagerLmpw;
   }
   public String getTaskTypeYxxs() {
      return taskTypeYxxs;
   }

   public void setTaskTypeYxxs(String taskTypeYxxs) {
      this.taskTypeYxxs = taskTypeYxxs;
   }
   public String getTaskTypeNameAyvc() {
      return taskTypeNameAyvc;
   }

   public void setTaskTypeNameAyvc(String taskTypeNameAyvc) {
      this.taskTypeNameAyvc = taskTypeNameAyvc;
   }
   public String getTaskStatusWbiy() {
      return taskStatusWbiy;
   }

   public void setTaskStatusWbiy(String taskStatusWbiy) {
      this.taskStatusWbiy = taskStatusWbiy;
   }
   public String getTaskStatusNameZofe() {
      return taskStatusNameZofe;
   }

   public void setTaskStatusNameZofe(String taskStatusNameZofe) {
      this.taskStatusNameZofe = taskStatusNameZofe;
   }
   public String getIntendedEnclavePtgv() {
      return intendedEnclavePtgv;
   }

   public void setIntendedEnclavePtgv(String intendedEnclavePtgv) {
      this.intendedEnclavePtgv = intendedEnclavePtgv;
   }
   public String getIntendedEnclaveNameGvne() {
      return intendedEnclaveNameGvne;
   }

   public void setIntendedEnclaveNameGvne(String intendedEnclaveNameGvne) {
      this.intendedEnclaveNameGvne = intendedEnclaveNameGvne;
   }
   public String getRemarksJnls() {
      return remarksJnls;
   }

   public void setRemarksJnls(String remarksJnls) {
      this.remarksJnls = remarksJnls;
   }
}
