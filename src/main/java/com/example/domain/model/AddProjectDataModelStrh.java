package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 新增项目数据模型
 */
public class AddProjectDataModelStrh {
   /**
    * parentInfo
    */
   @JsonProperty("parentinfoYzgp")
   private ProjectModelPbqo parentinfoYzgp;
   
   /**
    * sonInfo
    */
   @JsonProperty("soninfoAgfk")
   private SubtableModelKgjz soninfoAgfk;
   
   public ProjectModelPbqo getParentinfoYzgp() {
      return parentinfoYzgp;
   }

   public void setParentinfoYzgp(ProjectModelPbqo parentinfoYzgp) {
      this.parentinfoYzgp = parentinfoYzgp;
   }
   public SubtableModelKgjz getSoninfoAgfk() {
      return soninfoAgfk;
   }

   public void setSoninfoAgfk(SubtableModelKgjz soninfoAgfk) {
      this.soninfoAgfk = soninfoAgfk;
   }
}
