package com.example.domain.model;

import java.util.*;
import com.example.domain.entity.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 数据模型
 */
public class DataModelDbos {
   /**
    * id
    */
   @JsonProperty("idDltb")
   private Long idDltb;
   
   /**
    * 数据模型字段
    */
   @JsonProperty("dataModelFieldsHhbb")
   private String dataModelFieldsHhbb;
   
   public Long getIdDltb() {
      return idDltb;
   }

   public void setIdDltb(Long idDltb) {
      this.idDltb = idDltb;
   }
   public String getDataModelFieldsHhbb() {
      return dataModelFieldsHhbb;
   }

   public void setDataModelFieldsHhbb(String dataModelFieldsHhbb) {
      this.dataModelFieldsHhbb = dataModelFieldsHhbb;
   }
}
