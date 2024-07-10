package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据模型2
 */
public class DataModelFhru {
   /**
    * 项目信息对象
    */
   @JsonProperty("projectInformationObjectKezb")
   private DataModelZpdx projectInformationObjectKezb;
   
   /**
    * 追踪情况
    */
   @JsonProperty("trackingSituationUaqq")
   private List<DataModelJgnx> trackingSituationUaqq;
   
   public DataModelZpdx getProjectInformationObjectKezb() {
      return projectInformationObjectKezb;
   }

   public void setProjectInformationObjectKezb(DataModelZpdx projectInformationObjectKezb) {
      this.projectInformationObjectKezb = projectInformationObjectKezb;
   }
   public List<DataModelJgnx> getTrackingSituationUaqq() {
      return trackingSituationUaqq;
   }

   public void setTrackingSituationUaqq(List<DataModelJgnx> trackingSituationUaqq) {
      this.trackingSituationUaqq = trackingSituationUaqq;
   }
}
