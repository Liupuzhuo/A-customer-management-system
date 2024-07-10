package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 项目列表查询sql
 */
public class AnonymousModelDataQueryPzvq {
   /**
    * taskState
    */
   @JsonProperty("task_state")
   private String taskState;
   
   /**
    * id
    */
   @JsonProperty("id")
   private Long id;
   
   /**
    * taskType
    */
   @JsonProperty("task_type")
   private String taskType;
   
   /**
    * intentionFeidi
    */
   @JsonProperty("intention_feidi")
   private String intentionFeidi;
   
   /**
    * projectName
    */
   @JsonProperty("project_name")
   private String projectName;
   
   /**
    * manager
    */
   @JsonProperty("manager")
   private String manager;
   
   /**
    * createTime
    */
   @JsonProperty("create_time")
   private java.time.LocalDateTime createTime;
   
   /**
    * remark
    */
   @JsonProperty("remark")
   private String remark;
   
   /**
    * code
    */
   @JsonProperty("code")
   private String code;
   
   /**
    * name
    */
   @JsonProperty("name")
   private String name;
   
   /**
    * type
    */
   @JsonProperty("type")
   private Integer type;
   
   /**
    * 任务类型名称
    */
   @JsonProperty("taskTypeNameWooh")
   private String taskTypeNameWooh;
   
   /**
    * 任务状态名称
    */
   @JsonProperty("taskStatusNameZpnf")
   private String taskStatusNameZpnf;
   
   /**
    * 意向飞地名称
    */
   @JsonProperty("intendedEnclaveNameKotc")
   private String intendedEnclaveNameKotc;
   
   public String getTaskState() {
      return taskState;
   }

   public void setTaskState(String taskState) {
      this.taskState = taskState;
   }
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
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
   public String getProjectName() {
      return projectName;
   }

   public void setProjectName(String projectName) {
      this.projectName = projectName;
   }
   public String getManager() {
      return manager;
   }

   public void setManager(String manager) {
      this.manager = manager;
   }
   public java.time.LocalDateTime getCreateTime() {
      return createTime;
   }

   public void setCreateTime(java.time.LocalDateTime createTime) {
      this.createTime = createTime;
   }
   public String getRemark() {
      return remark;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }
   public String getCode() {
      return code;
   }

   public void setCode(String code) {
      this.code = code;
   }
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   public Integer getType() {
      return type;
   }

   public void setType(Integer type) {
      this.type = type;
   }
   public String getTaskTypeNameWooh() {
      return taskTypeNameWooh;
   }

   public void setTaskTypeNameWooh(String taskTypeNameWooh) {
      this.taskTypeNameWooh = taskTypeNameWooh;
   }
   public String getTaskStatusNameZpnf() {
      return taskStatusNameZpnf;
   }

   public void setTaskStatusNameZpnf(String taskStatusNameZpnf) {
      this.taskStatusNameZpnf = taskStatusNameZpnf;
   }
   public String getIntendedEnclaveNameKotc() {
      return intendedEnclaveNameKotc;
   }

   public void setIntendedEnclaveNameKotc(String intendedEnclaveNameKotc) {
      this.intendedEnclaveNameKotc = intendedEnclaveNameKotc;
   }
}
