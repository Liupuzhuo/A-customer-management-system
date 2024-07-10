package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据查询模型1
 */
public class AnonymousModelDataQueryUxnt {
   /**
    * id
    */
   @JsonProperty("id")
   private Integer id;
   
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
    * taskState
    */
   @JsonProperty("task_state")
   private String taskState;
   
   /**
    * taskType
    */
   @JsonProperty("task_type")
   private String taskType;
   
   /**
    * name
    */
   @JsonProperty("name")
   private String name;
   
   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
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
   public String getTaskState() {
      return taskState;
   }

   public void setTaskState(String taskState) {
      this.taskState = taskState;
   }
   public String getTaskType() {
      return taskType;
   }

   public void setTaskType(String taskType) {
      this.taskType = taskType;
   }
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
