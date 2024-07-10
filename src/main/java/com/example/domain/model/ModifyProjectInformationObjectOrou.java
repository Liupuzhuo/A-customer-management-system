package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 修改项目信息对象
 */
public class ModifyProjectInformationObjectOrou {
   /**
    * 项目信息对象
    */
   @JsonProperty("projectInformationObjectOskg")
   private ProjectInformationOlkt projectInformationObjectOskg;
   
   /**
    * 追踪情况信息列表
    */
   @JsonProperty("trackingInformationListRysn")
   private List<TrackingInformationSyzz> trackingInformationListRysn;
   
   public ProjectInformationOlkt getProjectInformationObjectOskg() {
      return projectInformationObjectOskg;
   }

   public void setProjectInformationObjectOskg(ProjectInformationOlkt projectInformationObjectOskg) {
      this.projectInformationObjectOskg = projectInformationObjectOskg;
   }
   public List<TrackingInformationSyzz> getTrackingInformationListRysn() {
      return trackingInformationListRysn;
   }

   public void setTrackingInformationListRysn(List<TrackingInformationSyzz> trackingInformationListRysn) {
      this.trackingInformationListRysn = trackingInformationListRysn;
   }
}
